package com.georgiaEdx.part1.module2;

import java.text.DecimalFormat;

public class DecimalFormatDemo {

    public static void main(String[] args) {
        DecimalFormat formatter1 = new DecimalFormat("0.0");
        DecimalFormat formatter2 = new DecimalFormat("00.00");
        DecimalFormat formatter3 = new DecimalFormat(".00");
        DecimalFormat formatter4 = new DecimalFormat("0.00%");

        System.out.println("0.0: "+ formatter1.format(.8675309));
        System.out.println("00.00: " + formatter2.format(.8675309));
        System.out.println(".00: " + formatter3.format(.8675309));
        System.out.println("0.00%: " + formatter4.format(.8675309));


        DecimalFormat formatter = new DecimalFormat("#.00");
        String numStr = formatter.format(.8675309);
        System.out.println(numStr);

        DecimalFormat formatter5 = new DecimalFormat("0.00%");
        double myNum = .314159;
        System.out.println(formatter5.format(myNum));

        DecimalFormat formatter6 = new DecimalFormat("#.00");
        String numStr1 = formatter6.format(555.8675309);
        System.out.println(numStr1);

    }
}
