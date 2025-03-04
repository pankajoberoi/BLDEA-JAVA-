import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        // int nums[] ={2,6,4,1}; normal array

        // System.out.println(nums[2]);// random access

        // nums[2]=9;

        // System.out.println(nums[2]);

        // for(int i=0;i<nums.length;i++){
        //     System.out.println(nums[i]);
        // }

        // int num[] = new int[4];
        // Scanner sc= new Scanner(System.in);
        // for(int i=0;i<num.length;i++){
        //     num[i]=sc.nextInt();
        // }

        // for(int i=0;i<num.length;i++){
        //     System.out.println(num[i]);
        // }
        // int nums[][] = new int[3][4];  2D array
        
        // for(int i=0;i<3;i++){
        //     for(int j=0;j<4;j++){
        //         nums[i][j]=(int)(Math.random()*100);
        //     }
            
        // }


        // for(int i=0;i<3;i++){
        //     for(int j=0;j<4;j++){
        //         System.out.print(nums[i][j]+ " ");
        //     }
        //     System.out.println();
        // }

 
        // for(int n[] : nums){
        //     for(int m : n){
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }

        int nums[][]=new int[3][];//jagged array

        nums[0]=new int [3];
        nums[1]=new int [4];
        nums[2]=new int [2];

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j]=(int)(Math.random()*100);
            }
            
        }

        for(int n[] : nums){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }

    }   
}
