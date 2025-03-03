import java.util.Scanner;

public class Practice16 {


    public static void convertCtoF(double temp){
        double far=(temp*9/5)+32; 
        System.out.println("converted temprature is "+ far+" Fahrenheit");
    }

    public static void convertFtoC(double temp){
        double cel = (temp-32) * 5/9;
        System.out.println("converted temprature is "+ cel+" celsius");
    }

    public static void main(String[] args) {
        
        //convert C to f

        System.out.println("Press C if you are entering your temprature in Celsius");
        System.out.println("Press f if you are entering your temprature in Fahrenheit");

        Scanner sc= new Scanner(System.in);
        char unit=sc.next().charAt(0);

        System.out.println("Enter the temprature");
        double temp=sc.nextDouble();

        switch (unit) {
            case 'C':
                System.out.println("Do you want to convert it into Fahrenheit");
                char input=sc.next().charAt(0);
                if(input=='Y'){
                    convertCtoF(temp);
                }

                
                break;
        
            case 'F':
                System.out.println("Do you want to convert it into celsius");
                char input2=sc.next().charAt(0);
                if(input2=='Y'){
                    convertFtoC(temp);
                }
                
                break;

            default:
                break;
        }




    }
}