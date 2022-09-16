package java101.lecture.loops.lc14;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        for (int i=2; i<=100; i++){
            for (int j=2;j<i;j++){
            if (i%j!=0 ){ System.out.print(i+" ");
                break;
            }
            else break;

        }
        }

    }
}
