package lr1;

import java.util.Scanner;

public class Example12 {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите Ваш возраст: ");
        int age = in.nextInt();

        System.out.printf("Вы родились в %d", 2025 - age);
        in.close();

    }
}