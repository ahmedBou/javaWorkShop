package com.georgiaEdx.part1.module4.array2d.rowMajor;

import java.util.Scanner;

public class Board {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ship1 = input.nextInt();
        int ship2 = input.nextInt();
        int numRow = 5;
        int numCol = 5;
        String[][] board = new String[5][5];

        int[][] play = new int[ship1][ship2];


        System.out.println(board.length);
        System.out.println(board[1].length);

        //System.out.print("  0 1 2 3 4")
        // ;
        System.out.print("  ");
        for(int i = 0; i < numCol; i++){
            System.out.print(i+ " ");
            //System.out.println();
        }
        for (int row = 0; row < board.length; row++) {
            System.out.println();
            System.out.print(row + " ");
            for (int col = 0; col < board[row].length; col++) {


                System.out.print("- ");

            }
        }
    }
}
