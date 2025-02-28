import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number for factorial");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int factorial=1;
        for(int i=number;i>=2;i--){
            System.out.print(i + " x ");
            //factorial=factorial*i;
            factorial*=i;
        }
        System.out.print( 1 + " = "+factorial);


    }
}
