package pkgabstract.pkgclass;
abstract class Exam {
    abstract void gpa();
    abstract void grade();
}
abstract class Result extends Exam {
    void gpa() {
        System.out.println("4.00");
    }
}
class Details extends Result {
    void grade() {
        System.out.println("A+");
    }
}
public class Main {
    public static void main(String[] args) {
        Details ob = new Details();
        ob.gpa();
        ob.grade();
    }
}
