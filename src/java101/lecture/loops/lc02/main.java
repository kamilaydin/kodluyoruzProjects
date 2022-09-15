package java101.lecture.loops.lc02;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int x = 0, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Cift sayıları toplama islemi icin giriniz: ");
        do {

            x = input.nextInt();
            if (x % 2 == 0) sum += x;
        }

        while (x % 2 == 0);
        System.out.println(sum + "toplam girilen cift");


    }
}
