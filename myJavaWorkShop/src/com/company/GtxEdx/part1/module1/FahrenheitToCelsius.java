package com.georgiaEdx.part1.module1;

import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {

        /*
        int saturdayFahrenheit;
        int sundayFahrenheit;

        saturdayFahrenheit = 71;
        sundayFahrenheit = 81;


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a fahrenheit value: ");
        int fahrenheit = input.nextInt();

        System.out.println("Enter a day of the week: ");

        String day = input.nextLine();

        double celsius = (5.0/9)*(fahrenheit - 32);
        System.out.println(day+ " Fahrenheit: "+ fahrenheit);
        System.out.println(day+"Celsius: "+ celsius);
         */
        /*
        double saturdayCelsius = (5D/9)* (saturdayFahrenheit - 32);
        double sundayCelsius = (5.0/9)*(sundayFahrenheit - 32);

        System.out.println("Weekend Averages");
        System.out.println("Saturday: "+ saturdayCelsius);
        System.out.println("Sunday: " + sundayCelsius);
        boolean goToPark = saturdayFahrenheit >60 ? true: false;

         */

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Fahrenheit value and the day of the week: ");
        int fahrenheit = input.nextInt();
        String day = input.nextLine().trim();
        input.nextLine();
        double celsius = (5.0/9) * (fahrenheit - 32);
        System.out.println(day + " Fahrenheit: " + fahrenheit);
        System.out.println(day + " Celsius: " + celsius);
    }
}
