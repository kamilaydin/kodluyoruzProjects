package java101.lecture.loops.lc15;

public class main {
    public static void main(String[] args) {
        int a = 0, b = 1, c = 0;
        for (int x = 0; x <= 10; x++) {
            System.out.print(" " + c + " ");
            c = a + b;
            a = b;
            b = c;
        }

    }
}
