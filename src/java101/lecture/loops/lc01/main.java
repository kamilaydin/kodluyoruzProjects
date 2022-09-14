package java101.lecture.loops.lc01;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int x =0;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        for (int i=0; i<=x; i++){
            if (i%2==0)
            System.out.println(i);
        }

    }
}
