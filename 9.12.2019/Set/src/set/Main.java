package set;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("SET");
        Set<String> set1 = new TreeSet<String>();
        
        set1.add("Avishek");
        set1.add("Foisal");
        
        int i=0;
        System.out.println("LIST : "+i++);
        for (String s : set1) {
            System.out.println(s);
        }
        set1.remove("Avishek");
        System.out.println("LIST :"+i++);
        for (String s : set1) {
            System.out.println(s);
        }
        
        set1.clear();
        System.out.println("LIST :"+i++);
        for (String s : set1) {
            System.out.println(s);
        }
    }
}
