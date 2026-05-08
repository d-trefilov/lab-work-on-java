package timus.semestr_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class timus_1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        if (n == 0) {
            System.out.println(10);
            return;
        }

        if (n == 1) {
            System.out.println(1);
            return;
        }

        List<Integer> digits = new ArrayList<>();

        for (int d = 9; d >= 2; d--) {
            while (n % d == 0) {
                n /= d;
                digits.add(d);
            }
        }

        if (n != 1) {
            System.out.println(-1);
            return;
        }

        Collections.sort(digits);

        StringBuilder result = new StringBuilder();
        for (int d : digits) {
            result.append(d);
        }

        System.out.println(result.toString());
    }
}