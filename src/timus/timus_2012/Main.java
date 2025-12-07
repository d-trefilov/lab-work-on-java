package timus.timus_2012;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int f = in.nextInt();

        int numRemainingTasks = 12 - f;
        int timeInMinutes = numRemainingTasks * 45;

        if (timeInMinutes <= 4 * 60)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
