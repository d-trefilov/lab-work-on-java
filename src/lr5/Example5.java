package lr5;

public class Example5 {

    private int value;

    // конструктор без аргументов
    Example5() {
        value = 0;
    }

    // конструктор с аргументом
    Example5(int x) {
        if (x > 100) {
            value = 100;
        } else {
            value = x;
        }
    }

    // метод без аргументов
    public void setValue() {
        value = 0;
    }

    // метод с аргументом
    public void setValue(int x) {
        if (x > 100) {
            value = 100;
        } else {
            value = x;
        }
    }

    // метод для проверки значения поля
    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Example5 obj1 = new Example5();
        Example5 obj2 = new Example5(50);
        Example5 obj3 = new Example5(150);

        obj1.setValue(80);
        obj2.setValue();
        obj3.setValue(200);

        System.out.println("obj1 value = " + obj1.getValue());
        System.out.println("obj2 value = " + obj2.getValue());
        System.out.println("obj3 value = " + obj3.getValue());
    }
}
