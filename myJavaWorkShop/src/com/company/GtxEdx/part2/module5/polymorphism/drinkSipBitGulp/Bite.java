package com.georgiaEdx.part2.module5.polymorphism.drinkSipBitGulp;

public class Bite extends Gulp{
    public void method1() {
        System.out.println("Bite 1");
    }

    public void method3() {
        System.out.println("Bite 3");
        super.method3();
    }
}
