package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*JelczL11 test = new JelczL11();
        test.mapBusSeats();
        test.printSeats2();*/
        System.out.print("BUS\n");
        Bus jelczl11 = new JelczL11(new Integer [12][5]);
        jelczl11.mapBusSeats();
        jelczl11.printSeats();
 /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Add numbers of colums of seats");
        Integer Array [][] = new Integer[5][12];
        System.out.print(Array.length);
        System.out.print(Array[0].length);
       int numberOfColumns = scanner.nextInt();
        int numberOfRows = scanner.nextInt();
        BusSeatReservation bus1 = new BusSeatReservation(new Integer[numberOfColumns][numberOfRows]);
        //bus1.mapBusSeatsTwoDimention(numberOfColumns,numberOfRows);
        bus1.reserveSeats(bus1.mapBusSeatsTwoDimention(numberOfColumns,numberOfRows));
        JelczL11 j1= new JelczL11();
        j1.printSeats(5);*/
        }
}
