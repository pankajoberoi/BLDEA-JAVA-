public class Practice2_8 {

    public static void BinarySearch(int arr[],int key){
        int low=0;//role of index
        int high=arr.length-1;
        boolean flag=false;
        while(low<=high){
            int mid= (high+low)/2;//index value
            if(arr[mid]==key){
                System.out.println(key + " Element found");
                flag=true;
                break;
            }
            else if(arr[mid]<key){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if(flag==false){
            System.out.println("Element not found");
        }



    }


    public static void main(String[] args) {
        //binary search


        int arr[]={2,4,6,8,10,12,16,18};
        int key=16;
        BinarySearch(arr,key);

    }
}
