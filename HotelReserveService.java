package bridgelabzWorkshop4HotelReservation;
import java.util.ArrayList;
import java.util.List;

public class HotelReserveService {
List<Hotel> hotelList = new ArrayList<>();
public boolean add(Hotel hotel){
    hotelList.add(hotel);
    return true;
}
}
