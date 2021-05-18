package com.georgiaEdx.part1.module4.array;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    private static final Scanner input = new Scanner(System.in);
    private static int[] myIntegers;
    public static void main(String[] args) {

        myIntegers = getInteger(5);

        printArray(myIntegers);

    }

    public static int[] getInteger(int number){
        int[] anArray = new int[number];
        for(int i = 0; i < anArray.length; i++){
            anArray[i] = input.nextInt();
        }
        return anArray;
    }

    public static void printArray(int[] capacity){
        for(int i = 0; i < capacity.length; i++){
            System.out.println("Element "+ i + " Content "+ capacity[i]);
        }
    }

    public static int[] sortArray(int[] array){

        int[] newArray = new int[array.length];

        for(int i = 0; i < array.length; i++){
            newArray[i]= array[i];
        }

        boolean flag = true;
        int temp;
        while(flag){

            for (int i= 0; i< newArray.length-1; i++){
                if(newArray[i]< newArray[i+1]){
                    temp = newArray[i];
                    newArray[i]= newArray[i+1];
                    newArray[i+1] = temp;
                }
            }

        }

        return newArray;
    }
}
