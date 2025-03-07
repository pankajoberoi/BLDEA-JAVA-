import java.util.*;

public class Practice2_2 {

    public static String LinearSearch(int arr[],int key){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return "balle balle";
            }
        }

        return "nhi mila kuch";

    }

    public static void main(String[] args) {
        
        int arr[]= new int[5];

        System.out.println("Enter values for your array");

        Scanner sc= new Scanner(System.in);
        for(int i=0;i<4;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the key u want to search");

        int key=sc.nextInt();

        String result=LinearSearch(arr, key);

        System.out.println(result);

    }
}
