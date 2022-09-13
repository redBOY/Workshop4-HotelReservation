package bridgelabzWorkshop4HotelReservation;

public class HotelReservationMain {
    public static void main(String[] args) {
        System.out.println("welcome to HotelReservation program");
        HotelReserveService hotelReservation = new HotelReserveService();
        hotelReservation.addHotel(new Hotel("Lakewood",110));
        hotelReservation.addHotel(new Hotel("Ridgwood",220));
    }
}
