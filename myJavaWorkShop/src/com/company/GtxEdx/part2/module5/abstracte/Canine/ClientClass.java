package com.georgiaEdx.part2.module5.abstracte.Canine;

public class ClientClass {
    public static void main(String[] args) {
        Wolf alpha = new Wolf(17.1, 1);

        alpha.bark();

        Dog pattu = new Dog("pattu", 12.0);
        pattu.bark();
    }
}
