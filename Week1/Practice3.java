import java.util.Scanner;

public class Practice3 {
    
    public static void main(String[] args) {
        //Write a program in C to read n numbers from the keyboard and find their sum and average.


        System.out.println("Enter the number of digits you want to add");
        Scanner sc = new Scanner(System.in);
        int range=sc.nextInt();

        int sum=0;
        for(int i=1;i<=range;i++){
            System.out.println("Enter your input");
            Scanner input = new Scanner(System.in);
            int user=input.nextInt();
            sum=sum + user;
        }
        System.out.println("Your Sum of input is "+sum);

        System.out.println("Your average is " +sum/range);


    }


}
