package java101.lecture.loops.lc07;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int x = 0;
        double a = 0, b = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen harmonik seri icin bir sayı giriniz: ");
        x = input.nextInt();
        for (int i = 1; i <= x; i++) {
            a += (1.0 / i);


        }
        System.out.println("Harmonik seri :"+a);

    }
}
