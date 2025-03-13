package Week3.VehicleRental;

// In Main class:

// Create an array of vehicles
// Allow customer to rent a vehicle
// Display available and rented vehicles
// Use super and this to manage constructor calls

// Expected Output:
// Display available and rented vehicles
// Calculate and display rental cost
// Use toString() to show customer and vehicle details
public class Main {
    public static void main(String[] args) {
        Vehicle vehicles[] = new Vehicle[4];

        vehicles[0]=new Car("PB 65 123", "Maruti", 1000, "Petrol");

        vehicles[1]=new Car("MH 05 321", "Hyundai", 1500, "Diesel");

        vehicles[2]=new Bike("PB 11 234", "Honda", 500, true);

        vehicles[3]=new Bike("DL 01 721", "Bullet", 800, false);

        System.out.println("Check vehicle Availability");
        for(Vehicle v : vehicles){
            if(v.isAvailable()){
                System.out.println(v);
                System.out.println("\n");
            }
        }

        Customer customer1= new Customer("Cap123","Pankaj");

        Customer customer2= new Customer("Cap321","Eshan");


        System.out.println("Renting Vehicles.......");
        Rental r1 = new Rental(customer1,vehicles[0] , 3);
        
        Rental r2 = new Rental(customer2, vehicles[2],5);

        System.out.println("Rental Transaction Details.....");

        System.out.println(r1);
        System.out.println("\n");
        System.out.println(r2);


        System.out.println("\n");
        System.out.println("Check vehicle Availability after transactions \n");
        for(Vehicle v : vehicles){
            if(v.isAvailable()){
                System.out.println(v);
                System.out.println("\n");
            }
        }


    }
}
