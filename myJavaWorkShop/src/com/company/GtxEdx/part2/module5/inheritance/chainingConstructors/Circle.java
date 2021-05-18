package com.georgiaEdx.part2.module5.inheritance.chainingConstructors;

public class Circle {
    private int x;
    private int y;
    private int width;
    private int height;

    //1st constructor
    public Circle() {
        this(0, 0); // calls the second constructor
    }
    //2nd constructor call the 3rd constructor
    public Circle(int width, int height) {
        this(0,0, width, height);
    }
    // 3rd constructor initialize the instance variables
    public Circle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
