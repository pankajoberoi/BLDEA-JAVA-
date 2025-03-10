
class Cake{
    String flavour;
    int price;
    static String occation="Birthday";//I.V -> static


    static void show(){
       System.out.println("Your occasion is :"+ occation );
    }

    static void printName(){
        System.out.println("Pankaj in cake class");
    }

}


public class Demo9 {

    public static void printName(){
        System.out.println("Pankaj in DEMO9 class");
    }

    public static void main(String[] args) {

        

        // Cake p1 = new Cake();
        // p1.flavour="Chocolate";
        // p1.price=400;
        // Cake.occation="birthday";
        // Cake.show();


        // Cake p2 = new Cake();
        // p2.flavour="Pineapple";
        // p2.price=350;
        // Cake.occation="birthday";
        // Cake.show();

        // Cake.show();

        //printName();


        Cake.printName();
        
    }    
}
