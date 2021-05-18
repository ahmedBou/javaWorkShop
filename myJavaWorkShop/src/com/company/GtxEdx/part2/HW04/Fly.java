package com.georgiaEdx.part2.HW04;

public class Fly {
    private double mass;
    private double speed;

    public Fly() {
        this(5, 10);
    }

    public Fly(double initMass) {
        this(initMass, 10);
    }


    public Fly(double mass, double speed) {
        this.mass = mass;
        this.speed = speed;
    }

    @Override
    public String toString() {
        String masses = String.format("%.2f", mass);
        String speedy = String.format("%.2f", speed);
        if(mass == 0){
            return "I'm dead, but i used to be a fly with a speed of "+ masses;
        }else{
            return "I’m a speedy fly with " + speedy +
                    " speed and "+ masses + " mass";
        }
    }

    public void grow(int newMass){
        mass = newMass + mass;
        //If mass is less than 20: increases speed by 1 for every mass the Fly grows until
        // it reaches 20 mass.
        if(mass < 20){
            for (int i=0; i< newMass; i++){
                speed ++;
            }
        }else if(mass >=20){
            for (int i=0; i< newMass; i++){
                speed -= (speed*0.5);
            }

        }
    }

    public boolean isDead(){
        if(mass==0){
            return true;
        }else{
            return false;
        }
    }
    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }


}
