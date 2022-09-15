package java101.lecture.loops.lc11;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int x = 0;
        int enb = 0;
        int enk = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("kac sayı girmek istersiniz: ");
        int k = input.nextInt();
        for (int i = 1; i <= k; i++) {
            System.out.println(i + ".Sayıyı giriniz");
            x = input.nextInt();

            if (enb <= x) {
                enb = x;
            }
            else if(enk>=x) {
                enk=x;
            }

        }
        System.out.println("en kucuk sayı :"+enk+"en buyuk sayı : "+enb);

    }
}
