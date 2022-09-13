package java101.lecture.lc12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double derece;
        System.out.print("Lütfen sıcaklık derecesini giriniz: ");
        Scanner input = new Scanner(System.in);
        derece = input.nextDouble();

        if (derece < 5) System.out.println("kayak yapabilirsiniz!");
        else if (derece < 15 && 5 <= derece) System.out.println("Tam sinemaya gidilecek hava !");
        else if (derece < 25 && 15 <= derece) {
            System.out.println("Tam bir piknik havası");
        } else if (derece >= 25) {
            System.out.println("Bu havada ne yüzülür !");

        }


    }
}