package java101.lecture.loops.lc03;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int x = 0;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        System.out.println("bir sayi giriniz");
        for (int i = 5; i <= x; i *= 5) {

            System.out.println(i);
        }
        System.out.println("------------------------");
        for (int j = 4; j <= x; j *= 4) {

            System.out.println(j);
        }

    }
}
