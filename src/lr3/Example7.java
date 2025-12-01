package lr3;

import java.util.Arrays;

public class Example7 {
    static void main(String[] args) {

        int arraySize = 10;

        char[] array = new char[arraySize];

        for (int count = 0; count < arraySize; count++) {
            array[count] = (char)('a' + (count)*2);
        }

        char[] arrayReverse = new char[arraySize];
        int i = 0;
        while (i < arraySize)
        {
            arrayReverse[i] = array[arraySize-1-i];
            i++;
        }

        System.out.printf("Массив: %s \nОбратный массив: %s", Arrays.toString(array), Arrays.toString(arrayReverse));
    }
}
