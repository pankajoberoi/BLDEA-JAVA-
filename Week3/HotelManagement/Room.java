package Week3.HotelManagement;

import Week3.VehicleRental.Customer;

// 🔹 Base Class: Room
// roomNumber (int) – Unique identifier for the room
// price (double) – Cost per night
// availability (boolean) – Indicates whether the room is available
// customer (Customer) – Stores the customer who booked the room
public class Room {
    
    private int roomNumber;
    private double price;
    private boolean availability;
    private Custoomer customer;

    
    public Room(int roomNumber, double price, boolean availability) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.availability = availability;
        this.customer=null;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public boolean isAvailability() {
        return availability;
    }
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    public Custoomer getCustomer() {
        return customer;
    }
    public void setCustomer(Custoomer customer) {
        this.customer = customer;
    }

   
    public String toString() {
        return "Room [roomNumber=" + roomNumber + ", price=" + price + "]";
    }

    public void displayRoomDetails(){
        System.out.println("Room " + roomNumber + " -Rs: " + price + (availability==true?" _Available ":" Not Available") + (customer != null ? " -Booked By " + customer.getName():" koi nhi hai yahan "));
    }

    

    


}
