package com.company;

import java.util.ArrayList;
import java.util.List;

public class AutosanH9_03 extends Bus{
    List<String> positionWithOutSeat = new ArrayList<>();
    Integer ArrayOfSeats[][] = new Integer[9][5];;

    //inner and nested class
    protected AutosanH9_03() {
        super(new Integer[9][5]);
    }

    protected AutosanH9_03(Integer[][] ArrayOfSeats) {
        super(ArrayOfSeats);
        addListOfPlaceWithOutSeat(ArrayOfSeats);
    }

    @Override
    protected List<String> addListOfPlaceWithOutSeat(Integer[][] ArrayOfSeats) {
        this.positionWithOutSeat.add("[7][4]");
        this.positionWithOutSeat.add("[7][3]");
        for(int i = 0; i < ArrayOfSeats.length - 1; i++){
            this.positionWithOutSeat.add("["+i+"][2]");
        }
        return super.addListOfPlaceWithOutSeat(mapBusSeats(this.positionWithOutSeat));
    }
}
