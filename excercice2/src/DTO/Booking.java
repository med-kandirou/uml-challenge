package DTO;

import java.util.Date;
import java.util.List;

public class Booking {
    private int idBooking;
    private Date bookingDate = null;
    private Date arrivingDate = null;
    private Date startingDate = null;
    private int nbrNights = 0;
    private int nbrRooms = 0;
    private List<TypeBooking> types = null;
    private List<Room> rooms = null;
    private List<Client> clients = null;
    private List<Extra> extras = null;
}
