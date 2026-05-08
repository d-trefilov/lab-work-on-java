package lr5;

//public class Example2 {
//
//    char first;
//    char second;
//
//    void printSymbols() {
//        char start = first;
//        char end = second;
//
//        // если первый символ больше второго — меняем местами
//        if (start > end) {
//            char temp = start;
//            start = end;
//            end = temp;
//        }
//
//        // вывод символов между ними
//        for (char c = start; c <= end; c++) {
//            System.out.print(c + " ");
//        }
//    }
//
//    public static void main(String[] args) {
//        Example2 obj = new Example2();
//
//        obj.first = 'A';
//        obj.second = 'D';
//
//        obj.printSymbols();
//    }
//}

public class Example2
{
    public char firstChar;
    public char secondChar;

    int firstCharAsInt;
    int secondCharAsInt;

    public Example2(char firstChar, char secondChar)
    {
        this.firstChar = firstChar;
        this.secondChar = secondChar;

        firstCharAsInt = (int)firstChar;
        secondCharAsInt = (int)secondChar;
    }


    public String getChars()
    {
        int lenMassive = secondCharAsInt - firstCharAsInt + 1;

        char[] chars = new char[lenMassive];
        for (int i = 0; i < lenMassive; i++)
        {
            chars[i] = (char)(firstCharAsInt + i);
        }
        return (new String(chars));
    };


    static void main(String[] args) {
        Example2 obj = new Example2('C', 'Z');

        String answer = obj.getChars();
        System.out.println(answer);
    }
}