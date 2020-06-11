package com.company;


import java.util.List;
import java.util.Scanner;

public class Bus extends Vehicle implements Reservation{
    private Integer Seats[][];

    protected Bus(Integer[][] ArrayOfSeats){
        this.Seats=ArrayOfSeats;
    };

    public Bus() {
    }

    protected List<String> addListOfPlaceWithOutSeat(Integer[][] ArrayOfSeats){
        this.Seats=ArrayOfSeats;
        return  null;
    }

    @Override
    public void printSeats() {
        for (Integer i[] : this.Seats){
            for (Integer j : i){
                String seat = new String();
                seat += j;
                if (j == 0) seat= "R";
                else if (j.equals(-1)) seat = " ";
                System.out.print(seat);
                System.out.print("\t");
            }
            System.out.println();
        }
    }

    @Override
    public void reserveSeats(int numberOfReservation) {
        Scanner scanner = new Scanner(System.in);
        for (int l = 0; l < numberOfReservation; l++) {
            System.out.print("Enter a Seat number to reserve: ");
            int ans = Integer.parseInt(scanner.nextLine());
            for(int i=0; i<this.Seats.length; i++) {
                for(int j=0; j<this.Seats[0].length; j++) {
                    if (this.Seats[i][j].equals(ans)) {
                        if ( this.Seats[i][j] == -1) {
                            System.out.println("That seat has already been reserved");
                        }
                        else {
                            this.Seats[i][j]=0;
                        }
                    }
                }
            }
        }
    }

    @Override
    public Integer[][] mapBusSeats(List<String> PositionsWithOutSeats) {
        Integer SeatsWithNumbers [][]= this.Seats;
        int j=0,k=1;
        for(int i=0;i<SeatsWithNumbers.length;i++) {
            for (j = 0; j < SeatsWithNumbers[0].length; j++) {
                if(PositionsWithOutSeats.contains("["+i+"]["+j+"]"))SeatsWithNumbers[i][j] = -1;
                else {
                    SeatsWithNumbers[i][j] = k;
                    k++;
                }
            }
        }
        return SeatsWithNumbers;
    }

    @Override
    public void removeSeats(int numberOfSeatsToRemove) {
        Scanner scanner = new Scanner(System.in);
        for (int l = 0; l < numberOfSeatsToRemove; l++) {
            System.out.print("Enter a Seat number to remove: ");
            int ans = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < this.Seats.length; i++) {
                for (int j = 0; j < this.Seats[0].length; j++) {
                    if (this.Seats[i][j].equals(ans)) {
                        if (this.Seats[i][j] == -1) {
                            System.out.println("That seat has already been removed");
                        } else {
                            this.Seats[i][j] = -1;
                        }
                    }
                }
            }
        }
    }

    @Override
    public void removeSeats() {
        removeSeats(1);
    }
}
