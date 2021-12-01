package org.jorm.sample;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] input = new String[]{"A-","A","A-","B+","A","C-","D","B+","B-","A","F","A+","C+","F","D-","F","B+","A"};
        //Step 1: Remove duplicates and print the result
        GetArrayProcessorFactory processorFactory = new GetArrayProcessorFactory();
        AbstractArrayProcessor processor = processorFactory.getProcessor(input);
        Object[] output = processor.getNoDuplicates();
        System.out.println(Arrays.toString(output));
        //System.out.println(output);
        //Expected output: "A-","A","B+","C-","D","B-","F","A+","C+","D-"

        //Step 2: Sort the array (after duplicates are removed) in U.S. letter-grade order and print the result.
        //It is in order of the letters, and also in order from + to -.
        //For example, A+, A, A-, B+,B,B-,C+,C,C-, D+,D,D-,F+,F,F-
        Object[] outputNew = processor.getSorted(output);

        System.out.println(Arrays.toString(outputNew));
        //System.out.println(outputNew);
        //Expected output: "A+","A","A-","B+","B-","C+","C-","D","D-","F"

        /* In addition this support more types
         */
        Integer[] inputInt = new Integer[]{1,3,5,6,8,9,2,7,4,1,3,5,6,8,9,2,7,4};
        AbstractArrayProcessor processorInt = processorFactory.getProcessor(inputInt);
        Object[] outputInt = processorInt.getNoDuplicates();
        System.out.println(Arrays.toString(outputInt));
        //expected: [1, 3, 5, 6, 8, 9, 2, 7, 4]

        Object[] outputIntNew = processorInt.getSorted(outputInt);
        System.out.println(Arrays.toString(outputIntNew));
        //expected: [1, 2, 3, 4, 5, 6, 7, 8, 9]
    }
}
