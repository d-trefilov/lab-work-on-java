package timus.semestr_1.timus_1313;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        String inputFileName = "src/task_1313/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;

        try {
            BufferedReader bufferedReader =
                    oj ? new BufferedReader(new InputStreamReader(System.in)) :
                            new BufferedReader(new FileReader(inputFileName));

            int size = Integer.parseInt(bufferedReader.readLine());
            int[][] ints = new int[size][size];

            String readLine = "";
            for (int i = 0; ((readLine = bufferedReader.readLine()) != null) && i < size; i++) {
                String[] strings = readLine.split(" ");
                for (int j = 0; j < size; j++) {
                    ints[i][j] = Integer.parseInt(strings[j]);
                }
            }

            // Первый блок вывода (из второго изображения)
            for (int i = 0; i < size; i++) {
                for (int j = i; j >= 0; j--) {
                    System.out.print(ints[j][i - j] + " ");
                }
            }

            // Второй блок вывода (из первого изображения)
            for (int i = 1; i < size; i++) {
                for (int j = size - 1; j >= i; j--) {
                    System.out.print(ints[j][size - j + i - 1] + " ");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
