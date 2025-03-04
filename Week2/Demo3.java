
class PinkCalculator {

    public int add(int x, int y,int z){
        // this x and your y -> local variables

        return x+y+z;
    }

    public int add(int x,int y){
        System.out.println(" i am inside int wala fn");
        return x+y;
    }

    public double add(double x,double y){
        System.out.println("i am inside double wala fn");
        return 0.0;
    } 
    
}


public class Demo3 {

    public static void main(String[] args) {
        
        int a=10;
        int b=20;
        int c=30;

        double e=11.5;
        double f=2.5;

        PinkCalculator cal = new PinkCalculator();
        System.out.println(cal.add(e,f)); 

        System.out.println(cal.add(a,b,c));


    }
}