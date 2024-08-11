package by.tms.lesson20.onl30.thread.homework;

import static java.lang.Thread.currentThread;
import static java.util.Arrays.stream;

public class ManagerThreads {
    public static void startThread(Thread... threads) {
        stream(threads).forEach(Thread::start);
    }

    public static void joinThread(Thread... threads) {
        stream(threads).forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                currentThread().interrupt();
            }
        });
    }
}
