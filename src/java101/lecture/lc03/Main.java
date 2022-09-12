package java101.lecture.lc03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double a,b,c,u;
        System.out.println("Ucgenin kenar uzunluklarini giriniz: ");

        Scanner input=new Scanner(System.in);

        a = input.nextDouble();

        b = input.nextDouble();

        c = input.nextDouble();

        u = (a+b+c)/2;

        double x = u*(u-a)*(u-b)*(u-c);

        System.out.println("Ucgenin alanı: "+ Math.sqrt(x));



    }
}