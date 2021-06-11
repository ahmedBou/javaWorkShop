package com.company.GtxEdx.part1.module4.array.SortArray;

import java.util.Scanner;

public class MinSelectionSort {
    public static Scanner input = new Scanner(System.in);
    public static int[] sortedArray;
    public static int[] newArray;

    public static void main(String[] args) {

        int[] forSorted =myInteger(5);
        int[] toPrint = minSortedArray(forSorted);
        printArray(toPrint);
    }

    public static int[] myInteger(int number){
        int[] newArray = new int[number];
        for (int i =0; i< newArray.length; i++){

            newArray[i] = input.nextInt();
        }
        return newArray;
    }

    public static void printArray(int[] number){
        for (int i=0; i< number.length; i++){
            System.out.println("the element"+ number[i]);
        }
    }


    public static int[] minSortedArray(int[] number) {

        int minIndex;
        int nextSmallest;

        for (int unsortedStart = 0; unsortedStart < number.length-1; unsortedStart++){
            minIndex = unsortedStart;
            System.out.println(minIndex);
            for(int currentIndex = unsortedStart+1;currentIndex< number.length; currentIndex++){
                if(number[currentIndex] < number[minIndex]){
                    minIndex = currentIndex;
                    System.out.println(minIndex);
                }
            }

            nextSmallest = number[minIndex];
            System.out.println(nextSmallest);
            number[minIndex] = number[unsortedStart];
            System.out.println(number[minIndex]);
            number[unsortedStart] = nextSmallest;
            System.out.println(number[unsortedStart]);

        }
        return number;
    }
}
