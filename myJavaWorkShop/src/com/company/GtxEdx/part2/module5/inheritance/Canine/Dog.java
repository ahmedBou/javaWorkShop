package com.georgiaEdx.part2.module5.inheritance.Canine;

public class Dog extends Canine{
    private String name;

    public Dog(String name, double size) {
        super(size);
        this.name= name;
    }
    public void fetch(){
        System.out.println("Run");
        System.out.println("Clinch");
        System.out.println("Return");
    }
}
