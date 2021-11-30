package org.jorm.sample;

import org.junit.Assert;
import org.junit.Test;

public class UtilSortTest {

    @Test
    public void test_removeDuplicates() {
        String[] input = new String[]{"A-","A","B+","C-","D","B-","F","A+","C+","D-"};
        String[] output = new String[]{"A+","A","A-","B+","B-","C+","C-","D","D-","F"};
        Assert.assertEquals(output, UtilSort.sortValues(input));
    }
}