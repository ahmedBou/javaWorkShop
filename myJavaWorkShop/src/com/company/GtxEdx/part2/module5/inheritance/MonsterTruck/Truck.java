package com.georgiaEdx.part2.module5.inheritance.MonsterTruck;

public class Truck extends Car {
    public void m1(){
        System.out.println("truck 1");
    }
    public void m2(){
        super.m1();
    }
    public String toString(){
        return "vroom";
    }


}


class SuperClass{
    public void printMethod(){
        System.out.println("Printed in superClass");
    }

}
class SubClass extends SuperClass{   // subclass aka child class
    // override method from parent
    @Override
    public void printMethod(){
        super.printMethod(); // calls method in superClass (parent)
        System.out.println("Printed in Subclass");
    }
}
class ClientClass{
    public static void main(String[] args) {
        SubClass s = new SubClass();
        s.printMethod();
    }
}