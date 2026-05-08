package lr10.HTML;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class NewsParser {
    public static void main(String[] args) {
        try {
            // Получаем HTML-код страницы
            Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();

            // Извлекаем список новостей
            Elements newsParent = doc.select("body > table > tbody > tr > td > div > table > tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > tr > td:nth-child(1)");

            // Выводим последние 10 новостей в консоль
            for (int i = 3; i < 20; i++) {
                if (i % 2 == 0) {
                    Elements nodes = newsParent.get(0).children();
                    Element titleElement = nodes.get(i).getElementsByClass("blocktitle").get(0);
                    Element dateElement = nodes.get(i).getElementsByClass("blockdate").get(0);

                    System.out.println("Тема : " + titleElement.text());
                    System.out.println("Дата : " + dateElement.text() + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}