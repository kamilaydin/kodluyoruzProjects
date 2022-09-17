package java101.lecture.Methods.lc01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number to convert palindrome :");
        int x = input.nextInt();
        System.out.println("Your palindrome value: " + isPalindrome(x));
    }

    public static Boolean isPalindrome(int x) {
        int i = 0, j, num = 0, y = x;
        while (x != 0) {
            x /= 10;
            i++;
        }
        x = y;
        while (y != 0) {
            j = y % 10;
            y /= 10;
            i--;
            System.out.println(j);
            num += (Math.pow(10, i)) * j;
        }
        System.out.println(num);
        if (num == x) return true;
        else return false;
    }
}

