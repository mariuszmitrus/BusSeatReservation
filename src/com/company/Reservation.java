package com.company;

import java.util.List;
import java.awt.*;

public interface Reservation {
    void printSeats();
    void reserveSeats(int numberOfReservation);
    Integer[][] mapBusSeats(List<String> PositionsWithOutSeats);
    void removeSeats(int numberOfSeatsToRemove);
    void removeSeats();


}
