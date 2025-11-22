package lr2;

import java.util.Scanner;

public class Example5 {
    static void main() {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");

        int x = in.nextInt();
        int result = x / 1000;

        System.out.printf("Число %d содердит в себе количество тысяч: %d", x, result);
    }
}
