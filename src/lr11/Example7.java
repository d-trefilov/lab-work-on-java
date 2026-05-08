package lr11;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;

public class Example7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Исходный список строк
        List<String> strings = Arrays.asList(
                "Java",
                "Python",
                "JavaScript",
                "C++",
                "Ruby on Rails",
                "Swift",
                "Kotlin",
                "Go",
                "Rust",
                "TypeScript"
        );

        System.out.println("Исходный список строк:");
        strings.forEach(System.out::println);

        System.out.print("\nВведите минимальную длину строки: ");
        int minLength = in.nextInt();

        List<String> filteredStrings = filterByLength(strings, minLength);

        System.out.println("\nСтроки, длина которых больше " + minLength + ":");
        if (filteredStrings.isEmpty()) {
            System.out.println("Таких строк нет");
        } else {
            filteredStrings.forEach(System.out::println);
        }

        in.close();
    }

    /**
     * Фильтрует список строк, оставляя только те, длина которых больше заданного значения
     * @param list исходный список строк
     * @param minLength минимальная длина строки
     * @return новый список строк с длиной больше minLength
     */
    public static List<String> filterByLength(List<String> list, int minLength) {
        return list.stream()
                .filter(s -> s.length() > minLength)
                .collect(Collectors.toList());
    }
}