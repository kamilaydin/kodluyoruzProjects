package java101.lecture.Statements.lc11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fiz, bio, tur, muz, toplam = 0, dersSayisi = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("matematik notunu gir");
        mat = input.nextInt();
        if (mat <= 0 && mat > 100) System.out.println("gecersiz not");
        else {
            toplam += mat;
            dersSayisi++;
        }


        System.out.println("fizik notunu gir");
        fiz = input.nextInt();
        if (fiz <= 0 && fiz > 100) System.out.println("gecersiz not");
        else {
            toplam +=fiz;
            dersSayisi++;
        }

        System.out.println("kimya notunu gir");
        bio = input.nextInt();
        if (bio <= 0 && bio > 100) System.out.println("gecersiz not");
        else {
            toplam +=bio;
            dersSayisi++;
        }

        System.out.println("turkce notunu gir");
        tur = input.nextInt();
        if (tur <= 0 && tur > 100) System.out.println("gecersiz not");
        else {
            toplam +=tur;
            dersSayisi++;
        }

        System.out.println("muzik notunu gir");
        muz = input.nextInt();
        if (muz <= 0 && muz > 100) System.out.println("gecersiz not");
        else {
            toplam +=muz;
            dersSayisi++;
        }


        double sonuc = toplam / dersSayisi;
        System.out.println(sonuc);
        System.out.println((sonuc < 55) ? "fail" : "pass");
    }
}