package com.georgiaEdx.part1.HW01;


public class PrimitiveOperations {

    public static void main(String[] args) {

        int hit;
        double availableBlood;

        hit = 12;
        availableBlood = 10.7;

        System.out.println("hit :"+ hit);
        System.out.println("available blood:" +availableBlood);

        String gainOfBlood = String.format("%.2f", (hit * availableBlood));

        System.out.println(gainOfBlood);
        //c) Use casting to convert the integer from the first step to a floating point value and store that in another `new` variable.
        // Print out the value.
        float floatHit = (float) availableBlood;
        System.out.println(floatHit);
        //d) Use casting to convert the floating point value from the first step to an integer type and store that in a `new` variable.
        // Print out the value.

        int intAvailableBlood = (int) availableBlood;
        System.out.println(intAvailableBlood);

        char char1 ='A'; // 65 a = 97
       // e) Shifting focus, declare a `char` variable, and assign an uppercase letter to it. Print out this value.
        System.out.println(char1);

        int small = char1+32;

        //System.out.println("small " + small);

        char x = (char) small;

        System.out.println(x);

    }
}
