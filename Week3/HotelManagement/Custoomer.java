package Week3.HotelManagement;


// name (String) – Customer's name
// contactNumber (String) – Customer's contact details
// bookRoom(Room r) – Book the room if available; otherwise, display "Room not available"
public class Custoomer {
    private String name;
    private String contactNumber;

    public Custoomer(String name, String contactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    

    // public void bookRoom(Room r){

    // }
    
}
