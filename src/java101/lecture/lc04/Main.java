package java101.lecture.lc04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double yol,kmFiyat=2.2,acilisUcret=10,fiyat;
        System.out.println("Kaç km yol gittiniz: ");
        Scanner input = new Scanner(System.in);
        yol=input.nextDouble();



        System.out.println("Taksiye vereceginiz ucret : "+ ((yol*kmFiyat<10)?fiyat=20:yol*kmFiyat+acilisUcret));


    }
}