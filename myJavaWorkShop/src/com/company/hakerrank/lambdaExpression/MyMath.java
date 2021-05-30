package com.company.hakerrank.lambdaExpression;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MyMath {
    public static boolean checker(PerformOperation p, int num) {
        return p.check(num);
    }

    PerformOperation isOdd()
    {
        PerformOperation po = (int a)-> a%2 == 0 ? false : true;
        return po;
    }
    PerformOperation isPrime()
    {
        PerformOperation po = (int a)->
        {
            if(a == 1) return true;
            else
            {
                for (int i =  2; i < Math.sqrt(a); i++)
                    if(a%i == 0) return false;
                return true;
            }
        };
        return po;
    }
    PerformOperation isPalindrome()
    {
        ArrayList<Integer> aa = new ArrayList<>();
        PerformOperation po = (int a)->
        {
            String str = Integer.toString(a);
            String reverse = "";
            for(int i = str.length()-1; i >= 0; i--)
            {
                reverse = reverse + str.charAt(i);
            }
            if(reverse.equals(str)) return true;
            return false;
        };
        return po;
    }
}
/*
public static PerformOperation is_odd(){
        return (int a) -> a % 2 != 0;
    }

    public static PerformOperation is_prime(){
        return (int a) -> java.math.BigInteger.valueOf(a).isProbablePrime(1);
    }

    public static PerformOperation is_palindrome(){
        return (int a) ->  Integer.toString(a).equals(
           new StringBuilder(Integer.toString(a)).reverse().toString() );
    }
 */

class Solution {

    public static void main(String[] args) throws IOException {
        MyMath ob = new MyMath();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        while (T--> 0) {
            String s = br.readLine().trim();
            StringTokenizer st = new StringTokenizer(s);
            int ch = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (ch == 1) {
                op = ob.isOdd();
                ret = ob.checker(op, num);
                ans = (ret) ? "ODD" : "EVEN";
            } else if (ch == 2) {
                op = ob.isPrime();
                ret = ob.checker(op, num);
                ans = (ret) ? "PRIME" : "COMPOSITE";
            } else if (ch == 3) {
                op = ob.isPalindrome();
                ret = ob.checker(op, num);
                ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

            }
            System.out.println(ans);
        }
    }
}

