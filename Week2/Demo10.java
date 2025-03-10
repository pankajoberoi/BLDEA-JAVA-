import java.util.Scanner;

// class Car{
//     public String brand;
// }

class Human{
    String HandShake="Hello....";
    private int age;
    private String name;
    Car car;

    public int getAge(){//permission
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

        

}


public class Demo10 {

    public static void main(String[] args) {

       // Human person1= new Human();
        //person1.age=20;
        //person1.name="Rohan";

        //System.out.println(person1.age + " : " + person1.name);

    //    System.out.println(person1.getAge());//dost

    //    Human Unknown = new Human();
       
    //    System.out.println(Unknown.HandShake);//not permitted


//     Human person2 = new Human();
//     person2.setAge(20);
//     System.out.println(person2.getAge());

//     person2.setName("Pankaj");
//    System.out.println(person2.getName()); 

        Scanner sc = new Scanner(System.in);
        Human humans[] = new Human[2];

        for(int i=0;i<humans.length;i++){
            System.out.println("Enter the pass");
            int pass=sc.nextInt();
            sc.nextLine();

            if(pass==123){
                humans[i]=new Human();

            System.out.println("Enter the name :");
            String name=sc.nextLine();
            //sc.nextLine();
            humans[i].setName(name);

            System.out.println("Enter the age :");
            int age=sc.nextInt();
            sc.nextLine();
            humans[i].setAge(age);

            humans[i].car=new Car();
            System.out.println("Enter the car brand");
            String Carbrand=sc.nextLine();
            //sc.nextLine();
            humans[i].car.brand=Carbrand;
            }


        }


        System.out.println("Details of Human");
        for(Human h:humans){
            System.out.println(h.getName() + " : " +h.getAge() + " : " + h.car.brand);
        }





    
    



       
    }
   

    
}
