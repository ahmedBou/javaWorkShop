package com.georgiaEdx.part1.module4.method;

public class GetArraySearch {
    public static void main(String[] args) {
        String[] anotherConcept = {"conditional", "loop" , "functional"};

        System.out.println(ArraySearch.findConcept(anotherConcept, "loop"));

        int[] weekHigh = {80, 70, 75, 69, 72, 74, 90};
        System.out.println(ArraySearch.searchIntArray(80,weekHigh));

    }

}
