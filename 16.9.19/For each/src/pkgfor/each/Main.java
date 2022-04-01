package pkgfor.each;

public class Main {

    public static void main(String[] args) {
        int nums[] = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 5;
        Boolean found = false;
        for (int x = 0; x < nums.length; x++) {
            if (x == val) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Value Found");
        }
    }

}
