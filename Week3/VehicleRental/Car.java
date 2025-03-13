package Week3.VehicleRental;

// Create a derived class Car that extends Vehicle with:
// fuelType (String)
// Override toString() to display car details
public class Car extends Vehicle{
    private String fuelType;

    

    public Car(String vehicleNumber, String brand, double pricePerDay,String fuelType) {
        super(vehicleNumber, brand, pricePerDay);
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return super.toString() + " Car [fuelType=" + fuelType + "]";
    }

    

    

    
}
