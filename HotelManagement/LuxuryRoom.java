package HotelManagement;

public class LuxuryRoom extends Room{
    private boolean jacuzziAvailable;

    public LuxuryRoom(int roomNumber, double price, boolean availability, boolean jacuzziAvailable) {
        super(roomNumber, price, availability);
        this.jacuzziAvailable = jacuzziAvailable;
    }

    @Override
    public void displayRoomDetails() {
        System.out.println("Luxury Room " + getRoomNumber() + " - ₹" + getPrice() +
            (jacuzziAvailable ? " - Jacuzzi Available" : " - No Jacuzzi") +
            (isAvailable() ? " - Available" : " - Not Available") +
            (getCustomer() != null ? " - Booked by: " + getCustomer().getName() : ""));
    }
}
