package lr5;

public class Example6 {

    private int max;
    private int min;

    // конструктор без аргументов
    Example6() {
        max = 0;
        min = 0;
    }

    // конструктор с одним аргументом
    Example6(int x) {
        setValues(x);
    }

    // конструктор с двумя аргументами
    Example6(int x, int y) {
        setValues(x, y);
    }

    // метод с одним аргументом
    public void setValues(int x) {
        int[] values = { max, min, x };
        findMinMax(values);
    }

    // метод с двумя аргументами
    public void setValues(int x, int y) {
        int[] values = { max, min, x, y };
        findMinMax(values);
    }

    // вспомогательный метод для поиска min и max
    private void findMinMax(int[] arr) {
        int newMin = arr[0];
        int newMax = arr[0];

        for (int v : arr) {
            if (v < newMin) newMin = v;
            if (v > newMax) newMax = v;
        }

        min = newMin;
        max = newMax;
    }

    // метод для вывода значений
    public void show() {
        System.out.println("min = " + min + ", max = " + max);
    }

    public static void main(String[] args) {
        Example6 obj = new Example6(5, 10);
        obj.show();

        obj.setValues(3);
        obj.show();

        obj.setValues(20, -2);
        obj.show();
    }
}

