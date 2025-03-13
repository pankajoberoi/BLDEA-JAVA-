


class Circle{
//a class can be final -> after that it cant be inherited
    final double pi=3.14; 

    public double area(double r){
        return pi*r*r;
    }
    public double perimeter(double r){
        return 2*pi*r;
    }

    // final void Color(){
    //     System.out.println("Color of ball is red");
    // }
}
class CricketBall extends Circle{

}
class BasketBall extends Circle{
    
    void Color(){
        System.out.println("color of ball will be brown");
    }

}

public class Demo13 {
    public static void main(String[] args) {
        
       BasketBall c1=new BasketBall();

       System.out.println(c1.area(2.2)); 
       System.out.println(c1.perimeter(7.8)); 

       c1.Color();


    }
}
