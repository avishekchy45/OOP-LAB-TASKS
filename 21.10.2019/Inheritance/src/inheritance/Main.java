package inheritance;
class A {
    int i, j;
    A(int a,int b)
    {
        i=a;
        j=b;
    }
    void print() {
        System.out.println(" i = " + i + " j = " + j);
    }
}
class B extends A {
    int k;
    
    B(int a,int b,int c)
    {
        super(a,b);
        k=c;
    }
    void sum() {
        System.out.println(" i + j + k = " + (i + j + k));
    }
}
public class Main {
    public static void main(String[] args) {
        A superOb = new A(3,5);
        B subOb = new B(3,4,5);

        //superOb.i = 40;
        //superOb.j = 50;
        superOb.print();

       // subOb.i = 10;
        //subOb.j = 20;
        //subOb.k = 30;
        subOb.sum();
        
        //superOb.print();
    }
}
