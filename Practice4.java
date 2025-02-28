import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        //Write a program  to display the cube of the number up to an integer.
        System.out.println("Enter the number of digits you want to cube");
        Scanner sc = new Scanner(System.in);
        int range=sc.nextInt();

        for(int i=1;i<=range;i++){
            int cube=0;
            cube=i*i*i;
            System.out.println("Your cube for "+ i + " is "+ cube);
        }


    }
}
