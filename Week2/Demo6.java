public class Demo6 {
    public static void main(String[] args) {
        int nums[][]=new int[3][];
        
        nums[0]=new int[2];
        nums[1]=new int[4];
        nums[2]=new int[3];

       
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j]= (int) (Math.random()*10);
            }
        }

        for(int k[]:nums){
            for(int x: k){
                System.out.print(x + " ");
            }
            System.out.println();
        }




    }
}
