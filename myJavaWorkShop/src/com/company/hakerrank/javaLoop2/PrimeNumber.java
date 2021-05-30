package com.company.hakerrank.javaLoop2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();
        int t = Integer.valueOf(n);
        if (t%2==1 && t/t == 1){
            System.out.println("prime");
        }

    }
}
