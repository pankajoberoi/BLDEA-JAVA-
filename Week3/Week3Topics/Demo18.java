interface  Machine {

    void Company();
}



class Desktops implements Machine{
    void Desi(){
        System.out.println("Better performance");
    }

    @Override
    public void Company() {
        System.out.println("SunRise");
    }
}

class Laptopss implements Machine{
    void HP(){
        System.out.println("8gb rah and 256gb rom");
    }

    @Override
    public void Company() {
        System.out.println("MoonRise");
    }
}

class Capgemini{
    void employee(Machine m){
        System.out.println("Yeh coding karta hai.....");
    }
}

public class Demo18 {
    public static void main(String[] args) {
        
        // Laptopss l1=new Laptopss();

        // Capgemini Pankaj = new Capgemini();

        // Pankaj.employee(l1);


        Laptopss l1 = new Laptopss();
        Desktops d1 = new Desktops();

        Capgemini e1= new Capgemini();
        Capgemini e2= new Capgemini();


        e1.employee(d1);
        e2.employee(l1);

    }
}
