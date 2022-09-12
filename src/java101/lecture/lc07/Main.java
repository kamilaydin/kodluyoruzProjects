package java101.lecture.lc07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double Armut =2.14,
        Elma =3.67,
        Domates = 1.11,
        Muz= 0.95,
        Patlıcan =5.00;
        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? ");
        double a = input.nextDouble();
        System.out.print("Elma Kaç Kilo ? ");
        double e = input.nextDouble();
        System.out.print("Domates Kaç Kilo ? ");
        double d = input.nextDouble();
        System.out.print("Muz Kaç Kilo ? ");
        double m = input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? ");
        double p = input.nextDouble();

        System.out.println("Toplam tutar: "+ (Armut*a+Elma*e+Domates*d+Muz*m+Patlıcan*p));



    }
}