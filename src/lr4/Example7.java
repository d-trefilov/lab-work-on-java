package lr4;

public class Example7
{
    static void main(String[] args)
    {
        int rows = (int)(Math.random() * 10) + 1;
        int cols = (int)(Math.random() * 10) + 1;
        int[][] array = new int[rows][cols];

        // заполнение массива
        int count = 0;
        for (int i = 0; i < rows; i++)
        {
            if (i % 2 == 0)
            {
                System.out.println("Слева-направо(->)");
                for (int j = 0; j < cols; j++)
                {
                    array[i][j] = count;
                    printArray(array, "-->-->-->-->-->");
                    count++;
                }
            }
            else
            {
                System.out.println("Справа-налево(<-)");
                for (int j = cols-1; j >= 0; j--)
                {
                    array[i][j] = count;
                    printArray(array, "<--<--<--<--<--");
                    count++;
                }
            }
        }
    }

    static void printArray(int[][] array, String dir)
    {
        // вывод массива
        System.out.println(dir);
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

