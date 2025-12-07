package lr3;

import java.util.Arrays;
import java.util.Scanner;

public class Example9 {
    static void main(String[] args) {

        int number = (int)(Math.random() * 100);
        int[] array = new int[number];

        // Создание массива
        int i = 0;
        while (i < array.length)
        {
            array[i] = (int)(Math.random() * 100);
            i++;
        }

        // Поиск минимального значения
        int min = array[0];
        for (int count = 0; count < array.length; count++)
        {
            if (min > array[count])
            {
                min = array[count];
            }
        }

        // Поиск индексов
        StringBuilder sb = new StringBuilder();
        for (int count = 0; count < array.length; count++)
        {
            if (min == array[count])
            {
                sb.append(" " + count);
            }
        }

        System.out.printf("Массив : %s \nМинимальное значение: %d. Индексы минимальных значений: %s",
                Arrays.toString(array), min, sb);
    }
}
