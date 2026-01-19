package lr6;

public class Example2 {
    // Закрытое статическое целочисленное поле с начальным значением 0
    private static int count = 0;

    // Статический метод для отображения текущего значения и увеличения его на 1
    public static void showAndIncrement() {
        System.out.println("Текущее значение: " + count);
        count++; // увеличиваем значение на 1
    }

    public static void main(String[] args) {
        Example2.showAndIncrement(); // вывод: 0
        Example2.showAndIncrement(); // вывод: 1
        Example2.showAndIncrement(); // вывод: 2
        Example2.showAndIncrement(); // вывод: 3
    }
}
