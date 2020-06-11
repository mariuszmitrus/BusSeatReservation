package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("BUS\n");
        //Bus jelczl11 = new AutosanH9_03(new Integer [12][5]);
        Bus jelczl11 = new AutosanH9_03();
        jelczl11.printSeats();
        System.out.print("Enter the number of seats to reserve: ");
        jelczl11.reserveSeats(scanner.nextInt());
        jelczl11.printSeats();
        System.out.print("REMOVE\n");
        jelczl11.removeSeats();
        jelczl11.printSeats();

        }
}
