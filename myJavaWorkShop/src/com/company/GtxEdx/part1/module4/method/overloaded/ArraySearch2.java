package com.georgiaEdx.part1.module4.method.overloaded;

public class ArraySearch2 {

    public static boolean searchArray(String target, String[] array) {
        boolean result = false;
        for (String element : array) {
            if ((element != null) && (element.equals(target))) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean searchArray(int target, int[] array) {
        boolean result = false;
        for (int element : array) {
            if (element == target) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean searchArray(double target, double[] array) {
        boolean result = false;
        for (double element : array) {
            if (element == target) {
                result = true;
                break;
            }
        }
        return result;
    }



    public static String searchArray(double target, String[] array) {
        String result = "not found";
        for (String element : array) {
            if (element.equals(target)) {
                result = "found";
                break;
            }
        }
        return result;
    }

    static void sum(int a, double b){
        System.out.println(a);
    }
    static void sum(double a, int b){
        System.out.println(a);
    }



}
