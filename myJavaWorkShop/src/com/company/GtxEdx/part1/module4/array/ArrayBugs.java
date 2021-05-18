package com.georgiaEdx.part1.module4.array;

import java.util.Arrays;

public class ArrayBugs {
    public static void main(String[] args) {
        int[] first = new int[2];
        first[0] = 3;
        first[1] = 7;
        int[] second = new int[2];
        second[0] = 3;
        second[1] = 7;

        //second = first;

        System.out.println("first= "+ first);
        System.out.println("second= "+ second);

        if(first == second){
            System.out.println("They contain the same elements.");
        }
        else{
            System.out.println("The elements are different.");
        }
    }
}
