import java.util.Scanner;

public class FunctionalProgramming {

    public static void printName(String Id){
        // System.out.println("Enter Your Name");
        // Scanner sc = new Scanner(System.in);
        // String name=sc.nextLine();
       System.out.println("Welcome  "+ Id + " ji");
    }


    public static void bonus(int salary,String name){
        int diwaliBonus=1500;
        System.out.println("Welcome " + name + " Your Salary After Bonus is " + (salary+diwaliBonus));
    }

    public static void increment(int num){
        num++;
        System.out.println("I am inside the function "+ num);
    }


    public static int percentage(int phy,int chem, int maths){
        int obtainedTotal=phy+chem+maths;

        int percentage=(obtainedTotal/3) ;

        return percentage;
    }

    public static String Grade(int percent){
        String ans=null;
        if(percent>90){
            ans="A";
        }
        else if(percent<=90 && percent>70){
            ans="B";
        }
        else if(percent<=70 && percent>=50){
            ans="C";
        }
        else{
            ans="Fail";
        }

        return ans;
    }


    // public static String juicer(int apple, int orange){
    //     String juice="Juice of "+ apple + " apple and "+ orange + " oranges";
    //     System.out.println(juice + "Juice in juicer");
    //    return juice;
    // }


    public static void main(String[] args) {

        // System.out.println("Enter Your Name");
        // Scanner sc = new Scanner(System.in);
        // String name=sc.nextLine();

        // printName(name);
        

        // System.out.println("Enter Your Salary");
        // Scanner sc2 = new Scanner(System.in);
        // int input=sc2.nextInt();  

        // bonus(input,name);

       
        // System.out.println("Enter a number");
        // Scanner sc = new Scanner(System.in);
        // int num=sc.nextInt();

        // increment(num);
        // System.out.println("i am in main method " + num);

        // System.out.println("Enter apples for juice");
        // Scanner sc = new Scanner(System.in);
        // int apples=sc.nextInt();

        // System.out.println("Enter oranges for juice");
        // Scanner sc1 = new Scanner(System.in);
        // int oranges=sc1.nextInt();
        
        // String glass=juicer(apples, oranges);

        // System.out.println(glass + " juice in a glass");


        System.out.println("Enter numbers of phy, chem, maths ");
        Scanner sc1 = new Scanner(System.in);
        int phy=sc1.nextInt();
        int chem=sc1.nextInt();
        int maths=sc1.nextInt();

        int percent=percentage(phy, chem, maths);
        System.out.println("My percentage is "+percent);
        String ans=Grade(percent);

        System.out.println("My Grade is "+ ans);


    }
}
