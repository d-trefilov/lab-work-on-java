package lr5;

public class Example4 {

    char ch;
    int num;

    // конструктор с двумя аргументами
    Example4(int n, char c) {
        num = n;
        ch = c;
    }

    // конструктор с одним аргументом double
    Example4(double d) {
        // целая часть — код символа
        int charCode = (int) d;
        ch = (char) charCode;

        // дробная часть (десятые и сотые)
        double fraction = d - charCode;
        num = (int) (fraction * 100);
    }

    public static void main(String[] args) {
        Example4 obj1 = new Example4(10, 'B');
        Example4 obj2 = new Example4(65.1267);

        System.out.println("obj1: ch = " + obj1.ch + ", num = " + obj1.num);
        System.out.println("obj2: ch = " + obj2.ch + ", num = " + obj2.num);
    }
}
