package lr9;

public class Example1 {
    // Пример 1
    public static void recursionEx1(int x) {
        System.out.println("x1 = " + x);
        if (x + 3 < 20)
        {
            recursionEx1(x + 3);
        }
    }


    // Пример 2
    public static void recursionEx2(int x) {
        if (x + 3 < 20)
        {
            recursionEx2(x + 3);
        }
        System.out.println("x2 = " + x);
    }


    // Пример 3
    private static int step = 0;
    public static void recursionEx3(int x)
    {
        space();
        System.out.println("" + x + "-> ");
        step++;
        if ((x + 3) < 20)
        {
            recursionEx3(x + 3);
        }
        step--;
        space();
        System.out.println("" + x + " <-");
    }
    public static void space()
    {
        for (int i = 0; i < step; i++)
        {
            System.out.print(" ");
        }
    }


    // Пример 4
    public static int recursionEx4(int x)
    {
        int result;
        if (x == 1) return 1;
        else
        {
            result = recursionEx4(x - 1) * x;
            return result;
        }
    }

    // Пример 5
    public static int recursionEx5(int x)
    {
        if (x == 0) return 0;
        else if (x == 1) return 1;
        else
        {
            return recursionEx5(x-2) + recursionEx5(x-1);
        }
    }


    // Вывод
    static void main(String[] args) {
        recursionEx1(1);
        System.out.println("-------");
        recursionEx2(1);
        System.out.println("-------");
        recursionEx3(1);
        System.out.println("-------");
        System.out.println(recursionEx4(5));
        System.out.println("-------");
        System.out.println(recursionEx5(5));
    }
}
