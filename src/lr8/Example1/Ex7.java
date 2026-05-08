package lr8.Example1;

import java.io.*;

public class Ex7 {
    public static void main(String[] args) {
        try {
            // Создаем тестовый файл
            BufferedWriter writer = new BufferedWriter(new FileWriter("test_input.txt"));
            writer.write("Первая строка текста для буферизованного чтения.\n");
            writer.write("Вторая строка: Java I/O - это важно.\n");
            writer.write("Третья строка: Буферизация ускоряет работу.\n");
            writer.write("Четвертая строка: Конец файла.");
            writer.close();

            // Чтение с буфером и запись в другой файл
            BufferedReader br = new BufferedReader(new FileReader("test_input.txt"), 1024);
            BufferedWriter bw = new BufferedWriter(new FileWriter("test_output.txt"));

            System.out.println("Буферизованное чтение построчно:");
            System.out.println("================================");

            String line;
            int lineNumber = 1;

            while ((line = br.readLine()) != null) {
                System.out.println(lineNumber + ": " + line);
                bw.write("Строка " + lineNumber + ": " + line);
                bw.newLine();
                lineNumber++;
            }

            br.close();
            bw.flush();
            bw.close();

            System.out.println("\nФайл успешно обработан!");
            System.out.println("Исходный файл: test_input.txt");
            System.out.println("Результат: test_output.txt");

        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}