package lr13.Ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1_WithException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Введите размер массива: ");
            int n = sc.nextInt();

            int[] arr = new int[n];
            int sum = 0, count = 0;

            System.out.println("Введите элементы:");

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] > 0) {
                    sum += arr[i];
                    count++;
                }
            }

            if (count == 0) {
                throw new ArithmeticException("Нет положительных элементов");
            }

            System.out.println("Среднее значение: " + ((double) sum / count));

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено не число");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            System.out.println("Программа завершена");
        }
    }
}
