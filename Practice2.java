import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        //table
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int num=sc.nextInt();

        for(int i=1;i<10;i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }

    }
}
