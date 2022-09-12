package java101.lecture.lc08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fiz, bio, ing, tur, beden, muz, ders;

        Scanner input = new Scanner(System.in);
        System.out.println("matematik notunu gir");
        mat = input.nextInt();

        System.out.println("fizik notunu gir");
        fiz = input.nextInt();

        System.out.println("biology notunu gir");
        bio = input.nextInt();

        System.out.println("ingilizce notunu gir");
        ing = input.nextInt();

        System.out.println("turkce notunu gir");
        tur = input.nextInt();

        System.out.println("beden notunu gir");
        beden = input.nextInt();

        System.out.println("muzik notunu gir");
        muz = input.nextInt();

        System.out.println("Kaç dersin var? ");
        ders = input.nextInt();

        int toplam = mat + fiz + bio + ing + tur + beden + muz;
        double sonuc = toplam / ders;
        System.out.println(sonuc);
        System.out.println((sonuc < 60) ? "fail" : "pass");
    }
}