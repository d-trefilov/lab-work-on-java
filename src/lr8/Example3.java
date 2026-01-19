package lr8;

import java.io.*;
import java.util.*;

public class Example3 {
    // Метод для проверки, является ли буква согласной
    private static boolean isConsonant(char c) {
        c = Character.toLowerCase(c);
        String consonants = "бвгджзйклмнпрстфхцчшщbcdfghjklmnpqrstvwxyz";
        return consonants.indexOf(c) >= 0;
    }

    // Метод для проверки, начинается ли слово с согласной
    private static boolean startsWithConsonant(String word) {
        if (word == null || word.isEmpty()) {
            return false;
        }
        char firstChar = word.charAt(0);
        return Character.isLetter(firstChar) && isConsonant(firstChar);
    }

    public static void main(String[] args) {
        try {
            // 1. Создаем исходный файл с текстом (например, стихотворение Пушкина)
            File inputFile = new File("input_text.txt");
            PrintWriter writer = new PrintWriter(new OutputStreamWriter(
                    new FileOutputStream(inputFile), "UTF-8"));

            writer.println("У лукоморья дуб зелёный,");
            writer.println("Златая цепь на дубе том.");
            writer.println("И днём и ночью кот учёный");
            writer.println("Всё ходит по цепи кругом.");
            writer.println("Идёт направо - песнь заводит,");
            writer.println("Налево - сказку говорит.");

            writer.close();

            // 2. Чтение из файла и обработка
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(new FileInputStream(inputFile), "UTF-8"));

            File outputFile = new File("output_words.txt");
            PrintWriter outputWriter = new PrintWriter(new OutputStreamWriter(
                    new FileOutputStream(outputFile), "UTF-8"));

            String line;
            int lineNumber = 0;

            while ((line = reader.readLine()) != null) {
                lineNumber++;
                String[] words = line.split("[\\s\\p{Punct}]+"); // Разделение по пробелам и знакам препинания

                List<String> consonantWords = new ArrayList<>();

                for (String word : words) {
                    if (!word.isEmpty() && startsWithConsonant(word)) {
                        consonantWords.add(word);
                    }
                }

                // Записываем результат в выходной файл
                if (!consonantWords.isEmpty()) {
                    outputWriter.println("Строка " + lineNumber + ":");
                    outputWriter.println("  Найдено слов: " + consonantWords.size());
                    outputWriter.println("  Слова: " + String.join(", ", consonantWords));
                    outputWriter.println();

                    // Выводим в консоль для проверки
                    System.out.println("Строка " + lineNumber + ":");
                    System.out.println("  Найдено слов: " + consonantWords.size());
                    System.out.println("  Слова: " + String.join(", ", consonantWords));
                    System.out.println();
                }
            }

            reader.close();
            outputWriter.close();

            System.out.println("Обработка завершена. Результат сохранен в файле output_words.txt");

        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
