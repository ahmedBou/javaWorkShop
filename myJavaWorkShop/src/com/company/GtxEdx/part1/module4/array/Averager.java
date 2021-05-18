package com.georgiaEdx.part1.module4.array;

public class Averager {
    public static void main(String[] args) {
        double[] weekHighs = {80, 70, 75, 69, 72, 74, 90}; //initialization
        double highsSum = 0;
        for (double dayHigh : weekHighs) {
            highsSum = highsSum + dayHigh;
        }
        double averageHighs = highsSum / weekHighs.length;
        System.out.println(averageHighs);
    }
}
