package timus.semestr_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class timus_1086 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Читаем количество чисел
        int k = scanner.nextInt();

        // Читаем все n
        int[] indices = new int[k];
        int maxN = 0;
        for (int i = 0; i < k; i++) {
            indices[i] = scanner.nextInt();
            if (indices[i] > maxN) {
                maxN = indices[i];
            }
        }

        // Находим все простые числа до необходимого количества
        List<Integer> primes = findPrimesUpToNth(maxN);

        // Выводим результаты
        for (int n : indices) {
            System.out.println(primes.get(n - 1)); // n-е простое число (индексация с 0)
        }

        scanner.close();
    }

    private static List<Integer> findPrimesUpToNth(int nth) {
        List<Integer> primes = new ArrayList<>();

        if (nth == 0) {
            return primes;
        }

        // Начинаем проверку с 2
        int candidate = 2;

        while (primes.size() < nth) {
            if (isPrime(candidate)) {
                primes.add(candidate);
            }
            candidate++;
        }

        return primes;
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }

        // Проверяем делители до sqrt(num)
        int limit = (int) Math.sqrt(num);
        for (int i = 3; i <= limit; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
