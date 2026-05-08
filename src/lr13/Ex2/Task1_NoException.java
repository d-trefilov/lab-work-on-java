package lr13.Ex2;

import java.util.Scanner;

public class Task1_NoException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

        System.out.println("Среднее: " + (sum / count));
    }
}