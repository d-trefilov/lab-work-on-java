package lr11;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Random;

public class Example10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Создаем список целых чисел
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        // Заполняем список 20 случайными числами от -50 до 100
        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(151) - 50); // от -50 до 100
        }

        System.out.println("Исходный список чисел:");
        System.out.println(numbers);

        System.out.print("\nВведите пороговое значение: ");
        int threshold = in.nextInt();

        List<Integer> filteredNumbers = filterLessThan(numbers, threshold);

        System.out.println("\nЧисла, которые меньше " + threshold + ":");
        if (filteredNumbers.isEmpty()) {
            System.out.println("Таких чисел нет");
        } else {
            System.out.println(filteredNumbers);
            System.out.println("Количество чисел: " + filteredNumbers.size());
        }

        in.close();
    }

    /**
     * Фильтрует список чисел, оставляя только те, которые меньше заданного значения
     * @param list исходный список целых чисел
     * @param threshold пороговое значение
     * @return новый список чисел, меньших чем threshold
     */
    public static List<Integer> filterLessThan(List<Integer> list, int threshold) {
        return list.stream()
                .filter(n -> n < threshold)
                .collect(Collectors.toList());
    }
}