package com.company.practice;

public class FlipPoint {
    private int x;
    private int y;



    public void flip(){
        int temp = -x;
        x = -y;
        y = temp;
    }
}
