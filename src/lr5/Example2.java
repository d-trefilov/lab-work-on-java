package lr5;

public class Example2 {

    char first;
    char second;

    void printSymbols() {
        char start = first;
        char end = second;

        // если первый символ больше второго — меняем местами
        if (start > end) {
            char temp = start;
            start = end;
            end = temp;
        }

        // вывод символов между ними
        for (char c = start; c <= end; c++) {
            System.out.print(c + " ");
        }
    }

    public static void main(String[] args) {
        Example2 obj = new Example2();

        obj.first = 'A';
        obj.second = 'D';

        obj.printSymbols();
    }
}

