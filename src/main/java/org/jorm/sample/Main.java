package org.jorm.sample;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] input = new String[]{"A-","A","A-","B+","A","C-","D","B+","B-","A","F","A+","C+","F","D-","F","B+","A"};
        //Step 1: Remove duplicates and print the result
        String[] output = UtilDuplicates.removeDuplicates(input);
        System.out.println(Arrays.toString(output));
//        System.out.println(output);
        //Expected output: "A-","A","B+","C-","D","B-","F","A+","C+","D-"

        //Step 2: Sort the array (after duplicates are removed) in U.S. letter-grade order and print the result.
        //It is in order of the letters, and also in order from + to -.
        //For example, A+, A, A-, B+,B,B-,C+,C,C-, D+,D,D-,F+,F,F-
        String[] outputNew = UtilSort.sortValues(output);

        System.out.println(Arrays.toString(outputNew));
//        System.out.println(outputNew);
        //Expected output: "A+","A","A-","B+","B-","C+","C-","D","D-","F"
    }
}
