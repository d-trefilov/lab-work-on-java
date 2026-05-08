package lr5;

//public class Example4 {
//
//    char ch;
//    int num;
//
//    // конструктор с двумя аргументами
//    Example4(int n, char c) {
//        num = n;
//        ch = c;
//    }
//
//    // конструктор с одним аргументом double
//    Example4(double d) {
//        // целая часть — код символа
//        int charCode = (int) d;
//        ch = (char) charCode;
//
//        // дробная часть (десятые и сотые)
//        double fraction = d - charCode;
//        num = (int) (fraction * 100);
//    }
//
//    public static void main(String[] args) {
//        Example4 obj1 = new Example4(10, 'B');
//        Example4 obj2 = new Example4(65.1267);
//
//        System.out.println("obj1: ch = " + obj1.ch + ", num = " + obj1.num);
//        System.out.println("obj2: ch = " + obj2.ch + ", num = " + obj2.num);
//    }
//}

public class Example4 {

    int intElem;
    char charElem;
    double doubleElem;

    public Example4(int intElem, char charElem)
    {
        this.intElem = intElem;
        this.charElem = charElem;
    }

    public Example4(double doubleElem)
    {
        this.intElem = (int)doubleElem % 100;
        this.charElem = (char)((int)doubleElem);
    }

    static void main(String[] args)
    {
        Example4 ex1 = new Example4(34, 'Q');
        Example4 ex2 = new Example4(65.1267);

        System.out.println("ex1-ch = " + ex1.charElem + "; ex1-int = " + ex1.intElem);
        System.out.println("ex2-ch = " + ex2.charElem + "; ex2-int = " + ex2.intElem);
    }
}