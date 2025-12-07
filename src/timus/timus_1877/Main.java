package timus.timus_1877;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String s1 = in.nextLine();
        String s2 = in.nextLine();

        int lock1  = Integer.parseInt(s1);
        int lock2  = Integer.parseInt(s2);

        if (lock1 % 2 == 0 || lock2 % 2 == 1)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
