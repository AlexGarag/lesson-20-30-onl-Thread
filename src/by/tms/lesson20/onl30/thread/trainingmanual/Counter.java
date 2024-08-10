package by.tms.lesson20.onl30.thread.trainingmanual;

public class Counter {
    private int count = 0;

    public int increase() {
        return count++;
    }

    public void setCount(int i) {
        count = i;
    }

    public int getCount() {
        return count;
    }
}
