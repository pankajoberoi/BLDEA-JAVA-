package Week3.VehicleRental;


// Create a base class Vehicle with:
// vehicleNumber (String)
// brand (String)
// pricePerDay (double)
// available (boolean)
public class Vehicle {

    private String vehicleNumber;
    private String brand;
    private double pricePerDay;
    private boolean available;


    public Vehicle(String vehicleNumber, String brand, double pricePerDay) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.pricePerDay = pricePerDay;
        this.available = true;
    }


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

    @Override
    public String toString() {
        return "Vehicle [vehicleNumber=" + vehicleNumber + ", brand=" + brand + ", pricePerDay=" + pricePerDay
                + ", available=" + available + "]";
    }

    
    
}
