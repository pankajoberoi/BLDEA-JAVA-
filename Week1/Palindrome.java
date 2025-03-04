import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a no. to check if it is palindrome or not");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int original=num;
        int rev=0;
        while (num!=0) {
            int rem=num%10;
            rev=(rev*10)+rem;
            num=num/10;
        }
        System.out.println(rev+"  is reversed number");

        if(original==rev){
            System.out.println("Its palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }




    }
}
