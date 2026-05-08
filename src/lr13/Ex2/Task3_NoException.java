package lr13.Ex2;

import java.util.Scanner;

public class Task3_NoException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte[] arr = new byte[5];
        int sum = 0;

        System.out.println("Введите элементы:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextByte();
            sum += arr[i];
        }

        System.out.println("Сумма: " + sum);
    }
}
