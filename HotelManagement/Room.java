package HotelManagement;

public class Room {
    private int roomNumber;
    private double price;
    private boolean availability;
    private Customer customer; // Associated customer

    public Room(int roomNumber, double price, boolean availability) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.availability = availability;
        this.customer = null; // No customer initially
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void displayRoomDetails() {
        System.out.println("Room " + roomNumber + " - ₹" + price + 
            (availability ? " - Available" : " - Not Available") +
            (customer != null ? " - Booked by: " + customer.getName() : ""));
    }
}
