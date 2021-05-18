package com.georgiaEdx.part1.HW03;

import java.text.DecimalFormat;
import java.util.*;
public class Test2 {
    public static void main(String []args){
        /*
        System.out.println("X");
        //System.out.println("Y");
        String $InAndOutState = "";
        System.out.println($InAndOutState);
        System.out.println((true || (false || true || false && false)));

        String pos = "guard";
        int val = (4 / 6) / 2 + pos.indexOf("pointguard");
        System.out.println(val);
        final int daysUntil2021 = 106;
        //dayssUntil2021 = (int)106.0;
        int inTwoDays = daysUntil2021 - 2;
        System.out.println(inTwoDays);
        //daysUntil2021 = 0.0;
        daysUntil2021--;

        int x = 2;
        if ((x != 2) && (x == 3)) {
            System.out.println("2");
        }

        int upNext = 1332;
        switch (upNext) {
            case 1:
                upNext -= 1;
            case 3:
                upNext -= 2;
            case 13:
                upNext -= 3;
            case 1332:
                upNext++;
            case 1333:
                upNext--;
        }
        System.out.println(upNext);
        System.out.println(2 < 2 ? "<" : ":");
        System.out.println(-24 % -6);
        String first = "1";
        String second = "2";
        int third = 1;
        System.out.println(first + second + third);

        int x = 100;
        if (x > 0)
            System.out.println("launch");
        else if (x >= 100)
            System.out.println("lift off");
        else
            System.out.println("float");

        System.out.println((int) 5.5);
        System.out.println(4 - ((int) 5.5 + 2.5) / 1);
        System.out.println(false || "jackets".equals("Jackets"));

        DecimalFormat tForm = new DecimalFormat("##.00");
        System.out.println(tForm.format(12682.1));
         */
        String funnyStr = "south, long island";
        funnyStr.replace("!"," ");
        System.out.println(funnyStr);
        funnyStr.replace("the beach","");
        System.out.println(funnyStr);

        funnyStr.replace(", long", "");
        System.out.println(funnyStr);

        funnyStr.replace("wal","roc");
        System.out.println(funnyStr);

        funnyStr.toUpperCase();

        System.out.println(funnyStr);
    }



}
