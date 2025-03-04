import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("How many even number you want to display"); 

        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();

        for(int i=1;i<=num*2;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }



    }
}
