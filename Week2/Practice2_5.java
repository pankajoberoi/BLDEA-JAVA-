import java.util.Scanner;

public class Practice2_5 {

    public static void findDuplicate(int arr[]){

        for(int i=0;i<arr.length;i++){
            int pick=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(pick==arr[j]){
                    System.out.println(pick + " is duplicate ");
                }
            }
        }


    }
    public static void main(String[] args) {
        //find duplicate

         int arr[]= new int[5];

        System.out.println("Enter values for your array");

        Scanner sc= new Scanner(System.in);
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }

        findDuplicate(arr);

    }
}
