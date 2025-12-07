package lr4;

public class Example5 {
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
                array[i][j] = (int)(Math.random() * 10);;
            }
        }

        // заполнение транспонированного массива
        int[][] arrayTransposed = new int[array[0].length][array.length];
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[0].length; j++)
            {
                arrayTransposed[j][i] = array[i][j];
            }
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

        // вывод транспонированного массива
        System.out.println("\nТранспонированный массив");
        for (int i = 0; i < arrayTransposed.length; i++)
        {
            for (int j = 0; j < arrayTransposed[0].length; j++)
            {
                System.out.print(arrayTransposed[i][j] + " ");
            }
            System.out.println();
        }
    }
}
