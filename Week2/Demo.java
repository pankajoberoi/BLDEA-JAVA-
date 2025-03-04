class Calculator{//Design

    int a=5;//instance variable

    public int add(int num1,int num2){//after the processing it will return something
        // System.out.println("i am in Calculator  add fn");
        // return 0;

        System.out.println(a);
        int result = num1+num2;

        return result;
    }

}


public class Demo{

    

    public static void main(String[] args) {
        int num1=4;//primitive variable
        int num2=5;
        // int result = num1+num2;

        // System.out.println(result);

        
        // Calculator cal= new Calculator();//object / instance variable

        // int result=cal.add(num1,num2);

        // System.out.println(result);


        Calculator obj1= new Calculator();

        obj1.add(1,2);
        System.out.println("in main fn"+obj1.a);
        obj1.a=8;

        obj1.add(1,2);

        Calculator obj2 = new Calculator();

        obj2.add(2,3);

        
    }
}