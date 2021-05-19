package com.company.CS1102.week6.exam;

public class Lunch {
    public static void main(String[] args) {
        //Foods lunch = new Pepper();//spicy
        //Because the "Pepper" constructor explicitly calls 'super("spicy")', the "Food" constructor that takes a String parameter
        // gets called instead of the "Food" constructor that takes no parameters.

        Food pepper = new Food("spicy");
        System.out.println(pepper.getFlavor());
    }
}
