package car;
import java.util.Scanner;
class Car {
    String Brand, Model;
    int Doors;
    Car(String b, String m, int d) {
        Brand = b;
        Model = m;
        Doors = d;
    }
    void print() {
        System.out.println("Brand: " + Brand);
        System.out.println("Model: " + Model);
        System.out.println("Doors: " + Doors);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Cars???");       
        int n = sc.nextInt();
        sc.nextLine();      
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Brand of the Car " +(i+1));
            String Brand = sc.nextLine();
            System.out.println("Enter the Model of the Car " +(i+1));
            String Model = sc.nextLine();
            System.out.println("Enter the no. of Doors of the Car " +(i+1));
            int Doors = sc.nextInt();
            sc.nextLine();
            Car obj = new Car(Brand, Model, Doors);
            obj.print();
        }
    }
}
