package java101.lecture.lc02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kdvOran =0.18, kdvOran2=0.08, fiyat;

        Scanner input = new Scanner(System.in);
        System.out.println("Urun fiyatı girin: ");
        fiyat = input.nextDouble();

        System.out.println("kdvli tutar: "+ ((fiyat<1000) ? fiyat+fiyat*kdvOran : fiyat+fiyat*kdvOran2 ));
    }
}