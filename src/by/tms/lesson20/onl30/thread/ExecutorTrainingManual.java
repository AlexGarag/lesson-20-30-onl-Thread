package by.tms.lesson20.onl30.thread;

import by.tms.lesson20.onl30.thread.trainingmanual.Child;

public class ExecutorTrainingManual {
    public static void main(String[] args) {
//        Задача 1:
//        Используя класс Thread создать поток Child который выводит числа от 1 до 100. В методе
//        main первой строкой вывести в консоль “Поток main начинает свою работу” затем создать
//        объект Child и запустить поток. Затем на последней строке метода main вывести в
//        консоль “Поток main завершает свою работу”. Посмотреть результат и сделать вывод
//        System.out.println("Задача 1");
//        System.out.println("Поток main начинает свою работу");
//        Child child = new Child("child");
//        child.start();
//        System.out.println("Поток main завершает свою работу");

//        Задача 2:
//        С помощью метода join() изменить предыдущий код таким образом, чтобы надпись “Поток
//        main завершает свою работу” всегда была последней
        System.out.println("\nЗадача 2");
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

    }
}