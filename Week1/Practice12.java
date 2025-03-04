import java.util.Scanner;

public class Practice12 {
    public static void main(String[] args) {
        System.out.println("Enter a no.");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int original=num;
        int sum=0;
        while (num!=0) {
            int rem=num%10;
            sum=sum+(rem*rem*rem*rem);
            num=num/10;
        }
        System.out.println("sum is "+ sum);
        if(original==sum){
            System.out.println("Armstrong hai");
        }
        else{
            System.out.println("nhi hai");
        }
        
    }
}
