package org.jorm.sample;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class UtilDuplicates {

    private UtilDuplicates() {}

    public static String[] removeDuplicates(String[] input) {
        if (input == null) {
            return new String[0];
        }
        Set<String> inputConverted = new LinkedHashSet<>(Arrays.asList(input));
        return inputConverted.toArray(new String[0]);
    }
}
