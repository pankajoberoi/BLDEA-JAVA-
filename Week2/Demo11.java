
class Calculator{

    void add(){};
    void sub(){};

}
class AdvCal extends Calculator{//single level inheritance

    void div(){};
    void multi(){};

}

public class Demo11 {
    public static void main(String[] args) {
        Calculator cal = new Calculator();//$10
        cal.add();
        cal.sub();

        AdvCal ac=new AdvCal();//$20
        ac.div();
        ac.multi();
        ac.add();
        ac.sub();


    }
}
