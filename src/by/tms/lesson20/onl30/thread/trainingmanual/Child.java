package by.tms.lesson20.onl30.thread.trainingmanual;

public class Child extends Thread {
    public Child(String name){
        super(name);
    }

    public void run() {
        for (int i = 1; i < 101; i++) {
            System.out.println(i);
        }
    }

}
