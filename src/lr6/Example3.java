package lr6;

public class Example3 {

    // Метод для вычисления максимального значения
    public static int max(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Не передано ни одного числа!");
        }
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Метод для вычисления минимального значения
    public static int min(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Не передано ни одного числа!");
        }
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Метод для вычисления среднего значения
    public static double average(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Не передано ни одного числа!");
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 2, 7};

        // Передача массива через varargs
        System.out.println("Максимум: " + Example3.max(arr));
        System.out.println("Минимум: " + Example3.min(arr));
        System.out.println("Среднее: " + Example3.average(arr));

        // Передача отдельных чисел
        System.out.println("Максимум (varargs): " + Example3.max(10, 20, 5, 7));
        System.out.println("Минимум (varargs): " + Example3.min(10, 20, 5, 7));
        System.out.println("Среднее (varargs): " + Example3.average(10, 20, 5, 7));
    }
}


