package com.georgiaEdx.part1.module4.array2d;

public class ArraySearch {
    public static void main(String[] args) {
        String[] concepts = {
                "abstraction", "polymorphism",
                "inheritance", "encapsulation"
        };
        String result = "not found";
        for( String element : concepts){
            if(element.equals("inheritance")){
                result = "found";
                break;

            }
        }
        System.out.println(result);

    }
}
