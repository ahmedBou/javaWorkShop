package com.georgiaEdx.part1.HW01;

public class StringOperations {
    public static void main(String[] args) {

        String name = "ahmed";
        System.out.println(name);

        name = name.replace("a", "A");
        name = name.replace("d", "z");

        System.out.println(name);

        String url = "www.gatech.edu";
        System.out.println(url);

        String sub = url.substring(0, 10);
        sub += "1234" + url.substring(10, 14);

        System.out.println(sub);









    }
}
