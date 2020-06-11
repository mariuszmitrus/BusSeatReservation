package com.company;

public class JelczL11 extends Bus{
    private String NoSeatsArray[] = { "[3]"};
    protected JelczL11(Integer[][] ArrayOfSeats) {
        super(ArrayOfSeats);
        this.removeSeats(this.NoSeatsArray);
    }

}
