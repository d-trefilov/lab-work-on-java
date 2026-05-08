package lr6;

//public class Example10 {
//
//    // Статический метод, возвращающий массив из двух элементов: [максимум, минимум]
//    public static int[] minMax(int... numbers) {
//        if (numbers == null || numbers.length == 0) {
//            throw new IllegalArgumentException("Должно быть передано хотя бы одно число");
//        }
//
//        int max = numbers[0];
//        int min = numbers[0];
//
//        for (int i = 1; i < numbers.length; i++) {
//            if (numbers[i] > max) {
//                max = numbers[i];
//            }
//            if (numbers[i] < min) {
//                min = numbers[i];
//            }
//        }
//
//        return new int[]{max, min};
//    }
//
//    public static void main(String[] args) {
//        int[] result = minMax(5, 2, 9, 4, 7);
//
//        System.out.println("Максимум: " + result[0]);
//        System.out.println("Минимум: " + result[1]);
//
//        // Ещё пример
//        int[] result2 = minMax(10, -3, 0, 8, 12);
//        System.out.println("Максимум: " + result2[0]);
//        System.out.println("Минимум: " + result2[1]);
//    }
//}

public class Example10
{
    public static int[] getMaxAndMin(int... numbers)
    {
        int max = numbers[0];
        int min = numbers[0];
        for (int number: numbers)
        {
            if (max < number)
            {
                max = number;
            }
            if (min > number)
            {
                min = number;
            }
        }
        int[] arr = {max, min};

        return arr;
    }

    static void main(String[] args)
    {
        int[] ar = Example10.getMaxAndMin(3,4,5,6,23,25,655,67,9,876,7);
        System.out.println("Максимальное число: " + ar[0] + "\nМинимальное значение: " + ar[1]);
    }
}