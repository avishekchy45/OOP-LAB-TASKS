package firstprogram;

class PC {

    String brand, processor;
    int ram, hdd;

    /*PC(String brand,String processor,int ram,int hdd){
    this.brand=brand;
    this.processor=processor;
    this.ram=ram;
    this.hdd=hdd;
    }*/
    void print() {
        System.out.println(("Brand of PC: " + brand));
        System.out.println(("Processor: " + processor));
        System.out.println(("RAM: " + ram + " GB"));
        System.out.println(("Harddisk Capacity: " + hdd + " TB"));
    }
}

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PC ob = new PC();
        ob.brand = "ASUS";
        ob.processor = "i5";
        ob.ram = 8;
        ob.hdd = 1;
        ob.print();
    }

}
