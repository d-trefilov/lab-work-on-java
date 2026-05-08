package lr4;

public class Example2 {

    static void main(String[] args)
    {

        int a = 10;
        int count = 1;

        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < count; j++)
            {
                System.out.print(" +");
            }
            System.out.println(" ");
            count++;
        }

    }
}
