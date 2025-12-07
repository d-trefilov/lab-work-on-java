package lr4;

public class Example6 {
    static void main(String[] args)
    {
        int rows = (int)(Math.random() * 10) + 1;
        int cols = (int)(Math.random() * 10) + 1;
        int[][] array = new int[rows][cols];

        // заполнение массива
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                array[i][j] = (int)(Math.random() * 10);
            }
        }

        // заполнение сокращенного массива
        int[][] arrayReduced = new int[array.length-1][array[0].length-1];
        int rowNumber = (int)(Math.random() * rows);
        int colNumber = (int)(Math.random() * cols);
        int row = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (i == rowNumber) continue;
            int col = 0;
            for (int j = 0; j < array[0].length; j++)
            {
                if (j == colNumber) continue;
                arrayReduced[row][col] = array[i][j];
                col++;
            }
            row++;
        }

        // вывод исходного массива
        System.out.println("Исходный массив");
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[0].length; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        // вывод сокращенного массива
        System.out.println("\nСокращенный массив");
        for (int i = 0; i < arrayReduced.length; i++)
        {
            for (int j = 0; j < arrayReduced[0].length; j++)
            {
                System.out.print(arrayReduced[i][j] + " ");
            }
            System.out.println();
        }
    }
}
