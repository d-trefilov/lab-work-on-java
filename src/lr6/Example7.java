package lr6;

//public class Example7 {
//
//    // Статический метод для преобразования символов в их коды
//    public static int[] toCharCodes(char[] chars) {
//        if (chars == null) {
//            throw new IllegalArgumentException("Массив символов не может быть null");
//        }
//
//        int[] codes = new int[chars.length];
//
//        for (int i = 0; i < chars.length; i++) {
//            codes[i] = (int) chars[i];
//        }
//
//        return codes;
//    }
//
//    public static void main(String[] args) {
//        char[] letters = {'A', 'b', 'C', '1', '?'};
//
//        int[] codes = toCharCodes(letters);
//
//        System.out.print("Коды символов: [");
//        for (int i = 0; i < codes.length; i++) {
//            System.out.print(codes[i]);
//            if (i < codes.length - 1) {
//                System.out.print(", ");
//            }
//        }
//        System.out.println("]");
//    }
//}


import java.util.Arrays;

public class Example7
{
    public static int[] metod(char[] chars)
    {
        int[] ints = new int[chars.length];
        for (int i = 0; i < chars.length; i++)
        {
            ints[i] = (int)chars[i];
        }
        return ints;
    }

    static void main(String[] args) {
        char[] a = {'a', 'b', 'c', 'd'};
        int[] b = Example7.metod(a);
        System.out.println(Arrays.toString(b));
    }
}
