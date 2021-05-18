package com.georgiaEdx.part1.HW01;

public class BAD1 {
    public static void main(String[] args) {
        String str = new String("CS1331ROCKS");
        System.out.println(str.length());
        System.out.println(str.length() - 5 + " is 11 - 5");
        int cars = 12;
        if (cars < 20) System.out.println("Parking Available");
        if (cars < 20)
            System.out.println("Parking Available");
        if (cars < 20) {System.out.println("Parking Available");}    }
}
