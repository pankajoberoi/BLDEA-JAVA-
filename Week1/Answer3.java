import java.util.Scanner;

public class Answer3 {
    public static void main(String[] args) {
        System.out.println("Enter your height in cm");
        Scanner sc = new Scanner(System.in);
        int height=sc.nextInt();

        if(height<150){
            System.out.println("You are doremon");
        }
        else if(height>=150 && height<170){
            System.out.println("bach gya betta");
        }
        else if(height>=170 && height<190){
            System.out.println("Amitabh jii");
        }
        else{
            System.out.println("great khalli");
        }


    }
}
