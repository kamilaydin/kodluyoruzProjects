package java101.lecture.loops.lc05;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int x, y, sum = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("üssü alınacak sayıyı giriniz");
        x = input.nextInt();
        System.out.println("üssü giriniz");
        y = input.nextInt();

        for (int i = 0; i < y; i++) {
            sum *=x;

        }
        System.out.println(x + " üzeri "  + y + " = " + sum);
    }

}

