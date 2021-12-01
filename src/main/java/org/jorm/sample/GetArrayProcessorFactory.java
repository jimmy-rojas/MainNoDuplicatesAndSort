package org.jorm.sample;

public class GetArrayProcessorFactory {

    public AbstractArrayProcessor getProcessor(Object[] values) throws Exception {
        if (values instanceof String[]) {
            //TODO: here we can eval more String[] options
            return new LetterGradeProcessor((String[]) values);
        } else if (values instanceof Integer[]) {
            return new IntegerProcessor((Integer[]) values);
        }
        throw new Exception("Unknown Type");
    }
}