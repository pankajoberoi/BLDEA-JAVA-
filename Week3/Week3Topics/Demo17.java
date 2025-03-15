interface ComputerBluePrint {
    // public -> abstract
    void show();

    void config();

    double pi=3.14; //final and static


}

class Laptops implements ComputerBluePrint {

    @Override
    public void show() {
        System.out.println("I am a macbook");
    }

    @Override
    public void config() {
        System.out.println("I have 8gb ram 128 gb storage");
    }

    

}

public class Demo17 {
    public static void main(String[] args) {
        Laptops c1 = new Laptops();
        c1.config();
        c1.show();

        //ComputerBluePrint.pi=22.7; we cant change final value
        System.out.println(ComputerBluePrint.pi);

        //c1.config();
        //c1.show();
    }
}
