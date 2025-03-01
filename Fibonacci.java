import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter the range for series");
        Scanner sc  = new Scanner(System.in);
        int range=sc.nextInt();
        int a=0,b=1;
        System.out.print(a + " "+ " " + b + " " );
        for(int i=2;i<range;i++){
            int c = a+b;
            System.out.print(c + " ");
            a=b;
            b=c;
        }

    }
}
