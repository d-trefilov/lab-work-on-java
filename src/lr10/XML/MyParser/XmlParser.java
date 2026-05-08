package XML.MyParser;

import java.io.File;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Collectors;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.*;

public class XmlParser {

    private static final String FILE_PATH = "src/lr10/XML/MyParser/automobile.xml";

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\n1. Показать автомобили");
                System.out.println("2. Добавить автомобиль");
                System.out.println("3. Поиск");
                System.out.println("4. Удалить автомобиль");
                System.out.println("0. Выход");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1 -> showAutomobiles();
                    case 2 -> addAutomobile(scanner);
                    case 3 -> searchAutomobiles(scanner);
                    case 4 -> deleteAutomobile(scanner);
                    case 0 -> System.exit(0);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Document loadDocument() throws Exception {
        File inputFile = new File(FILE_PATH);
        DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document doc = dBuilder.parse(inputFile);
        doc.getDocumentElement().normalize();
        return doc;
    }

    private static void saveDocument(Document doc) throws Exception {
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(FILE_PATH));
        transformer.transform(source, result);
    }

    // 1. Показ
    private static void showAutomobiles() throws Exception {
        Document doc = loadDocument();
        NodeList list = doc.getElementsByTagName("automobile");

        for (int i = 0; i < list.getLength(); i++) {
            Element el = (Element) list.item(i);
            printAutomobile(el);
        }
    }

    // 2. Добавление
    private static void addAutomobile(Scanner scanner) throws Exception {
        Document doc = loadDocument();

        System.out.print("Марка: ");
        String brand = scanner.nextLine();

        System.out.print("Модель: ");
        String model = scanner.nextLine();

        System.out.print("Год: ");
        String year = scanner.nextLine();

        Element auto = doc.createElement("automobile");

        Element brandEl = doc.createElement("brand");
        brandEl.appendChild(doc.createTextNode(brand));

        Element modelEl = doc.createElement("model");
        modelEl.appendChild(doc.createTextNode(model));

        Element yearEl = doc.createElement("year");
        yearEl.appendChild(doc.createTextNode(year));

        auto.appendChild(brandEl);
        auto.appendChild(modelEl);
        auto.appendChild(yearEl);

        doc.getDocumentElement().appendChild(auto);

        saveDocument(doc);
        System.out.println("Автомобиль добавлен!");
    }

    // 3. Поиск
    private static void searchAutomobiles(Scanner scanner) throws Exception {
        Document doc = loadDocument();
        NodeList list = doc.getElementsByTagName("automobile");

        System.out.print("Введите марку или год: ");
        String query = scanner.nextLine();

        List<Element> result = IntStream.range(0, list.getLength())
                .mapToObj(list::item)
                .filter(n -> n.getNodeType() == Node.ELEMENT_NODE)
                .map(n -> (Element) n)
                .filter(el -> {
                    String brand = el.getElementsByTagName("brand").item(0).getTextContent();
                    String year = el.getElementsByTagName("year").item(0).getTextContent();
                    return brand.equalsIgnoreCase(query) || year.equals(query);
                })
                .collect(Collectors.toList());

        if (result.isEmpty()) {
            System.out.println("Ничего не найдено.");
        } else {
            result.forEach(XmlParser::printAutomobile);
        }
    }

    // 4. Удаление
    private static void deleteAutomobile(Scanner scanner) throws Exception {
        Document doc = loadDocument();
        NodeList list = doc.getElementsByTagName("automobile");

        System.out.print("Введите модель для удаления: ");
        String modelToDelete = scanner.nextLine();

        boolean found = false;

        for (int i = 0; i < list.getLength(); i++) {
            Element el = (Element) list.item(i);
            String model = el.getElementsByTagName("model").item(0).getTextContent();

            if (model.equalsIgnoreCase(modelToDelete)) {
                el.getParentNode().removeChild(el);
                found = true;
                break;
            }
        }

        if (found) {
            saveDocument(doc);
            System.out.println("Автомобиль удалён!");
        } else {
            System.out.println("Автомобиль не найден.");
        }
    }

    private static void printAutomobile(Element el) {
        System.out.println("\nМарка: " +
                el.getElementsByTagName("brand").item(0).getTextContent());
        System.out.println("Модель: " +
                el.getElementsByTagName("model").item(0).getTextContent());
        System.out.println("Год: " +
                el.getElementsByTagName("year").item(0).getTextContent());
    }
}