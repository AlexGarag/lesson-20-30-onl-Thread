package by.tms.lesson20.onl30.thread;

import by.tms.lesson20.onl30.thread.trainingmanual.Child;
import by.tms.lesson20.onl30.thread.trainingmanual.Counter;
import by.tms.lesson20.onl30.thread.trainingmanual.CounterThread;
import by.tms.lesson20.onl30.thread.trainingmanual.MyRunnable;

public class LauncherTrainingManual {
    public static void main(String[] args) {
//        Задача 1:
//        Используя класс Thread создать поток Child который выводит числа от 1 до 100. В методе
//        main первой строкой вывести в консоль “Поток main начинает свою работу” затем создать
//        объект Child и запустить поток. Затем на последней строке метода main вывести в
//        консоль “Поток main завершает свою работу”. Посмотреть результат и сделать вывод
        System.out.println("\"Задача 1\"");
        System.out.println("Поток main начинает свою работу");
        Child child = new Child("child");
        child.start();
        try {
            child.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Поток main завершает свою работу");

//        Задача 2:
//        С помощью метода join() изменить предыдущий код таким образом, чтобы надпись “Поток
//        main завершает свою работу” всегда была последней
        System.out.println("\n\"Задача 2\"");
        System.out.println("Поток main начинает свою работу");

        Child child1 = new Child("child1");
        child1.start();

        try {
            child1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println("Поток main завершает свою работу");

////        Задача 3:
////        Переписать предыдущий код используя интерфейс Runnable
        System.out.println("\n\"Задача 3\"");
        System.out.println("Поток main начинает свою работу");
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Поток main завершает свою работу");

//        Задача 4:
//        Создать класс Counter с полем count и методом increase() который увеличивает count на
//        1. Создать второй класс CounterThread с интерфейсом Runnable, полем Counter и
//        конструктором, который инициализирует поле Counter. Метод run() должен иметь
//        следующую логику:
//        @Override
//        public void run() {
//            counter.setCount(1);
//            for (int i = 0; i < 4; i++) {
//                System.out.println(counter.getCount());
//                counter.increase();
//            }
//        }
//        В main методе создать объект Counter. Создать 5 потоков которые будут использовать в
//        конструкторе объект Counter. Запустить все 5 потоков и посмотреть результат. Исправить
//        код чтобы он выводил ожидаемый результат(1,2,3,4,1,2,3,4,1 и тд)
        System.out.println("\n\"Задача 4\"");
        System.out.println("Поток main начинает свою работу");
        Counter counter = new Counter();
        CounterThread counterThread = new CounterThread(counter);
        Thread thread0 = new Thread(counterThread);
        Thread thread1 = new Thread(counterThread);
        Thread thread2 = new Thread(counterThread);
        Thread thread3 = new Thread(counterThread);
        Thread thread4 = new Thread(counterThread);
        thread0.start();
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        try {
            thread0.join();
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Поток main завершает свою работу");
    }
}