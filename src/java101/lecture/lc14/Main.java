package java101.lecture.lc14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day,month;
        System.out.print("Dogdugunuz ayı sayı cinsinden giriniz");
        Scanner input = new Scanner(System.in);
        month = input.nextInt();
        System.out.print("Dogdugunuz gunu sayı cinsinden giriniz");
        day = input.nextInt();
        if(month==1 && day<=21) System.out.println("Oglak burcusunuz!");
        else System.out.println("Kova burcusunuz");

        if(month==2 && day<=19) System.out.println("Kova burcusunuz!");
        else System.out.println("Balık burcusunuz");

        if(month==3 && day<=20) System.out.println("Balık burcusunuz!");
        else System.out.println("Koç burcusunuz");

        if(month==4 && day<=20) System.out.println("Koç burcusunuz!");
        else System.out.println("Boğa burcusunuz");

        if(month==5 && day<=21) System.out.println("Boğa burcusunuz!");
        else System.out.println("ikizler burcusunuz");

        if(month==6 && day<=22) System.out.println("İkizler burcusunuz!");
        else System.out.println("Yengeç burcusunuz");

        if(month==7 && day<=22) System.out.println("yengeç burcusunuz!");
        else System.out.println("Aslan burcusunuz");

        if(month==8 && day<=22) System.out.println("Aslan burcusunuz!");
        else System.out.println("Basak burcusunuz");

        if(month==9 && day<=22) System.out.println("Basak burcusunuz!");
        else System.out.println("Terazi burcusunuz");

        if(month==10 && day<=22) System.out.println("Terazi burcusunuz!");
        else System.out.println("Akrep burcusunuz");

        if(month==11 && day<=21) System.out.println("Akrep burcusunuz!");
        else System.out.println("Yay burcusunuz");

        if(month==12 && day<=21) System.out.println("Yay burcusunuz!");
        else System.out.println("Oğlak burcusunuz");


    }
}