package Week3.HotelManagement;

// 🔹 Main Method:
// Create a Hotel object
// Add multiple rooms to the hotel
// Create Customer objects and allow them to book rooms
// Display available rooms before and after booking
// Display details of booked rooms and their customers


public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("JW.mariot", 4);

        hotel.addRoom(new LuxuryRoom(101, 2000, true, true));
        hotel.addRoom(new DeluxeRoom(102, 1000, true, true));

        hotel.addRoom(new LuxuryRoom(103, 1500, true, false));
        hotel.addRoom(new DeluxeRoom(104, 700, true, false));

        hotel.displayAvailableRooms();

        Custoomer customer1= new Custoomer("Pankaj", "8360008012");
        Custoomer customer2= new Custoomer("Rajat", "9041234876");
        Custoomer customer3= new Custoomer("Eshan", "123456789");

        System.out.println("Room Bookings....\n");
        hotel.bookRoom(101, customer2);
        hotel.bookRoom(104, customer1);
        hotel.bookRoom(102, customer3);

       // hotel.bookRoom(101, customer1);

       System.out.println();
       hotel.displayBookedRooms();

       System.out.println();
       hotel.displayAvailableRooms();




    }
}
