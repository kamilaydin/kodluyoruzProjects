package java101.lecture.lc15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mesafe, yas, fiyat = 0.1;
        int tip;

        Scanner input = new Scanner(System.in);
        System.out.println("Gideceginiz mesafeyi Giriniz: ");
        mesafe = input.nextDouble();
        System.out.println("Yasınızı Giriniz: ");
        yas = input.nextDouble();
        System.out.print("Tek yön bilet için:0 Çift yön için:1 Giriniz: ");
        tip = input.nextInt();

        switch (tip) {

            case 0:
                if (yas < 12) System.out.println("Toplam Tutar = " + (mesafe * fiyat / 2) + "TL");
                else if (yas >= 12 && yas <= 24) {
                    System.out.println("Toplam Tutar = " + (mesafe * fiyat / 100 * 90) + "TL");

                } else if (yas > 65) {
                    System.out.println("Toplam Tutar = " + (mesafe * fiyat / 100 * 70));
                }
                break;
            case 1: {
                if (yas < 12) System.out.println("Toplam Tutar = " + ((mesafe * fiyat / 2) / 100 * 80) + "TL");
                else if (yas >= 12 && yas <= 24) {
                    System.out.println("Toplam Tutar = " + ((mesafe * fiyat / 100 * 90) / 100 * 80) + "TL");

                } else if (yas > 65) {
                    System.out.println("Toplam Tutar = " + ((mesafe * fiyat / 100 * 70) / 100 * 80));
                }
            }
            break;
            default:
                System.out.println("Hatalı veri girdiniz lütfen tekrar deneyiniz");
        }
    }
}