package by.tms.lesson20.onl30.thread.homework;

import java.util.List;
import java.util.Optional;

public class MaxValueFinder implements Runnable {
    private final List<Integer> arrayList;
    static String maxValue;

    public MaxValueFinder(List<Integer> arraylist) {
        this.arrayList = arraylist;
    }

    public static Optional<String> getMax() {
        return Optional.ofNullable(maxValue);
    }

    @Override
    public void run() {
        if (!arrayList.isEmpty()) {
            maxValue = arrayList.stream().max(Integer::compareTo).get().toString();
        }
    }
}
