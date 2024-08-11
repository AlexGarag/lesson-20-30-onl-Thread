package by.tms.lesson20.onl30.thread.homework;

import java.util.List;

public class MinValueFinder implements Runnable {
    private final List<Integer> arrayList;

    public MinValueFinder(List<Integer> arraylist) {
        this.arrayList = arraylist;
    }

    @Override
    public void run() {
        int minValue = arrayList.stream().min(Integer::compareTo).get();
        System.out.printf("The minimum value of the array: %d\n", minValue);
    }
}
