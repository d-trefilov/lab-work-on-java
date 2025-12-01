package lr3;

import java.util.Arrays;

public class Example8 {
    static void main(String[] args) {

        int arraySize = 10;
        String str = "AEIOUY";
        char[] array = new char[arraySize];

        int i = 0;
        int count = 0;
        while (i < arraySize)
        {
            char let = (char)('A' + count);
            if (!str.contains(Character.toString(let)))
            {
                array[i] = let;
                i++;
            }
            count++;
        }

        System.out.println(Arrays.toString(array));
    }
}
