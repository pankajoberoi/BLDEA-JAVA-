class Person{//base
    String name;
    int age;

    public void displayPerson(){
        System.out.println("name : " + name + " age : " + age);
    }
}
class Employee extends Person { //1 . derived
    double salary;

    public void displayEmployee(){
        System.out.println("Employee salary : "+ salary);
    }
}

class Manager extends Employee {//2 .derived
    String department;

    public void displayManager(){
        System.out.println("Manager Department is : " + department);
    }
}




public class Practice2_11 {
    public static void main(String[] args) {
        Manager m1= new Manager();
        m1.name="Anuj";
        m1.age=35;
        m1.salary=90000;
        m1.department="Sales";

        m1.displayPerson();
        m1.displayEmployee();
        m1.displayManager();


    }
}
