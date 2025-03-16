public class Demo20 {
    public static void main(String[] args) {
        try{
            int a=0;
            int b=10;
            if(a==0){
                throw new ArithmeticException();
            }
            int result = a/b;
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
