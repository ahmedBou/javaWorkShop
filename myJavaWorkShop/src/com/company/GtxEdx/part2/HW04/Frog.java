package com.georgiaEdx.part2.HW04;

public class Frog {
    private String name;
    private int age;
    private double tongueSpeed;
    private boolean isFroglet;
    public static final String species = "Rare pop";

    public Frog(String name){
        this(name, 5, 5);
    }

    public Frog(String name, double ageInYear, double tongueSpeed ){
        this(name, (int)(ageInYear*12), tongueSpeed);
    }

    public Frog(String name, int age, double tongueSpeed) {
        this.name = name;
        this.age = age;
        this.tongueSpeed = tongueSpeed;

        if(this.age>1 && this.age<=7){
            isFroglet = true;
        }
        else{
            isFroglet=false;
        }
    }
    // setters and getters
    public void setSpecies(String species) {
        species = species;
    }

    public void grow(int newAge){
        if(age<12){
            int tempAge = age;
            for(int i= 0; i<newAge; i++){
                if(tempAge <12){
                    tongueSpeed++;
                }
                tempAge++;
            }
        }
        // we add age
        age = age+ newAge;

        // from froglet to frog
        if(age>7){
            isFroglet = false;
        }
        // we decrease tongue speed because the frog is old
        for(int i = 30; i <= 30; i++){
            tongueSpeed--;
        }

    }
    public void grow(){
        if(age<12){
            tongueSpeed++;
        }
        age++;
        for(int i = 30; i <= 30; i++){
            tongueSpeed--;
        }
    }

    public boolean eat(Fly fly){
        if(!fly.isDead()){
            if(tongueSpeed > fly.getSpeed()){
                if((fly.getMass()-age)>=0.5){
                    grow();
                }
                fly.setMass(0);
                return true;
            }else{
                fly.grow(1);
                return false;
            }

        }
        return false;
    }

    @Override
    public String toString(){
        String tongue = String.format("%.2f", tongueSpeed);
        if(isFroglet==true){
            return "My name is " +name+ " and I'm a rare froglet. I'm " +age+ " months old and my tongue has a speed of " +tongue;
        }
        return "My name is " +name+ " and I'm a rare frog. I'm " +age+ " months old and my tongue has a speed of " +tongue;
    }
}
