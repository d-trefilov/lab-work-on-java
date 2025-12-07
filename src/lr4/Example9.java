package lr4;

import java.util.Scanner;

public class Example9 {
    static void main(String[] args) {

        String strAlphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя ";
        char[] arrayAlphabet = strAlphabet.toCharArray();

        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для шифрования:");
        String text = in.nextLine();
        System.out.println("Введите ключ");
        int key = in.nextInt();
        int index;

        char[] array = text.toCharArray();
        char[] arrayCrypt = new char[array.length];

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < arrayAlphabet.length; j++)
            {
                if (array[i] == arrayAlphabet[j])
                {
                    if (j + key >= arrayAlphabet.length) {
                        arrayCrypt[i] = arrayAlphabet[j + key - arrayAlphabet.length];
                    }
                    else{
                        arrayCrypt[i] = arrayAlphabet[j + key];
                    }
                    break;
                }
            }
        }

        System.out.printf("Текст после преобразования: %s \n", new String(arrayCrypt));


        in.nextLine();
        System.out.println("Выполнить обратное преобразование?");
        String answer = in.nextLine();

        char[] arrayDecrypt = new char[arrayCrypt.length];
        if ( answer.equals("y"))
        {
            for (int i = 0; i < arrayCrypt.length; i++)
            {
                for (int j = 0; j < arrayAlphabet.length; j++)
                {
                    if (arrayCrypt[i] == arrayAlphabet[j])
                    {
                        if (j - key < 0) {
                            arrayDecrypt[i] = arrayAlphabet[j - key + arrayAlphabet.length];
                        }
                        else{
                            arrayDecrypt[i] = arrayAlphabet[j - key];
                        }
                        break;
                    }
                }
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
