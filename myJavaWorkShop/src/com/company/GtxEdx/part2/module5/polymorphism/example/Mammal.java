package com.georgiaEdx.part2.module5.polymorphism.example;

public class Mammal extends Animal{
    public void move(){
        System.out.println("walk");
        super.rest();
    }
    public void eat(){
        System.out.println("meat");
    }
    public void rest(){
        System.out.println("sleep");
    }
}
