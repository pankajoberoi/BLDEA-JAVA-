import java.util.Scanner;

class Product{
    String name;
    int price;

    Product(String n,int p){
        name=n;
        price=p;
    }

}
public class Practice2_9 {
    public static void main(String[] args) {
        
    Product cart[] = new Product[3];
    Scanner sc= new Scanner(System.in);
    for(int i=0;i<cart.length;i++){
        System.out.println("Enter the name of " + (i+1) + " product");
        String name=sc.nextLine();

        System.out.println("Enter the price of " + (i+1) + " product");
        int price=sc.nextInt();
        sc.nextLine();

        Product obj = new Product(name,price);

        cart[i]=obj;

    }



    int TotalBill=0;

    for(Product i:cart){
        TotalBill=TotalBill+i.price;
    }

    System.out.println("Total bill for your cart : "+TotalBill);



    }
}
