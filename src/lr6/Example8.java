package lr6;

public class Example8 {

    // Статический метод для вычисления среднего значения элементов массива
    public static double average(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Массив не может быть null или пустым");
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        return (double) sum / array.length;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};

        double avg = average(numbers);

        System.out.println("Среднее значение элементов массива: " + avg);
    }
}
