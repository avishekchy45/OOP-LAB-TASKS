package method.overriding;
class Calc {
    int i, j;
    Calc(int a, int b) {
        i = a;
        j = b;
    }
    void print() {
        System.out.println("Numbers are: " + i + " " + j);
    }
}
class Sum extends Calc {
    Sum(int a, int b) {
        super(a, b);
    }
    void print() {
        System.out.println("Sum : " + (i+j));
    }
}
class Sub extends Calc {
    Sub(int a, int b) {
        super(a, b);
    }
    void print() {
        System.out.println("Sub : " + (i-j));
    }
}
 public class MethodOverriding {
    public static void main(String args[]) {
        Calc ob = new Calc(54,45);
        ob.print();
        Sum ob1 = new Sum(54,45);
        ob1.print();
        Sub ob2 = new Sub(54,45);
        ob2.print();
    }
}
