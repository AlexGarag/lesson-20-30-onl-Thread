package by.tms.lesson20.onl30.thread;

import by.tms.lesson20.onl30.thread.homework.MaxValueFinder;
import by.tms.lesson20.onl30.thread.homework.MinValueFinder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LauncherHomeWork {
    static final String DATA_ENTRY_SUGGESTION_FOR_ARRAY = "Enter the numbers sequentially. To stop typing, enter any letter";

    public static void main(String[] args) {
//        Задача 1:
//        Пользователь вводит с клавиатуры значение в массив. После чего запускаются два
//        потока. Первый поток находит максимум в массиве, второй — минимум. Результаты
//        вычислений возвращаются в метод main()
        System.out.println("\"Task 1\"");
        System.out.println(DATA_ENTRY_SUGGESTION_FOR_ARRAY);
        Scanner scanner = new Scanner(System.in);

        List<Integer> arrayList = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (isNotNumber(input)) {
                break;
            }
            arrayList.add(Integer.valueOf(input));
        }
        MaxValueFinder findMaxValue = new MaxValueFinder(new ArrayList<>(arrayList));
        Thread threadFindMax = new Thread(findMaxValue);
        MinValueFinder findMinValue = new MinValueFinder(new ArrayList<>(arrayList));
        Thread threadFindMin = new Thread(findMinValue);
        threadFindMax.start();
        threadFindMin.start();
        try {
            threadFindMax.join();
            threadFindMin.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("\"Task 1\" is solved");

    }

    private static boolean isNotNumber(String stringAsNumber) {
        try {
            Integer.valueOf(stringAsNumber);
        } catch (Exception e) {
            return true;
        }
        return false;
    }
}