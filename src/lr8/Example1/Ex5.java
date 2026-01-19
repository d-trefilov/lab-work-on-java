package lr8.Example1;

import java.io.*;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Введите имя файла: ");
            String fileName = sc.nextLine();

            File f1 = new File(fileName);
            f1.createNewFile();
            System.out.println("Файл создан: " + f1.getAbsolutePath());

            System.out.print("Сколько строк записать в файл? ");
            int n = sc.nextInt();
            sc.nextLine(); // очистка буфера

            DataOutputStream dOut = new DataOutputStream(new FileOutputStream(f1));

            for (int i = 0; i < n; i++) {
                System.out.print("Строка " + (i+1) + ": ");
                String line = sc.nextLine();
                dOut.writeUTF(line);
            }

            dOut.flush();
            dOut.close();

            // Чтение и вывод содержимого файла
            System.out.println("\n=== Содержимое файла ===");
            DataInputStream dIn = new DataInputStream(new FileInputStream(f1));

            try {
                int lineNumber = 1;
                while (true) {
                    String line = dIn.readUTF();
                    System.out.println(lineNumber + ": " + line);
                    lineNumber++;
                }
            } catch (EOFException e) {
                System.out.println("=== Конец файла ===");
            }

            dIn.close();

        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        sc.close();
    }
}