package hospitality;

import java.time.LocalDate;
import java.util.ArrayList;

public class Reserve {
    private Integer idReserve;
    private Integer numRoom;
    private LocalDate startDate;
    private LocalDate dueDate;

    public ArrayList<Room> availableRoom(Hotel hotel){
        return hotel.getRoomsAvailable();

    }

    public void requestRoom(){

    }
}
