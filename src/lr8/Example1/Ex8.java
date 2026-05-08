package lr8.Example1;

import java.io.*;

public class Ex8 {
    public static void readAllByByte(Reader in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n--- КОНЕЦ ДАННЫХ ---");
                break;
            }
        }
    }

    public static void main(String[] args) {
        try {
            // 1. Из файла с кодировкой
            System.out.println("=== Чтение из файла (с кодировкой) ===");
            InputStream inFile = new FileInputStream("test_input.txt");
            Reader rFile = new InputStreamReader(inFile, "UTF-8");
            readAllByByte(rFile);
            inFile.close();
            rFile.close();

            System.out.println("\n\n=== Чтение из массива byte ===");
            byte[] byteData = "Тестовые данные из массива".getBytes("UTF-8");
            InputStream inArray = new ByteArrayInputStream(byteData);
            Reader rArray = new InputStreamReader(inArray, "UTF-8");
            readAllByByte(rArray);
            inArray.close();
            rArray.close();

            System.out.println("\n\n=== Чтение с разными кодировками ===");
            String text = "Пример текста с русскими буквами: Привет!";

            // UTF-8
            System.out.println("\nUTF-8:");
            InputStream is1 = new ByteArrayInputStream(text.getBytes("UTF-8"));
            Reader r1 = new InputStreamReader(is1, "UTF-8");
            readAllByByte(r1);

            // Windows-1251
            System.out.println("\n\nWindows-1251:");
            InputStream is2 = new ByteArrayInputStream(text.getBytes("Windows-1251"));
            Reader r2 = new InputStreamReader(is2, "Windows-1251");
            readAllByByte(r2);

            is1.close(); r1.close();
            is2.close(); r2.close();

        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
