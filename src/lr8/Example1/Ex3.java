package lr8.Example1;

import java.io.*;

public class Ex3 {
    public static void main(String[] args) {
        try {
            // Создаем тестовый файл
            FileOutputStream fos = new FileOutputStream("buffer_test.txt");
            String text = "Этот текст будет прочитан с использованием буфера размером 5 байт.";
            fos.write(text.getBytes());
            fos.close();

            // Чтение с буфером в 5 байт
            FileInputStream fis = new FileInputStream("buffer_test.txt");
            byte[] buffer = new byte[5];
            int bytesRead;

            System.out.println("Чтение с буфером 5 байт:");
            System.out.println("=========================");

            while ((bytesRead = fis.read(buffer)) != -1) {
                String chunk = new String(buffer, 0, bytesRead);
                System.out.print("[" + chunk + "] ");
            }

            fis.close();
            System.out.println("\n\nЧтение завершено!");

        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
