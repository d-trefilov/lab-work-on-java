package lr11;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;

public class Example9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Исходный список строк
        List<String> strings = Arrays.asList(
                "Hello",
                "World123",
                "Java",
                "Python3.8",
                "Programming",
                "C++",
                "PureText",
                "12345",
                "OnlyLetters",
                "Test@123",
                "OpenAI",
                "Space Test",
                "Special#Chars",
                "LowerCase"
        );

        System.out.println("Исходный список строк:");
        strings.forEach(System.out::println);

        List<String> filteredStrings = filterOnlyLetters(strings);

        System.out.println("\nСтроки, содержащие только буквы:");
        if (filteredStrings.isEmpty()) {
            System.out.println("Таких строк нет");
        } else {
            filteredStrings.forEach(System.out::println);
        }

        in.close();
    }

    /**
     * Фильтрует список строк, оставляя только те, которые содержат только буквы
     * @param list исходный список строк
     * @return новый список строк, состоящих только из букв
     */
    public static List<String> filterOnlyLetters(List<String> list) {
        return list.stream()
                .filter(s -> s != null && s.matches("^[a-zA-Zа-яА-ЯёЁ]+$"))
                .collect(Collectors.toList());
    }
}