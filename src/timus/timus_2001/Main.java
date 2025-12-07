package timus.timus_2001;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String[] array1 = in.nextLine().split(" ");
        int a1 = Integer.parseInt(array1[0]);
        int b1 = Integer.parseInt(array1[1]);

        String[] array2 = in.nextLine().split(" ");
        int a2 = Integer.parseInt(array2[0]);
        int b2 = Integer.parseInt(array2[1]);

        String[] array3 = in.nextLine().split(" ");
        int a3 = Integer.parseInt(array3[0]);
        int b3 = Integer.parseInt(array3[1]);


        int massBasket1 = a3;
        int massBasket2 = b2;

        int massBerries1 = a1 - massBasket1;
        int massBerries2 = b1 - massBasket2;

        System.out.printf("%d %d", massBerries1, massBerries2);
    }
}
