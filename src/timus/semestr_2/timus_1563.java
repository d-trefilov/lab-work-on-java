package timus.semestr_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class timus_1563 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine(); // считываем перевод строки

        Set<String> visited = new HashSet<>();
        int bayanCount = 0;

        for (int i = 0; i < N; i++) {
            String shop = scanner.nextLine();
            if (visited.contains(shop)) {
                bayanCount++;
            } else {
                visited.add(shop);
            }
        }

        System.out.println(bayanCount);
        scanner.close();
    }
}
