package timus.timus_1293;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();

        int result = (N * A * B) * 2;

        System.out.printf("%d", result);
        in.close();
    }
}
