package scanner;

import java.util.Scanner;

class Box {

    double height, width, depth;

    Box(double w, double h, double d) {
        height = h;
        width = w;
        depth = d;
    }

    double volume() {
        return height * width * depth;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the width of the box");
        double width = sc.nextDouble();
        System.out.println("Enter the height of the box");
        double height = sc.nextDouble();
        System.out.println("Enter the depth of the box");
        double depth = sc.nextDouble();

        double vol;
        Box box1 = new Box(width, height, depth);
        vol = box1.volume();
        System.out.println("The volume of the box is: " + vol);
    }
}
