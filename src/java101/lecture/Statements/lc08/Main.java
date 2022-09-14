package java101.lecture.Statements.lc08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x;
        System.out.println("Toplama islemi icin 1: \n Çıkarma islemi icin 2: \n Çarpma islemi icin 3: \n Bölme islemi icin 4: \n ");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();

        switch(x){
            case 1 :
                System.out.println("Toplama islemini sectiniz : 2 eleman giriniz");
                double a = input.nextInt();
                double b = input.nextInt();
                System.out.println(a+b);
                break;

            case 2:
                System.out.println("Cıkarma islemini sectiniz : 2 eleman giriniz");
                 a = input.nextInt();
                 b = input.nextInt();
                System.out.println(a-b);
                break;

            case 3 :
                System.out.println("Carpma islemini sectiniz : 2 eleman giriniz");
                a = input.nextInt();
                b = input.nextInt();
                System.out.println(a*b);
                break;

            case 4 :
                System.out.println("Bölme islemini sectiniz : 2 eleman giriniz");
                a = input.nextInt();
                b = input.nextInt();
                System.out.println(a/b);
                break;

            default:
                System.out.println("Gecersiz bir sayı girdiniz tekrar deneyiniz");
                break;

        }

    }
}
