package lr2;

import java.util.Scanner;

public class Example4 {
    static void main() {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");

        int x = in.nextInt();

        if (x >= 5 && x <= 10) {
            System.out.printf("Число %d удовлетворяет условию", x);
        }
        else
        {
            System.out.printf("Число %d не удовлетворяет условию", x);
        }
    }
}
