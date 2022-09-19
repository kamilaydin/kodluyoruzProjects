package java101.lecture.Methods.lc05;

import java.util.Scanner;

public class Main {

    public static int Oruntu(int y, int sonuc) {


        System.out.println(sonuc + " ");


        if (y > sonuc && sonuc>=0) {
            sonuc -= 5;
            Oruntu(y,sonuc);
        } else if (sonuc <= 0) {
            sonuc = +5;
            Oruntu(y,sonuc);
        } else if (y==sonuc) {
            return 0;
        }
        return 0;

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("bir sayi giriniz: ");
        int x = inp.nextInt();

        Oruntu(x, x);
    }
}
