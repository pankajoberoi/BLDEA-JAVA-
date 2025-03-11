package VehicleRental;

// Base class Vehicle
class Vehicle {
    private String vehicleNumber;
    private String brand;
    private double pricePerDay;
    private boolean available;

    // Constructor
    public Vehicle(String vehicleNumber, String brand, double pricePerDay) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.pricePerDay = pricePerDay;
        this.available = true; // All vehicles are available by default
    }

    // Getters and Setters
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // toString() method to display vehicle details
    @Override
    public String toString() {
        return "Vehicle Number: " + vehicleNumber + 
               ", Brand: " + brand + 
               ", Price/Day: $" + pricePerDay + 
               ", Available: " + (available ? "Yes" : "No");
    }
}

// Derived class Car
class Car extends Vehicle {
    private String fuelType;

    // Constructor using super to call parent constructor
    public Car(String vehicleNumber, String brand, double pricePerDay, String fuelType) {
        super(vehicleNumber, brand, pricePerDay);
        this.fuelType = fuelType;
    }

    // Getters and Setters
    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    // Overriding toString() to display car details
    @Override
    public String toString() {
        return super.toString() + ", Fuel Type: " + fuelType;
    }
}

// Derived class Bike
class Bike extends Vehicle {
    private boolean helmetIncluded;

    // Constructor using super to call parent constructor
    public Bike(String vehicleNumber, String brand, double pricePerDay, boolean helmetIncluded) {
        super(vehicleNumber, brand, pricePerDay);
        this.helmetIncluded = helmetIncluded;
    }

    // Getters and Setters
    public boolean isHelmetIncluded() {
        return helmetIncluded;
    }

    public void setHelmetIncluded(boolean helmetIncluded) {
        this.helmetIncluded = helmetIncluded;
    }

    // Overriding toString() to display bike details
    @Override
    public String toString() {
        return super.toString() + ", Helmet Included: " + (helmetIncluded ? "Yes" : "No");
    }
}

// Customer class
class Customer {
    private String customerId;
    private String name;

    // Constructor
    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    // Getters and Setters
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // toString() method to display customer details
    @Override
    public String toString() {
        return "Customer ID: " + customerId + ", Name: " + name;
    }
}

// Rental class
class Rental {
    private Customer customer;
    private Vehicle vehicle;
    private int days;

    // Constructor using this keyword
    public Rental(Customer customer, Vehicle vehicle, int days) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.days = days;
        vehicle.setAvailable(false); // Mark vehicle as rented
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return vehicle.getPricePerDay() * days;
    }

    // toString() method to display rental details
    @Override
    public String toString() {
        return customer.toString() + "\n" +
               vehicle.toString() + "\n" +
               "Days: " + days + "\n" +
               "Total Cost: $" + calculateTotalCost();
    }
}

// Main class to execute the program
public class Main {
    public static void main(String[] args) {
        // Create an array of vehicles (hardcoded data)
        Vehicle[] vehicles = new Vehicle[5];
        vehicles[0] = new Car("C101", "Toyota", 50, "Petrol");
        vehicles[1] = new Car("C102", "Honda", 60, "Diesel");
        vehicles[2] = new Bike("B201", "Yamaha", 30, true);
        vehicles[3] = new Bike("B202", "Suzuki", 25, false);
        vehicles[4] = new Car("C103", "BMW", 100, "Electric");

        // Display available vehicles
        System.out.println("==== Available Vehicles ====");
        for (Vehicle v : vehicles) {
            if (v.isAvailable()) {
                System.out.println(v);
            }
        }

        // Create customers (hardcoded data)
        Customer customer1 = new Customer("CU101", "John Doe");
        Customer customer2 = new Customer("CU102", "Jane Smith");

        // Rent a vehicle (hardcoded rental)
        System.out.println("\n==== Renting Vehicles ====");
        Rental rental1 = new Rental(customer1, vehicles[0], 3);
        Rental rental2 = new Rental(customer2, vehicles[2], 2);

        // Display rental details
        System.out.println("\n==== Rental Details ====");
        System.out.println(rental1);
        System.out.println("\n" + rental2);

        // Display available vehicles after rental
        System.out.println("\n==== Available Vehicles After Renting ====");
        for (Vehicle v : vehicles) {
            if (v.isAvailable()) {
                System.out.println(v);
            }
        }
    }
}

