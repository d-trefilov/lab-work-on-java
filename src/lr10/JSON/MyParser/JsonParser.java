package lr10.JSON.MyParser;

import java.io.FileReader;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonParser {

    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/lr10/JSON/MyParser/example-json.json"));
            JSONObject jsonObject = (JSONObject) obj;

            JSONArray jsonArray = (JSONArray) jsonObject.get("automobiles");

            // 🔹 1. Вывод всех автомобилей
            System.out.println("=== Все автомобили ===");
            for (Object o : jsonArray) {
                JSONObject car = (JSONObject) o;
                printCar(car);
            }

            // 🔹 2. Поиск по бренду
            System.out.println("\n=== Поиск по бренду Toyota ===");
            String brand = "Toyota";

            for (Object o : jsonArray) {
                JSONObject car = (JSONObject) o;
                if (brand.equals(car.get("brand"))) {
                    printCar(car);
                }
            }

            // 🔹 3. Добавление нового автомобиля
            System.out.println("\n=== Добавление нового автомобиля ===");
            JSONObject newCar = new JSONObject();
            newCar.put("brand", "Audi");
            newCar.put("model", "A6");
            newCar.put("year", 2022);

            jsonArray.add(newCar);
            printCar(newCar);

            // 🔹 4. Удаление автомобиля по модели
            System.out.println("\n=== Удаление автомобиля (Camry) ===");
            String modelToRemove = "Camry";

            Iterator iterator = jsonArray.iterator();
            while (iterator.hasNext()) {
                JSONObject car = (JSONObject) iterator.next();
                if (modelToRemove.equals(car.get("model"))) {
                    iterator.remove();
                    System.out.println("Удалён автомобиль: " + modelToRemove);
                }
            }

            // 🔹 Итоговый список
            System.out.println("\n=== Итоговый список ===");
            for (Object o : jsonArray) {
                JSONObject car = (JSONObject) o;
                printCar(car);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 🔹 Метод вывода автомобиля
    public static void printCar(JSONObject car) {
        System.out.println("\nАвтомобиль:");
        System.out.println("Бренд: " + car.get("brand"));
        System.out.println("Модель: " + car.get("model"));
        System.out.println("Год: " + car.get("year"));
    }
}