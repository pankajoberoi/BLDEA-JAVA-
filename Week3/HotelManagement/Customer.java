package HotelManagement;

public class Customer {
    private String name;
    private String contactNumber;

    public Customer(String name, String contactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    // public void bookRoom(Room r) {
    //     if (r.isAvailable()) {
    //         r.setAvailability(false);
    //         r.setCustomer(this); // Assign customer to the room
    //         System.out.println(name + " successfully booked Room " + r.getRoomNumber());
    //     } else {
    //         System.out.println("Room " + r.getRoomNumber() + " is not available.");
    //     }
    // }
}
