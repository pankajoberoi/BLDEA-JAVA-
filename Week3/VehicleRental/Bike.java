package Week3.VehicleRental;

// Create a derived class Bike that extends Vehicle with:
// helmetIncluded (boolean)
// Override toString() to display bike details
public class Bike extends Vehicle {

    private boolean helmetIncluded;

    public Bike(String vehicleNumber, String brand, double pricePerDay, boolean helmetIncluded) {
        super(vehicleNumber, brand, pricePerDay);
        this.helmetIncluded = helmetIncluded;
    }

    public boolean isHelmetIncluded() {
        return helmetIncluded;
    }

    public void setHelmetIncluded(boolean helmetIncluded) {
        this.helmetIncluded = helmetIncluded;
    }

    @Override
    public String toString() {
        return super.toString() + " Bike [helmetIncluded=" + helmetIncluded + "]";
    }

    

    

}
