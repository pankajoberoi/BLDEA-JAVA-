import java.util.*;

public class Practice2_3 {

    public static int findSmallestElement(int arr[]){
        int smallest=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        return smallest;
    }
    

    public static void main(String[] args) {
        //wap to find smallest element from an array

        int arr[]= new int[5];

        System.out.println("Enter values for your array");

        Scanner sc= new Scanner(System.in);
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }

        int result=findSmallestElement(arr);

        System.out.println(result+" is smallest element of your array ");



    }
}
