package com.georgiaEdx.part1.HW02;


import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("List of operations: add subtract multiply divide alphabetize");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an operation:");
        String operator = input.nextLine().toLowerCase();


        Double firstNumber;
        Double secondNumber;


        String firstAlpha;
        String secAlpha;


        if(!operator.equals("add") && !operator.equals("multiply")
                && !operator.equals("divide") && !operator.equals("subtract")
                && !operator.equals("alphabetize")){
            System.out.println("Invalid input entered. Terminating...");

        }else{

            switch (operator) {
                case "add":
                    System.out.println("enter two integers");
                    firstNumber= input.nextDouble();
                    secondNumber= input.nextDouble();

                    if(((Object) firstNumber).getClass().getName().equals("java.lang.Double")  ){

                        String str1 = firstNumber.toString();
                        String str2 = secondNumber.toString();

                        String arrOfStr = str1.split("\\.")[1];
                        String arrOfStr2 = str2.split("\\.")[1];

                        if (arrOfStr.equals("0") && arrOfStr2.equals("0")){

                            System.out.println("Answer :" + (int)(firstNumber + secondNumber));

                        }
                        else{
                            System.out.println("Invalid input entered. Terminating...");
                            break;
                        }

                    }

                break;

                case "subtract":
                    System.out.println("enter two integers");
                    firstNumber= input.nextDouble();
                    secondNumber= input.nextDouble();

                    String str1 = firstNumber.toString();
                    String str2 = secondNumber.toString();

                    String arrOfStr = str1.split("\\.")[1];
                    String arrOfStr2 = str2.split("\\.")[1];

                    if (arrOfStr.equals("0") && arrOfStr2.equals("0")) {

                        System.out.println("Answer: " + (int) (firstNumber - secondNumber));

                    } else {
                        System.out.println("Invalid input entered. Terminating...");
                        break;
                    }
                    break;

                case "multiply":
                    System.out.println("enter two doubles");
                    firstNumber= input.nextDouble();
                    secondNumber= input.nextDouble();

                    System.out.printf("Answer: %.2f :", (double) (firstNumber * secondNumber));
                    break;
                case "divide":
                    System.out.println("enter two doubles");
                    firstNumber= input.nextDouble();
                    secondNumber= input.nextDouble();

                    if(secondNumber == 0){
                        System.out.println("Invalid input entered. Terminating...");

                    }else{
                        System.out.printf("Answer: %.2f\n" ,(double) (firstNumber / secondNumber));
                    }
                break;
                case "alphabetize":
                    System.out.println("Enter two words:");
                    firstAlpha = input.next();
                    secAlpha = input.next();
                    if(firstAlpha.toLowerCase().equals(secAlpha.toLowerCase())){
                        System.out.println("Answer: Chicken or Egg.");
                    }else if (firstAlpha.compareTo(secAlpha) > 0) {
                        System.out.println("Answer: "+secAlpha + " comes before " + firstAlpha+ " alphabetically.");

                    } else if (firstAlpha.compareTo(secAlpha) < 0) {
                        System.out.println("Answer: "+firstAlpha + " comes before " + secAlpha+ " alphabetically.");

                    }
                    break;
//hello World

            }
        }

        }

    }

