package interfacedemo;

interface Exam {

    void gpa(float gpa);
}

class Result implements Exam {

    public void gpa(float gpa) {
        System.out.println("GPA: " + gpa);
    }
}

public class Main {

    public static void main(String[] args) {
        Exam ref = new Result();
        ref.gpa(4);
    }
}
