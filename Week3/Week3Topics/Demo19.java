public class Demo19 {
    public static void main(String[] args) {
        System.out.println("hello..");

        try {
            int arr[] = new int[4];
            String str=null;

            int a = 10;
            int b = 2;

            int result = a / b;
            //System.out.println(arr[8]);
            System.out.println(str.length());            

        }
        catch (ArithmeticException e) {
            System.out.println("Please dont divide it by zero...." + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("U r out of boundary " + e);
        }catch(Exception e){
            System.out.println("Code mai kuch glti hai");
        } 

        System.out.println("Bye bye...");
    }
}