package lr3;

import java.util.Arrays;
import java.util.Scanner;

public class Example4 {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число 1");
        int num1 = in.nextInt();
        System.out.println("Введите число 2");
        int num2 = in.nextInt();

        int max;
        int min;

        if (num1 >= num2)
        {
            max = num1;
            min = num2;
        }
        else
        {
            max = num2;
            min = num1;
        }

        // С использованием while (Вариант 1)
        int dig1 = min;
        while (dig1 <= max)
        {
            System.out.println(dig1);
            dig1++;
        }

        // С использованием for (Вариант 2)
        int dig2 = min;
        int len = max - min + 1;
        int[] sequence = new int[len];
        for (int count = 0; count != len; count++)
        {
            sequence[count] = dig2;
            dig2++;
        }

        System.out.println(Arrays.toString(sequence));


    }
}
