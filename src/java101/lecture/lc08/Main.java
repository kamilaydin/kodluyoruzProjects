package java101.lecture.lc08;

public class Main {
    public static void main(String[] args) {
        long x=12L;
        System.out.println(x+" can be fitted in:");
        if(x>=-128 && x<=127)System.out.println("* byte");
        if(x>=-32768 && x<=32767)System.out.println("* short");
        if(x>=-2147483648  && x<=2147483647)System.out.println("* integer");
        if(x>=Long.MIN_VALUE  && x<=Long.MAX_VALUE)System.out.println("* long");

    }
}
