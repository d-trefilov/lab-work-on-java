package timus.semestr_2;

import java.util.Scanner;

public class timus_1079 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Максимальное значение n по условию
        final int MAX_N = 100000;

        // Массив для хранения последовательности a_i
        int[] a = new int[MAX_N + 1];

        // Заполняем начальные значения
        a[0] = 0;
        a[1] = 1;

        // Заполняем массив для всех i до MAX_N
        for (int i = 1; i <= MAX_N / 2; i++) {
            a[2 * i] = a[i];
            if (2 * i + 1 <= MAX_N) {
                a[2 * i + 1] = a[i] + a[i + 1];
            }
        }

        // Массив для хранения максимальных значений до каждого индекса
        int[] maxValues = new int[MAX_N + 1];
        maxValues[0] = a[0];
        for (int i = 1; i <= MAX_N; i++) {
            maxValues[i] = Math.max(maxValues[i - 1], a[i]);
        }

        // Чтение входных данных
        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            System.out.println(maxValues[n]);
        }

        scanner.close();
    }
}
