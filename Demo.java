class Calculator {// design

    int a;// attributes

    public int add(int num1, int num2) {// methods
        // System.out.println("in add");
        // return 0;

        int r = num1 + num2;
        return r;
    }

}

public class Demo {
    public static void main(String[] args) {
        int num1 = 4;// primitive varibales
        int num2 = 5;

        // int result = num1+num2;
        // System.out.println(result);

        // add(); why? as we have different class

        // lets create a object from your design

        Calculator calc = new Calculator();// reference variable , object of type calculator , constructor?

        
        int result=calc.add(num1, num2);//done, pass values in arrguments

        System.out.println(result);

    }
}
