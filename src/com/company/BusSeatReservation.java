package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BusSeatReservation<T> {
    protected static void printRow(int[] row) {
        for (int i : row) {
            String seat = new String();
            seat += i;
            if (i==0) seat= "R";
            System.out.print(seat);
            System.out.print("\t");
        }
        System.out.println();
    }

    protected int[][] mapBusSeatsTwoDimention(int countOfRows, int countOfColumns){
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int twoDm[][]= new int[countOfColumns][countOfRows];
        int i,j,k=1;
        double ans;

        for(i=0;i<countOfColumns;i++) {
            for(j=0;j<countOfRows;j++) {
                twoDm[i][j]=k;
                k++;
            }
        }
        return twoDm;
    }


    public static void main(String[] args)throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int twoDm[][]= new int[5][7];
        int i,j,k=1;
        double ans;

        for(i=0;i<5;i++) {
            for(j=0;j<7;j++) {
                twoDm[i][j]=k;
                k++;
            }
        }

        for(int[] row : twoDm) {
            printRow(row);
        }

        for (int l = 0; l < 5; l++) {
            System.out.print("Enter a Seat number to reserve: ");
            ans = Integer.parseInt(br.readLine());
            k = 1;
            for(i=0;i<5;i++) {
                for(j=0;j<7;j++) {
                    if (k == ans) {
                        if (twoDm[i][j]== 0) {
                            System.out.println("That seat has already been reserved");
                        }
                        else {
                            twoDm[i][j]= 0;
                        }
                    }
                    k++;
                }
            }
            for(int[] row : twoDm) {
                printRow(row);
            }
        }

    }
}
