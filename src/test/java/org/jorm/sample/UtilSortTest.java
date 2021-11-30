package org.jorm.sample;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class UtilSortTest {

    @Test
    public void test_empty() {
        String[] input = new String[]{};
        String[] output = new String[]{};
        assertArrayEquals(output, UtilSort.sortValues(input));
    }

    @Test
    public void test_null() {
        String[] output = new String[0];
        assertArrayEquals(output, UtilSort.sortValues(null));
    }

    @Test
    public void test_removeDuplicates() {
        String[] input = new String[]{"A-","A","B+","C-","D","B-","F","A+","C+","D-"};
        String[] output = new String[]{"A+","A","A-","B+","B-","C+","C-","D","D-","F"};
        assertArrayEquals(output, UtilSort.sortValues(input));
    }
}