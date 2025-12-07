package lr4;

public class Example3 {
    static void main(String[] args)
    {

        int a = (int)(Math.random() * 10) + 1;
        int b = (int)(Math.random() * 10) + 1;
        int[][] array = new int[a][b];

        // заполнение массива
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b; j++)
            {
                array[i][j] = 2;
            }
        }

        // вывод массива
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[0].length; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
