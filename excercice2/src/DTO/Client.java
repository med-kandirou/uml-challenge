package DTO;

import java.util.List;

public class Client {
    private int id;
    private String fname;
    private String lname;
    private List<Booking> bookings = null;
    private List<Room> rooms = null;
}