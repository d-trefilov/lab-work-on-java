package lr3;

import java.util.Arrays;
import java.util.Scanner;

public class Example5 {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа через пробел");

        String[] strArr = in.nextLine().split(" ");

        boolean firstOption = true;

        int sum = 0;
        String str;
        String numbers = "";
        int dig;

        if (firstOption) {
            for (int count = 0; count != strArr.length; count++) {
                str = strArr[count];
                dig = Integer.parseInt(str);
                if (dig % 5 == 2 || dig % 3 == 1) {
                    numbers = (numbers + " " + str);
                    sum += dig;
                }
            }
        }
        else
        {
            int count = 0;
            while (count != strArr.length)
            {
                str = strArr[count];
                dig = Integer.parseInt(str);
                if (dig % 5 == 2 || dig % 3 == 1)
                {
                    numbers = (numbers + " " + str);
                    sum += dig;
                }
                count++;
            }
        }

        System.out.printf("Сумма чисел: \n %s \n составляет: %d", numbers, sum);
    }
}
