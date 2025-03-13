package Week3.VehicleRental;

// Create a Rental class with:
// Customer object
// Vehicle object
// days (int)
// calculateTotalCost() – Calculate rental cost

public class Rental {
    private Customer customer; //customer1 
    private Vehicle vehicle; //Maruti
    private int days; //3

    public Rental(Customer customer, Vehicle vehicle, int days) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.days = days;
        vehicle.setAvailable(false);
    }

    public double calculateTotalCost(){
        return vehicle.getPricePerDay() * days;
    }

    @Override
    public String toString() {
        return customer.toString() + "\n"+
                vehicle.toString() + "\n"+
                "Days " + days + "\n"+
                "Total Cost : Rs "+ calculateTotalCost();
    }

    

}
