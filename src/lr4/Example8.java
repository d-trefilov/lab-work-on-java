package lr4;

import java.util.Arrays;
import java.util.Scanner;

public class Example8 {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для шифрования:");
        String text = in.nextLine();
        System.out.println("Введите ключ");
        int key = in.nextInt();

        char[] array = text.toCharArray();
        char[] arrayCrypt = new char[array.length];

        for (int i = 0; i < array.length; i++)
        {
            arrayCrypt[i] = (char)(array[i] + key);
        }

        String textCrypt = new String(arrayCrypt);
        System.out.printf("Текст после преобразования: %s \n", textCrypt);


        in.nextLine();
        System.out.println("Выполнить обратное преобразование?");
        String answer = in.nextLine();

        char[] arrayDecrypt = new char[arrayCrypt.length];
        if ( answer.equals("y"))
        {
            for (int i = 0; i < arrayCrypt.length; i++)
            {
                arrayDecrypt[i] = (char)(arrayCrypt[i] - key);
            }
            System.out.printf("Текст расшифрованный: %s", new String(arrayDecrypt));
        }
        else if (answer.equals("n"))
        {
            System.out.println("До свидания!");
        }
        else
        {
            System.out.println("Введите корректный ответ!");
        }
    }
}
