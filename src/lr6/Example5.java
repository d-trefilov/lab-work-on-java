package lr6;

public class Example5 {

    // Статический метод через цикл
    public static int sumSquaresLoop(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    // Статический метод через формулу: n*(n+1)*(2n+1)/6
    public static int sumSquaresFormula(int n) {
        return n * (n + 1) * (2 * n + 1) / 6;
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println("Сумма квадратов до " + n + " (через цикл): " + sumSquaresLoop(n));
        System.out.println("Сумма квадратов до " + n + " (через формулу): " + sumSquaresFormula(n));

        n = 10;
        System.out.println("Сумма квадратов до " + n + " (через цикл): " + sumSquaresLoop(n));
        System.out.println("Сумма квадратов до " + n + " (через формулу): " + sumSquaresFormula(n));
    }
}
