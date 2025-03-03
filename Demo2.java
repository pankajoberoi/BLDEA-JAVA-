
class ComputerMachine {

    public void playMusic() {
        // behaviour-> will do something and return or not
        System.out.println("Playing Music");
    }

    public String getMePen(int acceptMoney) {
        if(acceptMoney>=10){
            return "pen";
        }
        else{
            return "nonono";
        }
        
    }
}

public class Demo2 {
    public static void main(String[] args) {
        // to access a method of another class / design template we will be creating a
        // object

        ComputerMachine obj = new ComputerMachine();// obj - reference varibale

        obj.playMusic();
        String str=obj.getMePen(10);

        System.out.println(str);

    }
}
