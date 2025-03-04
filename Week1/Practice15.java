import java.util.Scanner;

public class Practice15 {

    public static void showBalance(int balance){
        System.out.println("Your balance is "+ balance);
    }

    public static int Credit(int amt,int balance){
        balance=balance+amt;
        return balance;
    }

    public static int Debit(int amt,int balance){
        if(balance>=amt){
            balance=balance-amt;
            return balance;
        }
        else{
            System.out.println("Insufficient Balance");
            return balance;
        }
    }

    public static void Interest(int balance,int time){
        int value=(balance*7*time)/100;
        System.out.println("After "+ time + " years "+ " your deposited amt will be "+ (balance+value));
    }

    public static void main(String[] args) {

        boolean signOut=false;
        int balance=0;
        while(signOut!=true){
            System.out.println("1.Debit");
            System.out.println("2.Credit");
            System.out.println("3.Balance");
            System.out.println("4.Interest");
            System.out.println("5.Exit");

            Scanner sc = new Scanner(System.in);

            int input=sc.nextInt();

            

            switch (input) {
                case 1:
                    System.out.println("Enter the amt to debit");
                    Scanner sc2 = new Scanner(System.in);
                    int money=sc2.nextInt();
                    balance=Debit(money,balance);
                    System.out.println("Your balance after debit operation is "+ balance);
                    break;

                case 2:
                    System.out.println("Enter the Amt to credit");
                    Scanner sc1 = new Scanner(System.in);
                    int amt=sc1.nextInt();
                    balance=Credit(amt,balance);
                    System.out.println("Your balance after credit operation is "+ balance);
                    break;
                
                case 3:
                    showBalance(balance);
                    break;
                case 4:
                    System.out.println("Enter the time in years and check interest amt");
                    Scanner sc3 = new Scanner(System.in);
                    int time=sc3.nextInt();
                    Interest(balance,time);
                    break;
                case 5:
                    signOut=true;
                    break;
                default:
                    break;
            }




        }
        



    }
}
