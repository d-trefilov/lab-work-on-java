package lr11;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Random;
import java.util.ArrayList;

public class Example6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Создаем список целых чисел
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        // Заполняем список 15 случайными числами
        for (int i = 0; i < 15; i++) {
            numbers.add(random.nextInt(100) + 1); // числа от 1 до 100
        }

        System.out.println("Исходный список чисел:");
        System.out.println(numbers);

        System.out.print("\nВведите число-делитель: ");
        int divisor = in.nextInt();

        List<Integer> filteredNumbers = filterDivisibleNumbers(numbers, divisor);

        System.out.println("\nЧисла, которые делятся на " + divisor + " без остатка:");
        if (filteredNumbers.isEmpty()) {
            System.out.println("Таких чисел нет");
        } else {
            System.out.println(filteredNumbers);
        }

        in.close();
    }

    /**
     * Фильтрует список чисел, оставляя только те, которые делятся на заданное число без остатка
     * @param list исходный список целых чисел
     * @param divisor делитель
     * @return новый список чисел, кратных делителю
     */
    public static List<Integer> filterDivisibleNumbers(List<Integer> list, int divisor) {
        // Защита от деления на ноль
        if (divisor == 0) {
            return List.of(); // возвращаем пустой список
        }

        return list.stream()
                .filter(n -> n % divisor == 0)
                .collect(Collectors.toList());
    }
}