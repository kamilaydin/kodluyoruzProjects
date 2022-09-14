package java101.lecture.Statements.lc13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,b,c;
        System.out.print("c sayıyı giriniz");
        Scanner input = new Scanner(System.in);
        a = input.nextDouble();
        System.out.print("b. sayıyı giriniz");
        b = input.nextDouble();
        System.out.print("a. sayıyı giriniz");
        c = input.nextDouble();

        if(a>b && b>c) System.out.println("a>b>c");
        else if (b>a && a>c) {
            System.out.println("b>a>c");
        } else if (c>a && a>b) {
            System.out.println("c>a>b");
        }
        else if (a>c && c>b) {
            System.out.println("a>c>b");
        }
        else if (b>c && c>a) {
            System.out.println("b>c>a");
        }
        else if (c>b && b>a) {
            System.out.println("c>b>a");
        }


    }
}