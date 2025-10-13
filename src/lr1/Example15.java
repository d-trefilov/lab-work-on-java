package lr1;

import java.util.Scanner;

public class Example15 {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число 1: ");
        int num1 = in.nextInt();

        System.out.println("Введите число 2: ");
        int num2 = in.nextInt();

        System.out.printf(
                "Сумма чисел: %d \n" +
                "Разность чисел: %d", num1 + num2, num1 - num2);
        in.close();

    }
}