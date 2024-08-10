package by.tms.lesson20.onl30.thread.trainingmanual;

public class CounterThread implements Runnable {
    Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.setCount(1);
        for (int i = 0; i < 4; i++) {
            System.out.println(counter.getCount());
            counter.increase();
        }
    }
}
