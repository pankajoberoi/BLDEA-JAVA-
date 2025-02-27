import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        // int age = 12;
        // if(age>=18){
        //     System.out.println("Eligible for license");
        // }
        // else{
        //     System.out.println("Ghar baith");
        // }

        // System.out.println("Enter Your age");
        // Scanner sc = new Scanner(System.in);
        // int input=sc.nextInt();
        // System.out.println("My age is "+input);



        // System.out.println("Enter Your salary");

        // Scanner input = new Scanner(System.in);

        //String name=input.next();
        //int age=input.nextInt();
        // float salary=input.nextFloat();

        // System.out.println("My salary is "+ salary);

        Scanner sc = new Scanner(System.in);
        char character=sc.next().charAt(0);

        if(character>=65 && character<=90){
            //capital
        }
        else if(character>=97 && character<=122){
            //lowercase
        }
        else if(character>=48 && character<=57){
            //numeric
        }
        else{
            //special chaRACTER
        }


    }
}
