package lr13.Ex2;

import java.util.Scanner;

public class Task2_NoException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.print("Введите номер столбца: ");
        int col = sc.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][col]);
        }
    }
}
