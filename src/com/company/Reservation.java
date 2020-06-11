package com.company;

import java.util.List;
import java.awt.*;

public interface Reservation {
    void printSeats();
    void reserveSeats();
    void mapBusSeats(List<String> PositionsWithOutSeats);
    void removeSeats();


}
