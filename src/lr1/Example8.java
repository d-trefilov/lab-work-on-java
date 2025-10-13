package lr1;

import java.util.Scanner;

public class Example8 {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите день недели: ");
        String dayOfWeek = in.nextLine();

        System.out.println("Введите название месяца: ");
        String month = in.nextLine();

        System.out.println("Введите дату(номер дня в месяце): ");
        int day = in.nextInt();

        System.out.printf("%s %d %s", dayOfWeek, day, month);
        in.close();

    }
}
