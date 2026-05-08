package lr6;

public class Example6 {

    // Статический метод для получения первых k элементов массива
    public static int[] takeFirst(int[] array, int k) {
        if (array == null) {
            throw new IllegalArgumentException("Массив не может быть null");
        }

        // Определяем размер нового массива
        int newSize = k;
        if (k > array.length) {
            newSize = array.length;
        }

        // Создаём новый массив
        int[] result = new int[newSize];

        // Копируем элементы
        for (int i = 0; i < newSize; i++) {
            result[i] = array[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};

        // Пример 1: k меньше длины массива
        int[] result1 = takeFirst(original, 3);
        System.out.print("Первые 3 элемента: [");
        for (int i = 0; i < result1.length; i++) {
            System.out.print(result1[i]);
            if (i < result1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Пример 2: k больше длины массива
        int[] result2 = takeFirst(original, 10);
        System.out.print("Копия всего массива: [");
        for (int i = 0; i < result2.length; i++) {
            System.out.print(result2[i]);
            if (i < result2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Пример 3: k равно длине массива
        int[] result3 = takeFirst(original, 5);
        System.out.print("Первые 5 элементов: [");
        for (int i = 0; i < result3.length; i++) {
            System.out.print(result3[i]);
            if (i < result3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

