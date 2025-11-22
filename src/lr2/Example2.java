package lr2;

import java.util.Scanner;

public class Example2 {

    static void main() {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");

        int x = in.nextInt();

        int remainder5 = x % 5;
        int remainder7 = x % 7;

        if (remainder5 == 2 && remainder7 == 1) {
            System.out.printf("Число %d удовлетворяет условию", x);
        }
        else
        {
            System.out.printf("Число %d не удовлетворяет условию", x);
        }
    }
}
