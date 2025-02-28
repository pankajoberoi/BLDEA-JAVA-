import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        System.out.println("Player 1 Enter a number");
        Scanner p1=new Scanner(System.in);
        int num1=p1.nextInt();

        System.out.println("Player 2 start guessing.........");
        boolean guessed=false;
        int count=0;

        do{
            System.out.println("Player 2 Enter the guessed number");
            Scanner p2=new Scanner(System.in);
            int num2=p2.nextInt();
            
            count++;

            if(num2==num1){
                System.out.println("Balle Ballle u guessed it....");
                guessed=true;
            }
            else if(num2>num1){
                System.out.println("u have guessed a greater number");
            }
            else{
                System.out.println("u have guessed a smaller number");
            }


        }while(guessed!=true);

        System.out.println("You guessed in "+ count + " counts");

    }
}
