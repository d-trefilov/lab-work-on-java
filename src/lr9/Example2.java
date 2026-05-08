package lr9;

import java.util.Scanner;

public class Example2 {

    public static void convertToBin(int number)
    {
        if (number > 1)
        {
            convertToBin(number / 2);
        }
        System.out.print(number % 2);
    }

    static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        System.out.print("Двоичное представление числа: ");
        convertToBin(number);

        scanner.close();
    }
}
