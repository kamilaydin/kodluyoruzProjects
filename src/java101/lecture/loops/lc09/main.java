package java101.lecture.loops.lc09;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");

                System.out.println("1-Para yatırma\n" +
                        "2-Para Çekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-Çıkış Yap");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                select = input.nextInt();
                switch (select) {
                    case 1: {
                        System.out.println("Yatırmak istediginiz tutarı giriniz: ");
                        int x = input.nextInt();
                        balance += x;
                        System.out.println("Para Yatırma Başarılı Yeni Bakiye " + balance);
                        break;
                    }
                    case 2: {
                        System.out.println("Çekmek istediginiz tutarı giriniz: ");
                        int x = input.nextInt();
                        balance -= x;
                        System.out.println("Para Çekme Başarılı Yeni Bakiye " + balance);
                        break;
                    }
                    case 3: {
                        System.out.println("Bakiyeniz " + balance);
                        break;
                    }
                    case 4: {
                        System.out.println("Başarı ile çıkış yaptınız yine bekleriz! ");
                    }
                    default:
                        System.out.println("Geçersiz bir deger girdiniz tekrar deneyiniz");
                }

            }
        }
    }
}




