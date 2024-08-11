package by.tms.lesson20.onl30.thread.homework;
import java.util.List;
import java.util.Optional;

public class MinValueFinder implements Runnable {
    private final List<Integer> arrayList;
    static String minValue;

    public MinValueFinder(List<Integer> arraylist) {
        this.arrayList = arraylist;
    }

    public static Optional<String> getMin() {
        return Optional.ofNullable(minValue);
    }

    @Override
    public void run() {
        if (!arrayList.isEmpty()) {
            minValue = arrayList.stream().min(Integer::compareTo).get().toString();
        }
    }
}
