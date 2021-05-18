package com.georgiaEdx.part1.module4.array;

import java.util.Arrays;
import java.util.Scanner;

public class Average {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(getIntegers(5)));
        int[] myIntegers = getIntegers(5);
        //System.out.println(Arrays.toString(myIntegers));
        for(int i = 0; i < myIntegers.length; i++){
            System.out.println("Element "+ i +", typed value was "+myIntegers[i]);
        }
        System.out.println("the average is "+getAverage(myIntegers));
    }
    public static int[] getIntegers(int array){
        System.out.println("Enter "+ array+ "integer value");
        int[] a = new int[array];
        for ( int i = 0; i < a.length; i++){
            a[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(a));
        return a;
    }
    public static double getAverage(int[] average){
        int sum = 0;
        for (int j : average) sum += j;
        return (double) sum/(double) average.length;
    }
}
