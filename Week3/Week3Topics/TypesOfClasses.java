abstract class Car{
    public abstract void drive();
    public abstract void fly();
    public void Music(){//concret method
        System.out.println("Playing Music");
    }
}
abstract class Maruti extends Car{
    public void drive(){
        System.out.println("Maruti has implemented the logic of engine");
    }

}
class Tesla extends Car{

   
    public void drive() {
       System.out.println("Tesla Electronic engine");
    }

   
    public void fly() {
        System.out.println("tesla provided wings");
    }
    
}


public class TypesOfClasses {
    public static void main(String[] args) {
        // Car c = new Car();
        // c.Music();
        // c.drive();

        // Car c = new Maruti();
        // c.drive();
        // c.Music();

        //Car c = new Hyundai();

        Car c = new Tesla();
        c.Music();
        c.drive();
        c.fly();
            
    
        

    }
    
}
