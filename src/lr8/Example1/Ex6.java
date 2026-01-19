package lr8.Example1;

import java.io.*;

public class Ex6 {
    public static void main(String[] args) {
        Reader in = null;
        Writer out = null;

        try {
            // Создаем исходный файл
            FileWriter fw = new FileWriter("source.txt");
            fw.write("Пример текста для копирования.\n");
            fw.write("Вторая строка исходного файла.\n");
            fw.write("Третья строка с русскими буквами: привет!");
            fw.close();

            in = new FileReader("source.txt");
            out = new FileWriter("destination.txt", false); // false - перезаписать

            System.out.println("Копирование файла побайтно:");
            System.out.println("===========================");

            int oneByte;
            int charCount = 0;

            while ((oneByte = in.read()) != -1) {
                out.write(oneByte);
                System.out.print((char) oneByte);
                charCount++;
            }

            System.out.println("\n\nСкопировано символов: " + charCount);
            System.out.println("Файл успешно скопирован в destination.txt");

        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            try {
                if (in != null) in.close();
                if (out != null) out.close();
            } catch (IOException e) {
                System.out.println("Ошибка при закрытии потоков: " + e.getMessage());
            }
        }
    }
}
