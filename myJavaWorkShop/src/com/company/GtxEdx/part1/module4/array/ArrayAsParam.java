package com.georgiaEdx.part1.module4.array;

import java.util.Arrays;

public class ArrayAsParam {
    public static void main(String[] args) {
        int[] x = {2, 4, 6};
        System.out.println(Arrays.toString(x));
        doubles(x);
        System.out.println(Arrays.toString(x));
    }
    public static void doubles(int[] a){
        for(int i = 0; i < a.length; i++){
            a[i]= a[i]*2;
        }

    }
}
