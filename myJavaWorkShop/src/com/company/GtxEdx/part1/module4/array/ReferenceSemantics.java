package com.georgiaEdx.part1.module4.array;

import java.util.Arrays;

public class ReferenceSemantics {
    public static void main(String[] args) {
        int[] a = {1,2, 5, 6};
        int[] b = a;
        b[1] = 3;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }


}
