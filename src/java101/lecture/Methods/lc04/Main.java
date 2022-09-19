package java101.lecture.Methods.lc04;

import java.util.Scanner;

public class Main {
    public static boolean asal(int x){
        boolean sonuc=true;

        for(int i=2;i<x;i++){
            if (x%i==0) {
                sonuc = false;
                break;
            }

        }
        return sonuc;
    }
    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz : ");
        x = input.nextInt();
        System.out.print(asal(x) ? x + " sayısı ASALDIR !" : x + " sayısı ASAL değildir !" );
    }
}
