package java101.lecture.loops.lc04;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int x, y, k = 1, n = 1, r = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Kombinasyon alınacak ilk sayıyı giriniz");
        x = input.nextInt();
        System.out.println("Kombinasyon alınacak ilk sayıyı giriniz");
        y = input.nextInt();
        for (int i = 0; i <= x; i++) {
            n = n * i;
        }
        for (int i = 0; i <= y; i++) {
            r = r * i;
        }
        int total = x - y;
        for (int i = 0; i <= total; i++) {
            k = k * i;
        }
        int comb = (n / (r * k));
        System.out.println("islem sonucu" + comb);

    }
}
