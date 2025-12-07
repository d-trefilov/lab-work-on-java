package lr3;

import java.util.Arrays;

public class Example10 {
    static void main(String[] args) {

        int arraySize = (int)(Math.random() * 100);
        int[] array = new int[arraySize];

        // Создание массива
        int count = 0;
        while (count < array.length)
        {
            array[count] = (int)(Math.random() * 100);
            count++;
        }

        // Создание массива для сортировки
        int[] arraySorted = new int[arraySize];
        for (int i = 0; i < arraySize; i++)
        {
            arraySorted[i] = array[i];
        }

        // Сортировка от большого к малому
        int tempNumber;
        for (int i = 0; i < arraySorted.length - 1; i++)
        {
            for (int j = 0; j < arraySorted.length - 1; j++)
            {
                if (arraySorted[j] < arraySorted[j + 1]) {
                    tempNumber = arraySorted[j];
                    arraySorted[j] = arraySorted[j + 1];
                    arraySorted[j + 1] = tempNumber;
                }
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arraySorted));
    }
}
