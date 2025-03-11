package HotelManagement;

public class DeluxeRoom extends Room{
    private boolean seaView;

    public DeluxeRoom(int roomNumber, double price, boolean availability, boolean seaView) {
        super(roomNumber, price, availability);
        this.seaView = seaView;
    }

    @Override
    public void displayRoomDetails() {
        System.out.println("Deluxe Room " + getRoomNumber() + " - ₹" + getPrice() +
            (seaView ? " - Sea View" : " - No Sea View") +
            (isAvailable() ? " - Available" : " - Not Available") +
            (getCustomer() != null ? " - Booked by: " + getCustomer().getName() : ""));
    }
}
