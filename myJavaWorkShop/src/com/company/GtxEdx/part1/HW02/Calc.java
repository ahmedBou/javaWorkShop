package com.georgiaEdx.part1.HW02;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double firstNumD;
        Double secNumD;


        System.out.println("List of operations: add subtract multiply divide alphabetize");
        System.out.println("Enter an operation:");
        String operator = input.nextLine().toLowerCase();
        System.out.println("enter two integer");

        while (true) {
            if (!operator.equals("add") && !operator.equals("multiply")
                    && !operator.equals("divide") && !operator.equals("subtract")
                    && !operator.equals("alphabetize")) {
                System.out.println("Invalid input entered. Terminating...");
                break;

            } else {

                switch (operator) {
                    case "add":
                        //firstNumInt = input.nextInt();
                        //secNumInt = input.nextInt();

                        if (true) {
                            //System.out.println("the result is :" + (firstNumInt + secNumInt));

                        }


                        firstNumD = input.nextDouble();
                        secNumD = input.nextDouble();

                }

            }
        }
    }
}
