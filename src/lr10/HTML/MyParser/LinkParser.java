package lr10.HTML.MyParser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LinkParser {

    // Количество попыток подключения
    private static final int MAX_RETRIES = 3;

    public static void main(String[] args) {

        String url = "https://itlearn.ru/first-steps";
        String outputFile = "links.txt";

        Document doc = null;
        int attempt = 0;

        // Попытки подключения к сайту
        while (attempt < MAX_RETRIES) {
            try {
                System.out.println("Подключение к сайту... Попытка " + (attempt + 1));

                // Получаем HTML-документ
                doc = Jsoup.connect(url)
                        .timeout(5000) // таймаут 5 секунд
                        .get();

                System.out.println("Подключение успешно!");
                break;

            } catch (IOException e) {
                System.out.println("Ошибка подключения: " + e.getMessage());
                attempt++;

                // Если попытки закончились
                if (attempt == MAX_RETRIES) {
                    System.out.println("Не удалось подключиться к сайту после "
                            + MAX_RETRIES + " попыток.");
                    return;
                }

                // Пауза перед повторной попыткой
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }

        // Если документ успешно получен
        if (doc != null) {

            // Получаем все ссылки
            Elements links = doc.select("a[href]");

            // Запись ссылок в файл
            try (BufferedWriter writer = new BufferedWriter(
                    new FileWriter(outputFile))) {

                for (Element link : links) {

                    String linkUrl = link.attr("abs:href");

                    // Вывод в консоль
                    System.out.println(linkUrl);

                    // Запись в файл
                    writer.write(linkUrl);
                    writer.newLine();
                }

                System.out.println("\nСсылки успешно сохранены в файл: " + outputFile);

            } catch (IOException e) {
                System.out.println("Ошибка при записи в файл: " + e.getMessage());
            }
        }
    }
}