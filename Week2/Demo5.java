import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        //2D array

        int nums1[][] = new int[2][2];
        int nums2[][] = new int[2][2];
        int nums3[][] = new int[2][2];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums1[i].length;j++){
                nums1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<nums2.length;i++){
            for(int j=0;j<nums2[i].length;j++){
                nums2[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<nums3.length;i++){
            for(int j=0;j<nums3[i].length;j++){
                nums3[i][j]=nums1[i][j]+nums2[i][j];
            }
        }

        
        for(int k[]: nums3){
            for(int x:k){
                System.out.print(x+ " ");
            }
            System.out.println();
        }

        


    }
}
