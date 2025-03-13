interface Computer{
    void code();
}
class Laptop implements Computer{
    public void code(){
        System.out.println("Coding using Laptop");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("Coding using Desktop");
    }
}

class Developer {
    public void devApp(Computer c){
        c.code();
    }
}



public class Demo16 {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        
        Developer pankaj = new Developer();
        pankaj.devApp(desk);
        
    }
}
