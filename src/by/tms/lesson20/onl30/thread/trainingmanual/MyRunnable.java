package by.tms.lesson20.onl30.thread.trainingmanual;

public class MyRunnable /*extends Thread*/ implements Runnable {
//    public MyRunnable(String name) {
//        super(name);
//    }
    @Override
    public void run() {
        for (int i = 1; i < 101; i++) {
            System.out.println(i);
        }
    }
}
