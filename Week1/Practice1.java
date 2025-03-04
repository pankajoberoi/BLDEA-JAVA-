import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        //find sum of 10 natural numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            sum=sum+i;
        }
        System.out.println(sum);

    }
}
