package lr10.HTML;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class LinkParser {
    public static void main(String[] args) {
        String url = "https://itlearn.ru/first-steps";
        try {
            // Подключаемся к странице и получаем HTML-документ
            Document doc = Jsoup.connect(url).get();

            // Выбираем все элементы <a> (ссылки) с атрибутом href
            Elements links = doc.select("a[href]");

            // Перебираем каждую ссылку и выводим её абсолютный URL
            for (Element link : links) {
                System.out.println(link.attr("abs:href"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}