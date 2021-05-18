package com.georgiaEdx.part1.module4.array;

import java.util.Arrays;

public class ArrayCodeTracing2d {
    public static void main(String[] args) {
        int[][] numbers = new int[3][4];

        System.out.println(numbers.length);
        System.out.println(numbers[0].length);

        for(int r = 0; r < numbers.length; r++){
            for(int c = 0; c < numbers[0].length; c++){
                numbers[r][c] = r+c;
            }


        }
    }

}
