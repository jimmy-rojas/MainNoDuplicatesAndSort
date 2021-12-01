# MainNoDuplicatesAndSort

This project is to solve 2 required tasks in java

Type of solution: Maven Java Project

### Prerequisites

Have installed JDK and maven

```sh
$ java -version
openjdk version "11.0.11" 2021-04-20
```

```sh
$ mvn -v
Apache Maven 3.6.3
```

### Testing
junit is used to perform testing, version 4.13

In order to run unit tests just execute
```sh
$ mvn test
```

#### Exercise Announcement 
```sh
import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
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
```