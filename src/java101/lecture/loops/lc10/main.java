package java101.lecture.loops.lc10;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int x = 0, y = 0, ebob = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Ebobunu bulmak istediginiz ilk sayıyı giriniz: ");
        x = input.nextInt();
        System.out.println("Ebobunu bulmak istediginiz ikinci sayıyı giriniz: ");
        y = input.nextInt();
        for (int i = 1; i <= x; i++) {
            if (x % i == 0 && y % i == 0) {
                ebob = i;
            }
        }
        System.out.println(ebob);
        System.out.println("ekok: " + x * y / ebob);

    }
}
