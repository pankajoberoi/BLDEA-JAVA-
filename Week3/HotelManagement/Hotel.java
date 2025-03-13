package Week3.HotelManagement;

// 🔹 Class: Hotel
// hotelName (String) – Name of the hotel
// rooms[] (Array of Room) – Array to store rooms
// addRoom(Room r) – Add a room to the hotel
// displayAvailableRooms() – Display all available rooms with details
// bookRoom(int roomNumber, Customer c) – Book a room for a customer if available; otherwise, display "Room not available"
// displayBookedRooms() – Display details of all booked rooms and which customer booked them
public class Hotel {
    private String hotelName;
    public Room rooms[];// 5 -> capacity of your hotel
    private int countRooms;

    public Hotel(String hotelName, int size) {
        this.hotelName = hotelName;
        rooms = new Room[size];
        countRooms = 0;
    }

    public void addRoom(Room r) {
        if (countRooms < rooms.length) {
            rooms[countRooms] = r;
            countRooms++;
            System.out.println("Room Added : " + r.getRoomNumber());
        } else {
            System.out.println("Can not add more rooms");
        }

    }

    public void displayAvailableRooms() {
        System.out.println("\n Available Rooms");
        for (Room r : rooms) {
            if (r.isAvailability() == true) {
                System.out.println(r);
            }
        }
    }

    public void bookRoom(int roomNumber, Custoomer c) {
        boolean flag=false;
            for(int i=0;i<rooms.length;i++){
                if(rooms[i].getRoomNumber()==roomNumber){
                    flag=true;
                    if(rooms[i].isAvailability()){
                        rooms[i].setAvailability(false);
                        rooms[i].setCustomer(c);
                        System.out.println("Room number "  +roomNumber + " is booked by " + c.getName());
                    }
                    else{
                        System.out.println("roomNumber " + roomNumber +" is not availabe");
                    }
                }

            }
            if(flag==false){
                System.out.println("Room " + roomNumber + " number not found");
            }
    }

    public void displayBookedRooms() {
        System.out.println("\n Booked Rooms");
        for (Room r : rooms) {
            if (r.isAvailability() == false && r.getCustomer() != null) {
                r.displayRoomDetails();
            }
        }

    }

}
