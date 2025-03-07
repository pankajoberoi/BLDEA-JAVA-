import java.util.Scanner;

public class Practice2_1 {
    public static void main(String[] args) {
        // Wap to take marks as input from user for 5 students and print the average;

        int marks[] = new int[5];// Declaraed a array
        Scanner sc = new Scanner(System.in); // input

        for (int i = 0; i < 5; i++) {// 5 -> 5 input -> array
            marks[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < 5; i++) {// traversing
            sum = sum + marks[i];// add
        }

        int average = sum / 5;

        System.out.println("Total is : "+sum);

        System.out.println("Your class average is : " + average);

    }
}
