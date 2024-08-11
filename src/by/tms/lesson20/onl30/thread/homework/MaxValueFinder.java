package by.tms.lesson20.onl30.thread.homework;

import java.util.List;

public class MaxValueFinder implements Runnable {
    private final List<Integer> arrayList;

    public MaxValueFinder(List<Integer> arraylist) {
        this.arrayList = arraylist;
    }

    @Override
    public void run() {
        int maxValue = arrayList.stream().max(Integer::compareTo).get();
        System.out.printf("The maximum value of the array: %d\n", maxValue);
    }
}
