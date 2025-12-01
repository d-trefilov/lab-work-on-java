package lr3;

import java.util.Arrays;
import java.util.Scanner;

public class Example6 {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");

        try {
            int arraySize = in.nextInt();
            if(arraySize <= 0)
            {
                System.out.println("Размер массива должен быть положительным");
                return;
            }

            int[] array = new int[arraySize];

            for (int count = 0; count < arraySize; count++) {
                array[count] = count * 5 + 2;
            }

            System.out.println(Arrays.toString(array));
        }
        catch (Exception e) {
            System.out.println("Ошибка! Необходимо вводить положительное число!");
        }
    }
}
