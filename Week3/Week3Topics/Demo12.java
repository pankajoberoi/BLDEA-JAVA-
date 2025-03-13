
// class Parent{
//     Parent(){
//         System.out.println("i am in parent class");
//     }
//     Parent(String Greeting){
//         System.out.println("Namasteee jii ......");
//     }
// }
// class Child extends Parent{
//     Child(){
//         super("Hello jii");
//         System.out.println("i am in child class");
//     }
// }

//Method over riddding

class Bank extends Object {
    Bank() {
        super();
    }

    double getInterestRate() {// decided by child class
        System.out.println("First open an account");
        return 0;
    }
}

class SavingAccount extends Bank {
    double getInterestRate() {
        super.getInterestRate();
        return 4.5;
    }
}

class CurrentAccount extends Bank {
    double getInterestRate() {
        super.getInterestRate();
        return 3.7;
    }
}

public class Demo12 {
    public static void main(String[] args) {

        // Child c1 = new Child();//bell

        // Bank customer1 = new Bank();
        // customer1.getInterestRate();

        Bank customer2 = new SavingAccount();

        System.out.println("Interest rate for customer 2 : " + customer2.getInterestRate());

        // Bank customer3= new CurrentAccount();
        // System.out.println("Interest rate for customer 3 :
        // "+customer3.getInterestRate());

    }
}
