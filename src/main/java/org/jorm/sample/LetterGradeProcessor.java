package org.jorm.sample;

import java.util.Arrays;

public class LetterGradeProcessor extends AbstractArrayProcessor<String> {

    public LetterGradeProcessor(String[] values) {
        super(values);
    }

    @Override
    protected String[] obtainSorted(Object[] input) {
        if (input == null || input.length == 0) {
            return new String[0];
        }
        LetterGrade[] inputConverted = convertToLetterGrade(input);
        Arrays.sort(inputConverted);
        return convertToString(inputConverted);
    }

    private LetterGrade[] convertToLetterGrade(Object[] input) {
        LetterGrade[] letterGrades = new LetterGrade[input.length];
        for (int i = 0; i < input.length ; i++) {
            letterGrades[i] = new LetterGrade(String.valueOf(input[i]));
        }
        return letterGrades;
    }

    private String[] convertToString(LetterGrade[] inputConverted) {
        String[] strings = new String[inputConverted.length];
        for (int i = 0; i < inputConverted.length ; i++) {
            strings[i] = inputConverted[i].toString();
        }
        return strings;
    }

    public static class LetterGrade implements Comparable<LetterGrade> {
        private char letter;
        private String sign;
        private int grade;

        public LetterGrade(String letterGrade) {
            this.letter = letterGrade.charAt(0);
            if (letterGrade.length() == 1) {
                this.sign = "";
                this.grade = 0;
            } else {
                this.sign = String.valueOf(letterGrade.charAt(1));
                this.grade = this.sign.equals("+") ? -1 : 1;
            }
        }

        @Override
        public int compareTo(LetterGrade o) {
            return this.letter == o.letter ? this.grade - o.grade : this.letter - o.letter;
        }

        @Override
        public String toString() {
            return String.format("%s%s", this.letter, this.sign);
        }
    }
}
