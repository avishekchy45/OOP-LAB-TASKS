package list;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> info = new ArrayList<String>();
        info.add("Avishek Chowdhury");
        info.add("Premier University");
        
        for (String s : info) {
            System.out.println(s);
        }
        
        info.remove(1);
        for (String s : info) {
            System.out.println(s);
        }
        
        info.clear();
        for (String s : info) {
            System.out.println(s);
        }
    }
}
