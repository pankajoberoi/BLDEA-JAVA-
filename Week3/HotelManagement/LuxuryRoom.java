package Week3.HotelManagement;


// 🔹 Derived Class 1: LuxuryRoom (inherits from Room)
// jacuzziAvailable (boolean) – Indicates if a jacuzzi is available
public class LuxuryRoom extends Room{
    private boolean jacuzziAvailable;

    

    public LuxuryRoom(int roomNumber, double price, boolean availability,boolean jacuzziAvailable) {
        super(roomNumber, price, availability);
        this.jacuzziAvailable = jacuzziAvailable;
    }

    public boolean isJacuzziAvailable() {
        return jacuzziAvailable;
    }

    public void setJacuzziAvailable(boolean jacuzziAvailable) {
        this.jacuzziAvailable = jacuzziAvailable;
    }

    


}
