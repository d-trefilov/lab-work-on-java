package lr1;

import java.util.Scanner;

public class Example7 {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = in.nextLine();

        System.out.println("Введите возраст: ");
        int age = in.nextInt();

        System.out.printf("Ваше имя: %s \nВаш возраст: %d", name, age);
        in.close();

    }
}
