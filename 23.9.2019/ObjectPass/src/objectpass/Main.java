package objectpass;

class Test {

    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    boolean objpass(Test o) {
        if (o.a == a && o.b == b) {
            return true;
        } else {
            return false;
        }
    }
}

/**
 *
 * @author MAC
 */
public class Main {

    public static void main(String[] args) {
        Test ob1 = new Test(1, 2);
        Test ob2 = new Test(1, 2);
        Test ob3 = new Test(3, 4);
        System.out.println("ob1==ob2 : " + ob1.objpass(ob2));
        System.out.println("ob1==ob3 : " + ob1.objpass(ob3));
    }
}
