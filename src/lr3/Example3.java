package lr3;

import java.util.Arrays;
import java.util.Scanner;

public class Example3 {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");

        int digit = in.nextInt();

        int[] fibonacciSequence1 = new int [digit];
        int[] fibonacciSequence2 = new int [digit];

        // С использованием while (Вариант 1)
        int count1 = 0;
        while (count1 != digit)
        {
            if (count1 < 2)
            {
                fibonacciSequence1[count1] = 1;
            }
            else
            {
                fibonacciSequence1[count1] = fibonacciSequence1[count1 - 2] + fibonacciSequence1[count1 - 1];
            }
            count1++;
        }
        System.out.println(Arrays.toString(fibonacciSequence1));


        // С использованием for (Вариант 2)
        for (int count2 = 0; count2 != digit; count2++)
        {
            if (count2 < 2)
            {
                fibonacciSequence2[count2] = 1;
            }
            else
            {
                fibonacciSequence2[count2] = fibonacciSequence2[count2 - 2] + fibonacciSequence2[count2 - 1];
            }
        }

        System.out.println(Arrays.toString(fibonacciSequence2));

    }
}
