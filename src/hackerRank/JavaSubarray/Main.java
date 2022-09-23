package hackerRank.JavaSubarray;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

            Scanner sc = new Scanner(System.in);
            int negativeCounter = 0;

            int arrLen = sc.nextInt();

            int[] arr = new int[arrLen];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            sc.close();

            for (int i = 0; i < arr.length; i++) {
                for (int j = i; j < arr.length; j++) {
                    OptionalInt val = Arrays.stream(arr, i, j + 1).reduce(Integer::sum);
                    if(val.isPresent() && val.getAsInt() < 0){
                        negativeCounter++;
                    }
                }

            }
            System.out.println(negativeCounter);
        }

//    public static List<Pair<Integer, Integer>> getSublistIndexes(int[] arr){
//        List<Pair<Integer, Integer>> result = new LinkedList<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                result.add(Pair.with(i, j + 1));
//            }
//        }
//
//        return result;
//    }
}