package lr8.Example1;

import java.io.*;

public class Ex10 {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter out = null;

        try {
            // Создаем тестовый файл с помощью PrintWriter
            PrintWriter testWriter = new PrintWriter("print_test.txt");
            testWriter.println("Первая строка для тестирования");
            testWriter.println("Вторая строка: PrintWriter удобен");
            testWriter.printf("Третья строка: число %.2f и число %d%n", 3.14159, 42);
            testWriter.println("Четвертая строка: конец файла");
            testWriter.close();

            // Чтение файла и запись с использованием PrintWriter
            br = new BufferedReader(new FileReader("print_test.txt"));
            out = new PrintWriter("print_output.txt");

            System.out.println("Чтение файла и вывод в консоль:");
            System.out.println("================================");

            String line;
            int counter = 1;

            while ((line = br.readLine()) != null) {
                // Вывод в консоль
                System.out.println("Строка " + counter + ": " + line);

                // Запись в файл с помощью PrintWriter
                out.println("Запись " + counter + ": " + line);
                counter++;
            }

            // Дополнительные возможности PrintWriter
            out.println("\n=== Дополнительная информация ===");
            out.printf("Обработано строк: %d%n", counter - 1);
            out.printf("Текущее время: %tT%n", System.currentTimeMillis());
            out.printf("Число PI: %.4f%n", Math.PI);

            System.out.println("\nОперация завершена!");
            System.out.println("Создан файл: print_output.txt");

        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            try {
                if (br != null) br.close();
                if (out != null) {
                    out.flush();
                    out.close();
                }
            } catch (IOException e) {
                System.out.println("Ошибка при закрытии потоков: " + e.getMessage());
            }
        }
    }
}
