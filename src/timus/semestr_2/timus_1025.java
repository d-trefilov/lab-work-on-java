package timus.semestr_2;

import java.util.Arrays;
import java.util.Scanner;

public class timus_1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int[] a = new int[K];

        for (int i = 0; i < K; i++) {
            a[i] = sc.nextInt();
        }

        int[] cost = new int[K];

        for (int i = 0; i < K; i++) {
            cost[i] = a[i] / 2 + 1;
        }

        Arrays.sort(cost);

        int need = K / 2 + 1;
        int answer = 0;

        for (int i = 0; i < need; i++) {
            answer += cost[i];
        }

        System.out.println(answer);
    }
}
