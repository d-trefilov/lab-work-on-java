package timus.timus_1785;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int digit  = in.nextInt();

        if (digit >= 1 && digit <= 4)
        {
            System.out.println("few");
        }
        else if (digit >= 5 && digit <= 9)
        {
            System.out.println("several");
        }
        else if (digit >= 10 && digit <= 19)
        {
            System.out.println("pack");
        }
        else if (digit >= 20 && digit <= 49)
        {
            System.out.println("lots");
        }
        else if (digit >= 50 && digit <= 99)
        {
            System.out.println("horde");
        }
        else if (digit >= 100 && digit <= 249)
        {
            System.out.println("throng");
        }
        else if (digit >= 250 && digit <= 499)
        {
            System.out.println("swarm");
        }
        else if (digit >= 500 && digit <= 999)
        {
            System.out.println("zounds");
        }
        else if (digit >= 1000)
        {
            System.out.println("legion");
        }
    }
}
