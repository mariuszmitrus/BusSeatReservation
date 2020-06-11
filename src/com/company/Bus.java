package com.company;

import java.util.Scanner;

public class Bus extends Vehicle implements Reservation{
    private Integer Seats[][];
    private String NoSeatsArray[];
    protected Bus (Integer ArrayOfSeats [][]){
        this.Seats=ArrayOfSeats;
    };
    @Override
    public void printSeats() {
        for (Integer i[] : this.Seats){
            for (Integer j : i){
                String seat = new String();
                seat += j;
                if (i.equals(0)) seat= "R";
                else if (j==-1) seat = " ";
                System.out.print(seat);
                System.out.print("\t");
            }
            System.out.println();
        }
    }


    @Override
    public void reserveSeats() {
        Scanner scanner = new Scanner(System.in);
        for (int l = 0; l < 5; l++) {
            System.out.print("Enter a Seat number to reserve: ");
            int ans = Integer.parseInt(scanner.nextLine());
            int k = 1;
            int i;
            for(i=0; i<5; i++) {
                int j;
                for(j=0; j<7; j++) {
                    if (k == ans) {
                        if (this.Seats[i][j]== 0) {
                            System.out.println("That seat has already been reserved");
                        }
                        else {
                            this.Seats[i][j]= 0;
                        }
                    }
                    k++;
                }
            }
        }
    }

    @Override
    public Integer[][] mapBusSeats() {
        Integer SeatsWithNumbers [][]= this.Seats;
        int j=0,k=1;
        for(int i=0;i<SeatsWithNumbers.length;i++) {
            for (j = 0; j < SeatsWithNumbers[0].length; j++) {
                if(j==2 || (j<=4 && j>=3 && i==3) || (i<=9 && i>=8 && j==3) || (i==11 && j>=3))SeatsWithNumbers[i][j] = -1;
                else {
                    SeatsWithNumbers[i][j] = k;
                    k++;
                }
            }
        }
        return this.Seats=SeatsWithNumbers;
    }

    @Override
    public void removeSeats() {
        Scanner scanner = new Scanner(System.in);
        for (int l = 0; l < 5; l++) {
            System.out.print("Enter place where are no seats");
            int ans = Integer.parseInt(scanner.nextLine());
            int k = 1;
            int i;
            for(i=0; i<5; i++) {
                int j;
                for(j=0; j<7; j++) {
                    if (k == ans) {
                        if (this.Seats[i][j]== -1) {
                            System.out.println("That seat has already been reserved");
                        }
                        else {
                            this.Seats[i][j]= -1;
                        }
                    }
                    k++;
                }
            }
        }

    }
}
