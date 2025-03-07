class Laptop {

    public void playMusic() {
        // behvaiour -> after processing it will return or print something
        System.out.println("Playing music");
    }

    public String getColdrink(int money){
        if(money>=10){
            return "ColdDrink";
        }
        return "bhagoo yahan see";
        
    }
    

}

public class Demo2 {
    public static void main(String[] args) {
        // to access a method of another class/design/template/we will be creating a
        // object
        Laptop obj = new Laptop();

        obj.playMusic();
        String result=obj.getColdrink(50);
        System.out.println(result);



    }
}
