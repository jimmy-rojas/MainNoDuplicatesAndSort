package org.jorm.sample;

import org.junit.Assert;
import org.junit.Test;

public class UtilDuplicatesTest {

    @Test
    public void test_removeDuplicates() {
        String[] input = new String[]{"A-","A","A-","B+","A","C-","D","B+","B-","A","F","A+","C+","F","D-","F","B+","A"};
        String[] output = new String[]{"A-","A","B+","C-","D","B-","F","A+","C+","D-"};
        Assert.assertEquals(output, UtilDuplicates.removeDuplicates(input));
    }
}