package by.tms.lesson20.onl30.thread;

public class ExecutorTrainingManual {
    public static void main(String[] args) {
//        Задача 1:
//        Используя класс Thread создать поток Child который выводит числа от 1 до 100. В методе
//        main первой строкой вывести в консоль “Поток main начинает свою работу” затем создать
//        объект Child и запустить поток. Затем на последней строке метода main вывести в
//        консоль “Поток main завершает свою работу”. Посмотреть результат и сделать вывод
        System.out.println("Поток main начинает свою работу");
        Thread child = new Thread(() -> {
            for (int i = 1; i < 101; i++) {
                System.out.println(i);
            }
        });
        child.start();
        System.out.println("Поток main завершает свою работу");

//        Задача 2:
//        С помощью метода join() изменить предыдущий код таким образом, чтобы надпись “Поток
//        main завершает свою работу” всегда была последней


    }
}