package lr8;

import java.io.*;

public class Example2 {
    public static void main(String[] args) {
        try {
            // 1. Создаем исходный файл с данными
            File sourceFile = new File("source_data.dat");
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(sourceFile));

            // Записываем две строки UTF-8
            dos.writeUTF("Первая строка UTF-8");
            dos.writeUTF("Вторая строка UTF-8");

            // Записываем 5 чисел double
            double[] numbers = {3.14, -2.5, 0.0, 42.1, -7.8};
            for (double num : numbers) {
                dos.writeDouble(num);
            }
            dos.close();

            // 2. Чтение из исходного файла и запись в результирующий
            DataInputStream dis = new DataInputStream(new FileInputStream(sourceFile));
            File resultFile = new File("result_data.dat");
            DataOutputStream dosResult = new DataOutputStream(new FileOutputStream(resultFile));

            // Читаем две строки
            String firstLine = dis.readUTF();
            String secondLine = dis.readUTF();

            // Записываем вторую строку в результирующий файл
            dosResult.writeUTF(secondLine);

            // Читаем 5 чисел и записываем только положительные
            System.out.println("Положительные числа:");
            for (int i = 0; i < 5; i++) {
                double num = dis.readDouble();
                if (num > 0) {
                    dosResult.writeDouble(num);
                    System.out.println(num);
                }
            }

            dis.close();
            dosResult.close();

            System.out.println("\nВторая строка из файла: " + secondLine);
            System.out.println("Данные успешно обработаны и записаны в result_data.dat");

        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
