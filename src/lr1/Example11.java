package lr1;

import java.util.Scanner;

public class Example11 {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = in.nextLine();

        System.out.println("Ваш год рождения: ");
        int yearOfBirth = in.nextInt();

        System.out.printf("%s, вам %d лет", name, 2025 - yearOfBirth);
        in.close();

    }
}