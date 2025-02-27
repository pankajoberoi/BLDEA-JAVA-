import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        System.out.println("Enter Your age");
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();

        String output=(age>=18)?"Eligible":"Not Eligible";

        System.out.println(output);
    }
}
