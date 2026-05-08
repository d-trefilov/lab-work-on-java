package timus.semestr_2;

import java.util.Scanner;

public class timus_1083 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Читаем строку ввода
        String input = scanner.nextLine();

        // Разделяем на части: число и знаки !
        String[] parts = input.split(" ");

        // Первая часть - число n
        int n = Integer.parseInt(parts[0]);

        // Вторая часть - строка из k восклицательных знаков
        String exclamations = parts[1];
        int k = exclamations.length();

        // Вычисляем результат
        long result = 1;

        // Начинаем с n и вычитаем k на каждом шаге
        int current = n;
        while (current > 0) {
            result *= current;
            current -= k;
        }

        System.out.println(result);

        scanner.close();
    }
}
