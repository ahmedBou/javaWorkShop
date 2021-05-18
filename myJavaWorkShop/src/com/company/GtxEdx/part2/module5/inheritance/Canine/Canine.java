package com.georgiaEdx.part2.module5.inheritance.Canine;

public class Canine {
    protected double size;

    public Canine(double size){
        this.size = size;
    }

    public void bark(){
        System.out.println("Woof Woof");
    }
}
