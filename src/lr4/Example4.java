package lr4;

public class Example4 {
    static void main(String[] args)
    {
        // int height = (int)(Math.random() * 10) + 1;
        // int width = (int)(Math.random() * 10) + 1;
        int height = 10;
        int width = 15;

        String[][] array = new String[height][width];
        double x = (double)(width / height);

        int count = 1;
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[0].length; j++)
            {
                if (j <= i * (width - 1) / (height - 1))
                {
                    array[i][j] = "+";
                } else {
                    array[i][j] = " ";
                }
            }
            count++;
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
