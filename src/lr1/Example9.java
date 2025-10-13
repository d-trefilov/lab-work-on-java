package lr1;

import java.util.Scanner;

public class Example9 {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите название месяца: ");
        String month = in.nextLine();

        System.out.println("Введите количество дней в месяце: ");
        int numberOfDays = in.nextInt();

        System.out.printf("%s содержит %d дней",  month, numberOfDays);
        in.close();

    }
}