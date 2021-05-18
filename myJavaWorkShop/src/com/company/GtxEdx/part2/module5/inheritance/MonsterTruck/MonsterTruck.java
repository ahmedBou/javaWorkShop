package com.georgiaEdx.part2.module5.inheritance.MonsterTruck;

public class MonsterTruck extends Truck{
    public void m1(){
        System.out.println("monster 1");
    }
    public void m2(){
        super.m1();
        super.m2();
    }
    public String toString(){
        return "monster "+ super.toString();
    }

    public static void main(String[] args) {
        MonsterTruck blebee = new MonsterTruck();

        blebee.m1();
        blebee.m2();
        System.out.println(        blebee.toString());
    }

}
