package com.georgiaEdx.part2.module5.polymorphism.drinkSipBitGulp;

public class ClientClass {

    public static void main(String[] args) {
        Object var1 = new Bite();
        Gulp var2 = new Gulp();
        Gulp var3 = new Sip();
        Bite var4 = new Drink();
        Object var5 = new Gulp();
        Gulp var6 = new Drink();
        /*
        //var1.method2();  error
        var2.method2();// Gulp 2/Gulp 3
        var3.method2();// Gulp 2/ Sip 3
        var4.method2();//Gulp 2/ Drink 3
        //var5.method2(); error
        var6.method2(); // Gulp 2/ Drink 3
        // var1.method3(); error
        var2.method3(); // Gulp 3
        var3.method3(); // Sip 3
        var4.method3(); // Drink 3
        // var5.method3(); error
        var6.method3(); // Drink 3

         */
        //((Sip) var6).method1();error
        //((Gulp) var1).method1();error
        //((Gulp) var1).method2();
        //((Bite) var1).method3(); // Bite 3/Gulp3
        //((Bite) var6).method1(); // Bite 1
        //((Drink) var1).method1(); // error
        //((Drink) var4).method2(); //Gulp 2/ Drink 3
        //((Bite) var3).method1(); error
        // error=  ClassCastException:
        // Thrown to indicate that the code has attempted to cast an object to a subclass of which it is not an instance.



    }
}
