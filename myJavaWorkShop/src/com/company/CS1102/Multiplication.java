package com.company.CS1102;

import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        for(int i = 1; i <= 10; i++){
                System.out.println(N + " * "+ i + " = " + N*i);
        }
    }
}
