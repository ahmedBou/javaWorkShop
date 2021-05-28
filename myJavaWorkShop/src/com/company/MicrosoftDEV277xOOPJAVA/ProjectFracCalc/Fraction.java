package com.company.MicrosoftDEV277xOOPJAVA.ProjectFracCalc;

import java.util.InputMismatchException;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

        if(denominator == 0){
            throw new IllegalArgumentException();
        }else if(this.denominator<0){
            this.denominator = denominator *(-1);
            this.numerator = numerator*(-1);
        }
    }

    public Fraction(int numerator) {
        this(numerator, 1);
    }

    public Fraction() {
        this(0,1);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction add(Fraction other){
        Fraction newFrac = new Fraction((this.numerator * other.denominator)+
                (this.denominator* other.numerator), (this.numerator*this.denominator));
        return newFrac;
    }
    public Fraction subtract(Fraction other){
        Fraction newFrac = new Fraction((this.numerator * other.denominator)-
                (this.denominator* other.numerator), (this.numerator*this.denominator));
        return newFrac;
    }
    public Fraction divide(Fraction other){
        if (other.numerator==0){
            throw new IllegalArgumentException();
        } else {
            Fraction newFrac= new Fraction((this.numerator*other.denominator),(this.denominator*other.numerator));
            newFrac.toLowestTerm();
            return newFrac;
        }
    }
    public Fraction multiply(Fraction other){
        Fraction newFrac = new Fraction((this.numerator*other.numerator),(this.denominator*other.denominator));
        newFrac.toLowestTerm();
        return newFrac;
    }

    public boolean equals(Object other) {
        if (other instanceof Fraction) {
            Fraction frac2 = (Fraction) other;
            Fraction frac1 = new Fraction(this.numerator, this.denominator);

            if ((frac1.numerator == frac2.numerator) && (frac1.denominator == frac2.denominator)) {
                return true;
            }
            else {
                return false;
            }
        } else {
            throw new InputMismatchException();
        }
    }

    private void toLowestTerm(){
        int gcd=gcd(this.numerator,this.denominator);

        numerator=this.numerator/gcd;
        denominator=this.denominator/gcd;

    }
    public static int gcd(int nominator, int denominator){
        while (nominator!=0 && denominator!= 0){
            int remainder = nominator % denominator;
            nominator= denominator;
            denominator = remainder;

        }
        return nominator;
    }

    double toDouble(){
        return (double) numerator/denominator;
    }

    @Override
    public String toString() {
        return this.numerator + "/"+ this.denominator;
    }

    public static void main(String[] args) {
        Fraction f = new Fraction(3, -3);
        /*
        System.out.println(f.toDouble());
        Fraction f1 = new Fraction(3);
        System.out.println(f1.toDouble());
        Fraction f2 = new Fraction();
        System.out.println(f2.toDouble());
        */
        Fraction other = new Fraction(3, 4);
        System.out.println(other.add(f));
    }
}


