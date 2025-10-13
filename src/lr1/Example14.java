package lr1;

import java.util.Scanner;

public class Example14 {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int num2 = in.nextInt();
        int num1 = num2 - 1;
        int num3 = num2 + 1;
        double num4 = Math.pow((num1 + num2 + num3), 2);

        System.out.printf("Ответ: %d; %d; %d; %f;", num1, num2, num3, num4);
        in.close();

    }
}