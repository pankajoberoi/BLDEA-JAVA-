

class Computer {
    public void playMusic(){
        System.out.println("Playing music");
    }

    public void playGame(){
        System.out.println("Playing game");
    }

    public String pen(int money){
        if(money>10){
            return "pen";
        }
        else{
            return "chal bhaag yaha see";
        }
        
    }
    
}

class calculator{
    int num=5;


    public void add(int a,int b){
        System.out.println("inside class "+ num);
        System.out.println(a+b);
    }

}


public class Practice18 {
    public static void main(String[] args) {
    //     Computer pankaj = new Computer();
    //     pankaj.playMusic();
    //     pankaj.playGame();
    //    System.out.println(pankaj.pen(2)); 
        
        calculator c1= new calculator();
        int num2=c1.num++;
        System.out.println(num2);
        c1.add(10, 20);

        calculator c2 = new calculator();
        int num=c2.num++;
        System.out.println(num);
        c2.add(5, 5);
        


    }
}
