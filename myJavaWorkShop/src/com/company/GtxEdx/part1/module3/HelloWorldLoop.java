package com.georgiaEdx.part1.module3;

public class HelloWorldLoop {
    public static void main(String[] args) {
        /*
        int lineNum = 10;
        while(lineNum > 0){
            System.out.println("Hello world: "+ lineNum);
            lineNum--;
        }

         */

        int lineNum = 1;
        do{
            System.out.println("hello, world! "+ lineNum);
            lineNum++;
        }while (lineNum<=10);
    }
}
