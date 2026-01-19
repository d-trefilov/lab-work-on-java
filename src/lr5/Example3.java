package lr5;

public class Example3 {

    int a;
    int b;

    // конструктор без аргументов
    Example3() {
        a = 0;
        b = 0;
    }

    // конструктор с одним аргументом
    Example3(int x) {
        a = x;
        b = x;
    }

    // конструктор с двумя аргументами
    Example3(int x, int y) {
        a = x;
        b = y;
    }

    public static void main(String[] args) {
        Example3 obj1 = new Example3();
        Example3 obj2 = new Example3(5);
        Example3 obj3 = new Example3(3, 7);

        System.out.println("obj1: a=" + obj1.a + ", b=" + obj1.b);
        System.out.println("obj2: a=" + obj2.a + ", b=" + obj2.b);
        System.out.println("obj3: a=" + obj3.a + ", b=" + obj3.b);
    }
}
