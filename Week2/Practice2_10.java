class Vehicle {

    public String brand;

    public int topSpeed;

    public void start() {
        System.out.println("Brrrummmm brruummm starting....");
    }

    public void stop() {
        System.out.println("band ho gyi no awaazz");
    }
}

class Car extends Vehicle {
    String fuelType;

    public void drive() {
        System.out.println("Drift karengee.......");
    }
}

public class Practice2_10 {
    public static void main(String[] args) {
        // Vehicle v = new Vehicle();
        // v.start(); Parent cant inherit child properties

        Car car = new Car();
        car.brand = "Toyota";
        car.topSpeed = 150;
        car.fuelType = "Petrol";

        System.out.println("Brand : " + car.brand);
        System.out.println("TopSpeed : " + car.topSpeed);
        System.out.println("FuelType : " + car.fuelType);

        car.start();
        car.drive();
        car.stop();
    }
}
