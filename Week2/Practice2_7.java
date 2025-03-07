public class Practice2_7 {

    public static void BubbleSort(int arr[]){
        int flag=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag++;
                }
            }
            if(flag==0){
                break;
            }
        }

        System.out.println("sorted array is : ");
        for(int k : arr){
            System.out.print(k + " ");
        }


    }
    public static void main(String[] args) {
        int arr[]={5,3,1,7,2};

        BubbleSort(arr);


    }
}
