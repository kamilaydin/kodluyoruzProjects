package java101.lecture.Statements.lc05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pi = 3.14, r, a;
        System.out.println("Dairenin yarı çapını giriniz: ");
        Scanner input = new Scanner(System.in);
        r = input.nextDouble();
        System.out.println("Dairenin merkez acısını giriniz: ");
        a = input.nextDouble();
        System.out.println("daire diliminin alanı: " + ((pi * (r * r) * a)) / 360);
        System.out.println("Toplam alan: "+ pi*r*r);
        System.out.println("çevre: "+ 2*pi*r);

    }
}