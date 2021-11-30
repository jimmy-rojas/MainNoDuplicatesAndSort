package org.jorm.sample;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class UtilDuplicatesTest {

    @Test
    public void test_removeDuplicates_empty() {
        String[] input = new String[]{};
        String[] output = new String[]{};
        assertArrayEquals(output, UtilDuplicates.removeDuplicates(input));
    }

    @Test
    public void test_removeDuplicates_null() {
        String[] output = new String[0];
        assertArrayEquals(output, UtilDuplicates.removeDuplicates(null));
    }

    @Test
    public void test_removeDuplicates() {
        String[] input = new String[]{"A-","A","A-","B+","A","C-","D","B+","B-","A","F","A+","C+","F","D-","F","B+","A"};
        String[] output = new String[]{"A-","A","B+","C-","D","B-","F","A+","C+","D-"};
        assertArrayEquals(output, UtilDuplicates.removeDuplicates(input));
    }
}