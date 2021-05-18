package com.georgiaEdx.part2.HW04;

public class Pond {
    public static void main(String[] args) {
        //we create frog objects
        Frog peepo = new Frog("Peepo");
        Frog pepe = new Frog("Pepe", 10,15);
        Frog peepaw = new Frog("Peepaw",4.6,5);
        Frog frogWoow= new Frog("FrogWoow", 3.5,6);
        //we create fly objects
        Fly f1 = new Fly(3, 1);
        Fly f2 = new Fly(6);
        Fly f3 = new Fly(4, 5);
        //we set specicies for peepo
        peepo.setSpecies("1331 frog");
        //print peepo's info
        System.out.println(peepo.toString());
        //we tried to eat fly 2 but we can't because
        //our tongue speed is lesser than it's flying speed
        peepo.eat(f2);
        //we print the info for fly 2
        System.out.println(f2.toString());
        //pepoo grows as well as its tongue speed
        peepo.grow(8);
        //we can properly eat fly 2 now
        peepo.eat(f2);
        //we print info
        System.out.println(f2.toString());
        System.out.println(peepo.toString());
        System.out.println(frogWoow.toString());
        //we grew peepaw
        peepaw.grow(4);
        System.out.println(peepaw.toString());
        System.out.println(pepe.toString());
    }
}
