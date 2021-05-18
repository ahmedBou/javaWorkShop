package com.georgiaEdx.part2.module5.inheritance.chainingConstructors;

public class Shape {
    private int x;
    private int y;

    public Shape(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Rectangle extends Shape{
    private int width;
    private int height;

    //1rst constructor
    public Rectangle(int x, int y){
        this(x,y, 0, 0);// calls second constructor
    }

    public Rectangle(int x, int y, int width, int height){
        super(x,y);// calls constructor from parent (shape)
        this.width = width;
        this.height = height;
    }
}
