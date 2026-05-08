package lr11;

import java.util.List;
import java.util.stream.Collectors;

public class Example5 {

    public static void main(String[] args) {
        List<String> strings = List.of(
                "Java программирование",
                "Python разработка",
                "JavaScript для веба",
                "C++ основы",
                "Java Spring boot",
                "Python Data Science",
                "Java многопоточность"
        );

        String searchSubstring = "Java";

        System.out.println("Исходный список строк:");
        strings.forEach(System.out::println);

        System.out.println("\nСтроки, содержащие подстроку \"" + searchSubstring + "\":");
        List<String> filteredStrings = filterStringsBySubstring(strings, searchSubstring);
        filteredStrings.forEach(System.out::println);
    }

    /**
     * Фильтрует список строк, оставляя только те, которые содержат заданную подстроку
     * @param list исходный список строк
     * @param substring искомая подстрока
     * @return новый список строк, содержащих подстроку
     */
    public static List<String> filterStringsBySubstring(List<String> list, String substring) {
        return list.stream()
                .filter(s -> s.contains(substring))
                .collect(Collectors.toList());
    }
}