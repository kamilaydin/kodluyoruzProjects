package java101.lecture.Arrays.lc04;

public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 2, 4, 1, 6, 7, 7, 8, 9, 9, 5, 5, 4, 4, 6, 6, 6};
        int[] arr = new int[list.length];
        int index = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j] && list[i] % 2 == 0 && i != j ) {
                    arr[index] = list[j];

                }
            }
        }
        for (int row : arr) {
            if (row != 0) System.out.print(row);

        }
    }
}
