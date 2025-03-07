import java.util.Scanner;

public class Demo4 {

    public static double percentage(int arr[]){

        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        double percentage=(sum/150)*100;
        return percentage;
    }

    public static void main(String[] args) {
        //we need to store marks for 5 students

        // int studentMarks[] ={94,99,33,20,0};declaraed the array with values

        // System.out.println(studentMarks[2]);

        // studentMarks[2]=88;

        // System.out.println(studentMarks[2]);

        
        //int age[] = new int[4];// declared the array with the size

        // age[0]=22;
        // age[1]=33;
        // age[2]=44;
        // age[3]=77;

        // age[2]=90;


        // you need to print every element of ana array
        
        // System.out.println("Scanning valuess.....");
        // Scanner sc= new Scanner(System.in);
        // for(int i=0;i<4;i++){
        //     age[i]=sc.nextInt();
        // }

        // System.out.println("printing values.....");
        // for(int i=0;i<4;i++){
        //     System.out.println(age[i]);
        // }

        // int arr[]= new int[4];

        // System.out.println(arr[4]);

        // int numbers[] = {22,23,21,20,25};

        // double result=percentage(numbers);

        // System.out.println("your percentage is : "+result);
              

        


    }
}
