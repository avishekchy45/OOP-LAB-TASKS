package javaapplication1;

class Premier {

    int teachers, classrooms, labs;
    String VC;

    /*Premier(int teachers,int classrooms,int labs,String VC){
    this.teachers=teachers;
    this.classrooms=classrooms;
    this.labs=labs;
    this.VC=VC;
     */
    void print() {
        System.out.println(("Numbers of teachers in PUC: " + teachers));
        System.out.println(("Numbers of classrooms in PUC: " + classrooms));
        System.out.println(("Numbers of labs in PUC: " + labs));
        System.out.println(("Name of VC of PUC: " + VC));
    }
}

public class Main {

    public static void main(String[] args) {
        Premier ob = new Premier();
        ob.teachers = 45;
        ob.classrooms = 50;
        ob.labs = 8;
        ob.VC = "Prof. Anupam Sen";
        ob.print();

    }

}
