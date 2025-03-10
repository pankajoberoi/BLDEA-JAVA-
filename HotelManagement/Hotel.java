package HotelManagement;

public class Hotel {
    private String hotelName;
    public Room[] rooms;
    private int roomCount;

    public Hotel(String hotelName, int size) {
        this.hotelName = hotelName;
        rooms = new Room[size];
        roomCount = 0;
    }

    // Method to add a room to the hotel
    public void addRoom(Room r) {
        if (roomCount < rooms.length) {
            rooms[roomCount] = r;
            roomCount++;
            System.out.println("Room added: " + r.getRoomNumber());
        } else {
            System.out.println("Cannot add more rooms. Hotel is full!");
        }
    }

    // Method to display available rooms
    public void displayAvailableRooms() {
        System.out.println("\nAvailable Rooms:");
        for (int i = 0; i < roomCount; i++) {
            if (rooms[i].isAvailable()) {
                rooms[i].displayRoomDetails();
            }
        }
    }

    // Method to display booked rooms and their customer details
    public void displayBookedRooms() {
        System.out.println("\nBooked Rooms:");
        for (int i = 0; i < roomCount; i++) {
            if (!rooms[i].isAvailable() && rooms[i].getCustomer() != null) {
                rooms[i].displayRoomDetails();
            }
        }
    }

    // Method to book a room by room number
    public void bookRoom(int roomNumber, Customer customer) {
        boolean found = false;
        for (int i = 0; i < roomCount; i++) {
            if (rooms[i].getRoomNumber() == roomNumber) {
                found = true;
                if (rooms[i].isAvailable()) {
                    rooms[i].setAvailability(false);
                    rooms[i].setCustomer(customer);
                    System.out.println(customer.getName() + " booked Room " + roomNumber + " successfully!");
                } else {
                    System.out.println("Room " + roomNumber + " is not available.");
                }
                break;
            }
        }
        if (!found) {
            System.out.println("Room " + roomNumber + " not found.");
        }
    }
}
