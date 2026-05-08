package lr13.Ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3_WithException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            byte[] arr = new byte[5];
            int sum = 0;

            System.out.println("Введите элементы:");

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextByte();

                sum = Math.addExact(sum, arr[i]); // контроль переполнения
            }

            System.out.println("Сумма: " + sum);

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: введено не число");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: переполнение диапазона");
        } finally {
            System.out.println("Программа завершена");
        }
    }
}
