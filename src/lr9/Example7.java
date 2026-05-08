package lr9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class Example7 {

    // ===== ArrayList =====
    public static int arrayListTime(int numberOfPeople) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= numberOfPeople; i++) {
            list.add(i);
        }

        int index = 0;

        while (list.size() > 1) {
            index = (index + 1) % list.size();
            list.remove(index);
        }

        return list.get(0);
    }

    // ===== LinkedList =====
    public static int linkedListTime(int numberOfPeople) {
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 1; i <= numberOfPeople; i++) {
            list.add(i);
        }

        boolean remove = false;

        while (list.size() > 1) {
            Iterator<Integer> iterator = list.iterator();

            while (iterator.hasNext()) {
                iterator.next();

                if (remove) {
                    iterator.remove();
                }

                remove = !remove;
            }
        }

        return list.get(0);
    }

    public static void main(String[] args) {
        int numberOfPeople = 10000;

        // ===== ArrayList =====
        long startArray = System.nanoTime();
        int survivorArray = arrayListTime(numberOfPeople);
        long endArray = System.nanoTime();

        // ===== LinkedList =====
        long startLinked = System.nanoTime();
        int survivorLinked = linkedListTime(numberOfPeople);
        long endLinked = System.nanoTime();

        // ===== Результаты =====
        System.out.println("\n=== Результаты ===");
        System.out.println("Последний (ArrayList): " + survivorArray);
        System.out.println("Последний (LinkedList): " + survivorLinked);

        System.out.printf("ArrayList  : %.3f ms%n", (endArray - startArray) / 1_000_000.0);
        System.out.printf("LinkedList : %.3f ms%n", (endLinked - startLinked) / 1_000_000.0);
    }
}