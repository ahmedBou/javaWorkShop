package com.georgiaEdx.part1.HW03;

import java.util.Scanner;

public class Battleship {
     static int player1= 5;
     static int player2;
    public static int numRows = 5;
    public static int numCols = 5;
    public static int boardRows = 10;
    public static int boardCols = 10;
    static String[][] board = new String[boardRows][boardCols];
    public static char water = '-';


    public static void main(String[] args) {
        System.out.println("Welcome to Battleship!");

        //Step 1 – Create the ocean map
        createOceanMap();

        deployPlayerShips();


    }

    public static void createOceanMap(){

        System.out.print("  ");
        for(int i = 0; i < numCols; i++)
            System.out.print(i+ " ");
        System.out.println();

        //Middle section of Ocean Map
        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = " ";
                if (j == 0)
                    System.out.print(i + board[i][j]);

            }
            System.out.println();
        }
    }

    public static void deployPlayerShips(){
        Scanner input = new Scanner(System.in);

        System.out.println("\nDeploy your ships:");
        //Deploying five ships for player
        Battleship.player1 = 5;
        for (int i = 1; i <= Battleship.player1; ) {
            System.out.println("Enter X coordinate for your " + i + " ship: ");
            int x = input.nextInt();
            int y = input.nextInt();

            if((x >= 0 && x < boardRows) && (y >= 0 && y < boardCols) && (board[x][y] == " "))
            {
                board[x][y] =   "@";
                i++;
            }
            else if((x >= 0 && x < boardRows) && (y >= 0 && y < boardCols) && board[x][y] == "@")
                System.out.println("You can't place two or more ships on the same location");
            else if((x < 0 || x >= boardRows) || (y < 0 || y >= boardCols))
                System.out.println("You can't place ships outside the " + boardRows + " by " + boardCols + " grid");
        }
        printOceanMap();
    }

    private static void printOceanMap() {

        System.out.println();
        //First section of Ocean Map
        System.out.print("  ");
        for(int i = 0; i < numCols; i++)
            System.out.print(i);
        System.out.println();

        //Middle section of Ocean Map
        for(int x = 0; x < board.length; x++) {
            System.out.print(x + "|");
            for (int y = 0; y < board[x].length; y++){
                System.out.print(board[x][y]);
            }

            System.out.println("|" + x);
        }

        //Last section of Ocean Map
        System.out.print("  ");
        for(int i = 0; i < numCols; i++)
            System.out.print(i);
        System.out.println();
    }
}



