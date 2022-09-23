package hackerRank.JavaStaticInitializerBlock;

import java.util.Scanner;

public class Main {
    static int a;
    static int b;
    static boolean flag = true;

    static {
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        if (a <= 0 || b <= 0) {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        input.close();
    }

    public static void main(String[] args) {
        if (flag) {
            int area = 0;
            area = a * b;
            System.out.println(area);
        }
    }

}
