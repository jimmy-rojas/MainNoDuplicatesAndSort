package org.jorm.sample;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class UtilDuplicates {
    public static String[] removeDuplicates(String[] input) {
        Set<String> inputConverted = new LinkedHashSet<>(Arrays.asList(input));
        return inputConverted.toArray(new String[0]);
    }
}
