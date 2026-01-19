package lr8.Example1;

import java.io.File;

public class Ex1 {
    public static void main(String[] args) {
        try {
            // Создание файла в текущей папке
            File f1 = new File("MyFile1.txt");
            f1.createNewFile();
            if (f1.exists()) {
                System.out.println("Файл MyFile1.txt создан!");
                System.out.println("Полный путь 1: " + f1.getAbsolutePath());
            }

            // Создание файла на диске C и вывод полного пути
            File f2 = new File("C:\\ExampleFile2.txt");
            f2.createNewFile();
            System.out.println("Полный путь 2: " + f2.getAbsolutePath());

            // Создание нескольких вложенных папок
            File f3 = new File("C:\\ExampleFolder1\\ExampleFolder2\\ExampleFolder3");
            f3.mkdirs();
            System.out.println("Полный путь 3: " + f3.getAbsolutePath());

        } catch (Exception e) {
            System.out.println("Ошибка!!! " + e);
        }
    }
}