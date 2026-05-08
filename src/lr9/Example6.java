package lr9;

import java.util.HashMap;
import java.util.Map;

public class Example6 {

    static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        for(int i = 0; i < 10; i++)
        {
            hashMap.put(i, "Строка_" + i);
        }
        hashMap.put(0, "Строка_ТЕСТ");

        System.out.println("Словарь: " + hashMap);
        int multiplication = 1;
        StringBuilder zeroStrings = new StringBuilder();

        for (Map.Entry<Integer, String> entry: hashMap.entrySet())
        {
            if (entry.getKey() > 5)
            {
                System.out.println("Ключ >5: " + entry.getValue());
            }

            if (entry.getKey() == 0)
            {
                zeroStrings.append(entry.getValue()).append(", ");
            }

            if (entry.getValue().length() > 5)
            {
                multiplication *= entry.getKey();
            }
        }

        System.out.println("Ключ = 0: " + zeroStrings);
        System.out.println("Перемножение ключей: " + multiplication);
    }
}
