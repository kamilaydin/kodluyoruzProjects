package java101.lecture.Methods.lc03;

import java.util.Scanner;

public class Main {
    public static int UsluSayi(int taban, int us) {
        int sonuc = 1;
        while (us != 0) {
            sonuc *= taban;

            us--;

        }
        return sonuc;
    }

    public static void main(String[] args) {


        System.out.println("Taban degerini giriniz: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("Us degerini giriniz: ");
        int b = input.nextInt();
        System.out.println(UsluSayi(a, b));

    }
}
