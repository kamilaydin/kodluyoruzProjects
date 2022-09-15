package java101.lecture.loops.lc012;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int x = 0, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz: ");
        x = input.nextInt();

        for (int i = 1; i < x; i++) {

            if (x % i == 0) sum += i;

        }
        if (x == sum)
            System.out.println(x + " Mukemmel sayıdır ");
        else System.out.println(x + " Mukemmel sayı degildir");
    }

}

