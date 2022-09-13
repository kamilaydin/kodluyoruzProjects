package java101.lecture.lc09;

import java.util.Objects;
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
        else {
            System.out.println("Kullanıcı adı veya sifre yanlıs sifre yenilemek icin 1 e basın: cıkıs icin 2 ye basın:");
            int x = input.nextInt();

            switch (x) {
                case 1:
                    System.out.print("Yeni sifreniz: ");
                    String newPass = input.nextLine();

                    if (Objects.equals(password, newPass)) {
                        System.out.println("Yeni sifreniz eski sifreniz ile aynı olamaz!");

                    } else password = newPass;
                    break;
                case 2:
                    System.out.println("basari ile cikis yaptiniz !");
                    break;
                default:
                    System.out.println("Gecersiz giris tekrar deneyiniz");
                    break;

            }


        }
    }
}
