package lr6;

public class Example9 {

    // Статический метод для попарного обмена элементов массива
    public static void reverseArray(char[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Массив не может быть null");
        }

        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            // Меняем элементы i и (n - 1 - i)
            char temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        char[] letters = {'A', 'B', 'C', 'D', 'E'};

        System.out.print("Исходный массив: [");
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i]);
            if (i < letters.length - 1) System.out.print(", ");
        }
        System.out.println("]");

        reverseArray(letters);

        System.out.print("После обмена: [");
        for (int i = 0; i < letters.length; i++) {
            System.out.print(letters[i]);
            if (i < letters.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}

