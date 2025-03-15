interface Payment{
   void pay(double amount);
    void refund(double amount);
}
class CreditCardPayment implements Payment{

    private String cardNumber;
    private double balance;


    public CreditCardPayment(String cardNumber, double balance) {
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    @Override
    public void pay(double amount) {
        if(balance>=amount){
            balance=balance-amount;
            System.out.println("Payment of Rs : "+ amount + " successfully done via Credit card" );
        }
        else{
            System.out.println("Chal be gareeb....");
        }
    }

    @Override
    public void refund(double amount) {
        balance = balance + amount;
        System.out.println("Refund of Rs : "+ amount + "  processed to your credit card");
    }

    @Override
    public String toString() {
        return "CreditCardPayment [cardNumber=" + cardNumber + ", balance=" + balance + "]";
    }

    
}
class UPIPayment implements Payment{
    private String UpiId;
    private boolean upiPinCorrect;


    public UPIPayment(String upiId, boolean upiPinCorrect) {
        UpiId = upiId;
        this.upiPinCorrect = upiPinCorrect;
    }

    @Override
    public void pay(double amount) {
        if(upiPinCorrect==true){
            System.out.println("Payemt Successful Rs : "+ amount + " via upi");
        }
        else{
            System.out.println("Andhe pin to sahi daal");
        }
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund of Rs : " + amount + " processed for your upi transaction");
    }

    @Override
    public String toString() {
        return "UPIPayment [UpiId=" + UpiId + ", upiPinCorrect=" + upiPinCorrect + "]";
    }

}
class Razorpay{
    public static void processTransaction(Payment p,double amount){
        System.out.println("Processing Transaction ....");
        p.pay(amount);
        System.out.println(p);
    }
    public static void processRefund(Payment p,double amount){
        System.out.println("Refund in Process...");
        p.refund(amount);
        System.out.println(p);
    }
}


public class PaymentSystem {
    public static void main(String[] args) {
        CreditCardPayment HDFC = new CreditCardPayment("1234-1234-1234-1234", 1000);

        UPIPayment phone = new UPIPayment("Pankaj@oksbi", false);

        System.out.println("---Credit card payment on Myntra----");
        Razorpay.processTransaction(HDFC, 700);

        System.out.println("---UPI payment on Zomato---");
        Razorpay.processTransaction(phone, 200);

        System.out.println("---Refund from Myntra---");
        Razorpay.processRefund(HDFC, 700);



    }   
}
