package lr6;

public class Example4 {

    // Статический метод для вычисления двойного факториала
    public static long doubleFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число должно быть неотрицательным");
        }

        long result = 1;

        // Умножаем через одно число вниз до 1 или 2
        for (int i = n; i >= 2; i -= 2) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        int n1 = 6;
        int n2 = 5;

        System.out.println(n1 + "!! = " + doubleFactorial(n1)); // 6!! = 48
        System.out.println(n2 + "!! = " + doubleFactorial(n2)); // 5!! = 15

        int n3 = 8;
        System.out.println(n3 + "!! = " + doubleFactorial(n3)); // 8!! = 384
    }
}
