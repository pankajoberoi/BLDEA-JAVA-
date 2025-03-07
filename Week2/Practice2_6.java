import java.util.Scanner;

public class Practice2_6 {
    public static void main(String[] args) {
        
        int arr[]= new int[7];

        System.out.println("Enter values for your array");

        Scanner sc= new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int i=0;
        int j=arr.length-1;


        
        while (i<=j) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            
            i++;
            j--;
        }

        //enhanced for loop

        for(int k : arr){
            System.out.print(k + " ");
        }


    }
}
