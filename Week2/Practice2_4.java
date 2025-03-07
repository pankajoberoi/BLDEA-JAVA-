import java.util.Scanner;

public class Practice2_4 {

    public static String findSortedOrNot(int arr[]){

        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]<arr[i]){
                return "it is not sorted";
            }
        }
        return "sorted";

    } 


    public static void main(String[] args) {
        //wap to check if array is sorted in ascending order

        int arr[]= new int[5];

        System.out.println("Enter values for your array");

        Scanner sc= new Scanner(System.in);
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(findSortedOrNot(arr)); 
    }
}
