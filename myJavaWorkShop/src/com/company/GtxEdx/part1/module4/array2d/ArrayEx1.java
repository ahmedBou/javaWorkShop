package com.georgiaEdx.part1.module4.array2d;

public class ArrayEx1 {
    public static void main(String[] args) {
        int rows = 5, column = 7;
        int[][] arr = new int[rows][column];

        //2D arrays are row major, so always row first

        for (int row = 0; row < arr.length; row++)
        {
            for (int col = 0; col < arr[row].length; col++)
            {
                arr[row][col] = 5; //Whatever value you want to set them to
            }
        }
        System.out.println(arr.toString());

    }

}
