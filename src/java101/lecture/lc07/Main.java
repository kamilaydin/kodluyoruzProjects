package java101.lecture.lc07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlıcan=5;


        Scanner input = new Scanner(System.in);
        System.out.println("Alacagınız armut kilosunu giriniz: ");
        double a= input.nextDouble();
        System.out.println("Alacagınız elma kilosunu giriniz: ");
        double e= input.nextDouble();
        System.out.println("Alacagınız domates kilosunu giriniz: ");
        double d= input.nextDouble();
        System.out.println("Alacagınız muz kilosunu giriniz: ");
        double m= input.nextDouble();
        System.out.println("Alacagınız patlıcan kilosunu giriniz: ");
        double p= input.nextDouble();

        System.out.println("Toplam Tutar: "+ (armut*a+patlıcan*p+muz*m+domates*d+elma*e) );




    }
}