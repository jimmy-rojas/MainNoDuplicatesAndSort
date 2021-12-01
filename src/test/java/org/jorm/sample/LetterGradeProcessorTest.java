package org.jorm.sample;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class LetterGradeProcessorTest  {

    private LetterGradeProcessor instance;
    @Test
    public void test_removeDuplicates_empty() {
        String[] input = new String[]{};
        String[] output = new String[]{};

        instance = new LetterGradeProcessor(input);
        assertArrayEquals(output, instance.getNoDuplicates());
    }

    @Test
    public void test_removeDuplicates_null() {
        String[] output = new String[0];

        instance = new LetterGradeProcessor(null);
        assertArrayEquals(output, instance.getNoDuplicates());
    }

    @Test
    public void test_removeDuplicates() {
        String[] input = new String[]{"A-","A","A-","B+","A","C-","D","B+","B-","A","F","A+","C+","F","D-","F","B+","A"};
        String[] output = new String[]{"A-","A","B+","C-","D","B-","F","A+","C+","D-"};

        instance = new LetterGradeProcessor(input);
        assertArrayEquals(output, instance.getNoDuplicates());
    }

    @Test
    public void test_sort_empty() {
        String[] input = new String[]{};
        String[] output = new String[]{};

        instance = new LetterGradeProcessor(input);
        assertArrayEquals(output, instance.getSorted());
    }

    @Test
    public void test_sort_null() {
        String[] output = new String[0];

        instance = new LetterGradeProcessor(null);
        assertArrayEquals(output, instance.getSorted());
    }

    @Test
    public void test_sort() {
        String[] input = new String[]{"A-","A","B+","C-","D","B-","F","A+","C+","D-"};
        String[] output = new String[]{"A+","A","A-","B+","B-","C+","C-","D","D-","F"};

        instance = new LetterGradeProcessor(input);
        assertArrayEquals(output, instance.getSorted());
    }
}