package typecasting;

public class Main {

    public static void main(String[] args) {
        byte a = 64, b;
        int i;
        i = a << 2;
        b = (byte) (a << 2);
        System.out.println("a = " + a);
        System.out.println("i = " + i);
        System.out.println("b = " + b);
    }
}
