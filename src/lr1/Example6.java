package lr1;

import java.util.Scanner;

public class Example6 {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите фамилию: ");
        String lastName = in.nextLine();

        System.out.println("Введите имя: ");
        String firstName = in.nextLine();

        System.out.println("Введите отчество: ");
        String surName = in.nextLine();

        System.out.printf("Hello %s %s %s", lastName, firstName, surName + "!");
        in.close();

    }
}
