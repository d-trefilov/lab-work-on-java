package lr8.Example1;

import java.io.*;

public class Ex2 {
    public static void main(String[] args) {
        try {
            // 1. Подготовка тестового файла
            FileOutputStream fos = new FileOutputStream("test_file.txt");
            fos.write("Тестовый текст для чтения\nВторая строка".getBytes());
            fos.close();

            // 2. Чтение из файла
            System.out.println("=== Чтение из файла ===");
            InputStream inFile = new FileInputStream("test_file.txt");
            int oneByte;
            while ((oneByte = inFile.read()) != -1) {
                System.out.print((char) oneByte);
            }
            inFile.close();

            // 3. Чтение из массива byte
            System.out.println("\n\n=== Чтение из массива byte ===");
            byte[] byteArray = {65, 66, 67, 68, 69, 70, 10, 71, 72, 73};
            InputStream inArray = new ByteArrayInputStream(byteArray);
            while ((oneByte = inArray.read()) != -1) {
                System.out.print((char) oneByte);
            }
            inArray.close();

            // 4. Чтение из интернет-источника
            System.out.println("\n\n=== Чтение из байтового потока (имитация интернет) ===");
            String simulatedInternet = "Симуляция интернет-данных\nЕще одна строка";
            InputStream inSimulated = new ByteArrayInputStream(simulatedInternet.getBytes());
            while ((oneByte = inSimulated.read()) != -1) {
                System.out.print((char) oneByte);
            }
            inSimulated.close();

        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}