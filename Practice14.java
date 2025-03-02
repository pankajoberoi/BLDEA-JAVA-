import java.util.Scanner;

public class Practice14 {

    public static int printfactorial(int num){

        if(num==0 || num==1){
            return 1;
        }

        System.out.println("Entering into loop");
        int factorial=1;
        for(int i=num;i>=2;i--){
            System.out.print(i + " x ");
            //factorial=factorial*i;
            factorial*=i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number for factorial");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        int ans=printfactorial(number);

        System.out.println(ans + " is factorial");

    }
}
