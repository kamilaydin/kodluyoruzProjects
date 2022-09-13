package java101.lecture.lc09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Kullanıcı adı giriniz:");
        Scanner input = new Scanner(System.in);
        String userName = input.nextLine();
        System.out.print("Parolanızı giriniz:");
        String password = input.nextLine();
        if (userName.equals("kamil") && password.equals("aydin"))
            System.out.println("Basari ile giris yaptiniz");
        else System.out.println("Kullanıcı adı veya sifre yanlıs tekrar deneyiniz: ");
    }
}
