package timus.timus_1910;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int size = Integer.parseInt(bufferedReader.readLine());
        String[] strings = bufferedReader.readLine().split(" ");

        int[] sums = new int[size - 2];

        for (int i = 0; i < sums.length; i++) {
            sums[i] = Integer.parseInt(strings[i])
                    + Integer.parseInt(strings[i + 1])
                    + Integer.parseInt(strings[i + 2]);
        }

        int max = sums[0];
        int index = 0;

        for (int i = 1; i < sums.length; i++) {
            if (sums[i] > max) {
                max = sums[i];
                index = i;
            }
        }

        out.println(max + " " + (index + 2));
        out.flush();
    }
}
