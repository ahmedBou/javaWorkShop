package com.georgiaEdx.part1.module4.method;

public class ArraySearch {
    static boolean result;
    public static void main(String[] args) {

        String[] concept = {
                "abstraction", "polymorphism",
                "inheritance", "encapsulation"
        };


        result = findConcept(concept, "polymorphism");
        System.out.println(result);
        result = findConcept(concept, "inheritance");
        System.out.println(result);
        result = findConcept(concept, "superman");
        System.out.println(result);

    }

    public static boolean findConcept(String[] concept, String target){
        result = false;
        for( String element : concept){
            if(element.equals(target)){
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean searchIntArray(int target, int[] array) {
        result = false;
        for (int element : array) {
            if (element == target){
                result = true;
                break;
            }
        }
        return result;
    }


}
