package com.georgiaEdx.part1.module4.method.overloaded;

public class ArraySearchOverloaded {

    public static void main(String args[]) {
        String[] lullabies = {"Wheels on the Bus", "Twinkle, Twinkle Little Star",
                "Itsy Bitsy Spider", "Swing Low Sweet Chariot",
                "Amazing Grace"};
        System.out.println(ArraySearch2.searchArray("Humpty Dumpty", lullabies));

        int[] weekHighs = {80, 70, 75, 69, 72, 74, 90};
        System.out.println(ArraySearch2.searchArray(90, weekHighs));

        double[] weekHighsD = {80, 70, 75, 69, 72, 74, 90};
        System.out.println(ArraySearch2.searchArray(90.0, weekHighsD));

        ArraySearch2.sum(12, 12.4);
        ArraySearch2.sum(1.2, 12);





    }
}
