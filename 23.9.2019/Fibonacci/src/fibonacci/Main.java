package fibonacci;
import java.util.Scanner;
class Fibo {
    int series(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return series(n - 1) + series(n - 2);
        }
    }
}
/**
 *
 * @author MAC
 */
public class Main {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many NUMBERS:");
        int n = sc.nextInt();
        Fibo obj = new Fibo();
        for (i = 0; i < n; i++)
        System.out.println(obj.series(i));
    }
}
