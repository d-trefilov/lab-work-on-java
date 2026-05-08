package lr8.Example1;

import java.io.*;

public class Ex9 {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            // Создаем исходный файл
            FileOutputStream fos = new FileOutputStream("input_data.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
            BufferedWriter tempWriter = new BufferedWriter(osw);

            tempWriter.write("Строка 1: Основы работы с файлами в Java");
            tempWriter.newLine();
            tempWriter.write("Строка 2: Байтовые и символьные потоки");
            tempWriter.newLine();
            tempWriter.write("Строка 3: Преобразование кодировок");
            tempWriter.newLine();
            tempWriter.write("Строка 4: Буферизация для повышения производительности");

            tempWriter.flush();
            tempWriter.close();

            // Создание потоков для чтения и записи с указанием кодировки
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("input_data.txt"), "UTF-8"));

            bw = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("output_data.txt"), "UTF-8"));

            // Обработка файла
            System.out.println("Обработка файла с кодировкой UTF-8:");
            System.out.println("===================================");

            String line;
            int lineCount = 0;

            while ((line = br.readLine()) != null) {
                lineCount++;
                String processedLine = "[" + lineCount + "] " + line + " (длина: " + line.length() + ")";

                System.out.println(processedLine);
                bw.write(processedLine);
                bw.newLine();
            }

            System.out.println("\nОбработано строк: " + lineCount);
            System.out.println("Результат сохранен в output_data.txt");

        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            try {
                if (br != null) br.close();
                if (bw != null) {
                    bw.flush();
                    bw.close();
                }
            } catch (IOException e) {
                System.out.println("Ошибка при закрытии потоков: " + e.getMessage());
            }
        }
    }
}
