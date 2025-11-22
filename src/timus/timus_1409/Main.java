package timus.timus_1409;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        String[] cans = str.split(" ");

        int cansGarry = Integer.parseInt(cans[0]);
        int cansLarry = Integer.parseInt(cans[1]);

        int totalCans = cansGarry + cansLarry - 1;

        int Garry = totalCans - cansGarry;
        int Larry = totalCans - cansLarry;

        System.out.println(Garry + " " + Larry);
    }
}
