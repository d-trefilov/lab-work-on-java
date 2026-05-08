package timus.semestr_2;

import java.util.Scanner;

public class timus_1545 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine(); // считываем перевод строки после числа

        String[] hieroglyphs = new String[N];
        for (int i = 0; i < N; i++) {
            hieroglyphs[i] = scanner.nextLine();
        }

        String letter = scanner.nextLine();

        for (String glyph : hieroglyphs) {
            if (glyph.startsWith(letter)) {
                System.out.println(glyph);
            }
        }

        scanner.close();
    }
}
