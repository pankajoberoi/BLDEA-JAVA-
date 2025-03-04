import java.util.Scanner;

public class Practice17 {

    public static int checkVowels(String name){
        int countOfVowels=0;
        for(int i=0;i<name.length();i++){
            char alphabet=name.charAt(i);
            if(alphabet=='a'||alphabet=='e'||alphabet=='i'||alphabet=='o'||alphabet=='u'){
                countOfVowels++;
            }
        }


        return countOfVowels;
    }

    public static void main(String[] args) {
        System.out.println("Enter your name to check vowels in it");
        Scanner sc = new Scanner(System.in);
        String name=sc.next();
        String str=name.toLowerCase();
        int totalVowels=checkVowels(str);
        System.out.println("total vowels in your name are "+ totalVowels);



    }
}
