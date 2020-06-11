package com.company;

import java.util.ArrayList;
import java.util.List;

public class JelczL11 extends Bus{
    List<String> positionWithOutSeat = new ArrayList<>();
    protected JelczL11() {
        super(new Integer[12][5]);
    }
    protected JelczL11(Integer[][] ArrayOfSeats) {
        super(ArrayOfSeats);
        addListOfPlaceWithOutSeat(ArrayOfSeats);
    }

    @Override
    protected List<String> addListOfPlaceWithOutSeat(Integer[][] ArrayOfSeats) {
        this.positionWithOutSeat.add("[4][3]");
        this.positionWithOutSeat.add("[4][4]");
        this.positionWithOutSeat.add("[11][3]");
        this.positionWithOutSeat.add("[11][4]");
        this.positionWithOutSeat.add("[8][3]");
        this.positionWithOutSeat.add("[9][3]");
        for(int i = 0; i < ArrayOfSeats.length; i++){
            this.positionWithOutSeat.add("["+i+"][2]");
        }
        return super.addListOfPlaceWithOutSeat(mapBusSeats(this.positionWithOutSeat));
    }
}
