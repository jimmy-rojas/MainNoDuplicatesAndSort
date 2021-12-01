package org.jorm.sample;

import java.util.*;

public abstract class AbstractArrayProcessor<T> {

    private Map<STATES, T[]> stateMap;

    protected AbstractArrayProcessor(T[] values) {
        this.stateMap = new HashMap<>();
        this.stateMap.put(STATES.ORIGINAL, values);
    }

    public T[] getOriginal() {
        return this.stateMap.get(STATES.ORIGINAL);
    }

    public T[] getNoDuplicates() {
        if (!this.stateMap.containsKey(STATES.NO_DUPLICATED)) {
            this.stateMap.put(STATES.NO_DUPLICATED, removeDuplicates(getOriginal()));
        }
        return this.stateMap.get(STATES.NO_DUPLICATED);
    }

    public T[] getSorted() {
        return this.getSorted(getNoDuplicates());
    }

    public T[] getSorted(Object[] input) {
        if (input == null || input.length == 0) {
            return (T[]) new Object[0];
        }
        if (!this.stateMap.containsKey(STATES.SORTED)) {
            this.stateMap.put(STATES.SORTED, obtainSorted(getNoDuplicates()));
        }
        return this.stateMap.get(STATES.SORTED);
    }

    protected T[] obtainSorted(Object[] input) {
        if (input == null || input.length == 0) {
            return (T[]) new Object[0];
        }
        Arrays.sort(input);
        return (T[]) input;
    }

    protected T[] removeDuplicates(T[] input) {
        if (input == null) {
            return (T[]) new Object[0];
        }
        Set<T> inputConverted = new LinkedHashSet<>(Arrays.asList(input));
        return (T[]) inputConverted.toArray(new Object[0]);
    }

    enum STATES {
        ORIGINAL,
        NO_DUPLICATED,
        SORTED
    }
}
