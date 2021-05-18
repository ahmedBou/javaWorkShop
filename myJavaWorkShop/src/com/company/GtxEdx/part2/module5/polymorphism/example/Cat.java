package com.georgiaEdx.part2.module5.polymorphism.example;

public class Cat extends Animal{
    public void move(){
        System.out.println("walk");
        rest();
    }
    public void eat(){
        System.out.println("meat");
    }
    public void rest(){
        System.out.println("nap");
    }
}
