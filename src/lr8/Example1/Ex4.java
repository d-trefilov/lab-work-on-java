package lr8.Example1;

import java.io.*;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Создаем папку My если её нет
            File folder = new File("My");
            if (!folder.exists()) {
                folder.mkdir();
            }

            // 1. Создание исходного файла numIsh.txt
            File f1 = new File("My\\numIsh.txt");
            f1.createNewFile();

            System.out.println("Сколько вещественных чисел записать в файл?");
            int count = sc.nextInt();

            DataOutputStream wr = new DataOutputStream(new FileOutputStream(f1));
            System.out.println("Введите " + count + " чисел:");

            for (int i = 0; i < count; i++) {
                System.out.print("Число " + (i+1) + ": ");
                wr.writeFloat(sc.nextFloat());
            }
            wr.flush();
            wr.close();

            // 2. Создание файла numRez.txt и копирование чисел
            File f2 = new File("My\\numRez.txt");
            f2.createNewFile();

            DataInputStream rd = new DataInputStream(new FileInputStream(f1));
            wr = new DataOutputStream(new FileOutputStream(f2));

            System.out.println("\nЧисла, прочитанные из файла:");

            try {
                while (true) {
                    float number = rd.readFloat();
                    wr.writeFloat(number);
                    System.out.println("Число: " + number);
                }
            } catch (EOFException e) {
                System.out.println("Достигнут конец файла");
            }

            wr.flush();
            wr.close();
            rd.close();

            System.out.println("\nОперация завершена успешно!");
            System.out.println("Исходный файл: " + f1.getAbsolutePath());
            System.out.println("Результирующий файл: " + f2.getAbsolutePath());

        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        sc.close();
    }
}
