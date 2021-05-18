package com.georgiaEdx.part2.module6.interfaces.Canine;

public abstract class Canine implements Groomable{
    protected double size;

    public Canine(double size){
        this.size = size;
    }

    public void bark(){

        System.out.println("Woof Woof");
    }

    public abstract void groom();
}
