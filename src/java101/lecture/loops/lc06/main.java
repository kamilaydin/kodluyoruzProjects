package java101.lecture.loops.lc06;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int x, y = 0,sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Basamak Sayıları Toplanacak Sayıyı Giriniz: ");
        x = input.nextInt();
        while (x != 0) {
            x /= 10;
            sum+=x%10;
            y++;
        }
        System.out.println("basamak sayısı: "+ y);

        System.out.println("Basamakların toplamı "+sum);
    }
}
