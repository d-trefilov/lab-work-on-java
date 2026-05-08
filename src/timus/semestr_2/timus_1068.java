package timus.semestr_2;

import java.util.Scanner;

public class timus_1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long start = Math.min(1, N);
        long end = Math.max(1, N);

        long sum = (end - start + 1) * (start + end) / 2;

        System.out.println(sum);
    }
}
