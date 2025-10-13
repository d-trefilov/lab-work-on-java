package lr1;

import java.util.Scanner;

public class Example10 {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Ваш год рождения: ");
        int yearOfBirth = in.nextInt();

        System.out.printf("Вам %d лет", 2025 - yearOfBirth);
        in.close();

    }
}