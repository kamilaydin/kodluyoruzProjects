package java101.lecture.Arrays.lc05;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("dizinin boyutu: ");
        int x = inp.nextInt();
        System.out.println("Elemanları ");
        int[] list = new int[x];
        for (int i = 0; i < x; i++) {
            list[i] = inp.nextInt();
        }
        Arrays.sort(list);
        for (int i = 0; i < x; i++) {
            System.out.println(i+ ". Elemanı : "+list[i]);
        }


    }
}
