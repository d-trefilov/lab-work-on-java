package lr2;

import java.util.Scanner;

public class Example1
{
    static void main() {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");

        int x = in.nextInt();
        int div = 3;

        int remainder = x % 3;
        int result = x / 3;

        if (remainder == 0) {
            System.out.printf("Число %d делится на %d без остатка и равняется %d", x, div, result);
        }
        else
        {
            System.out.printf("Число %d не делится на %d без остатка", x, div);
        }
    }
}
