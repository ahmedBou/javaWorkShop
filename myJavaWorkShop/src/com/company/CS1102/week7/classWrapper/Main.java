package com.company.CS1102.week7.classWrapper;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // we can create an array list of String because it is a class a non primitive
        ArrayList<String> StrArrayList = new ArrayList<String>();
        StrArrayList.add("Ahmed");

        // we can't create an ArrayList of int , we get an error , type argument cannot be of primitive type.
        //because a primitive type is not a class.
        //ArrayList<int> intArrayList = new ArrayList<int>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        //It would actually add an object of type IntClass with the value 23 and
        intClassArrayList.add(new IntClass(23));
        //Integer
        Integer integer = new Integer(23);

        // unboxing example
        Integer examFees = new Integer(100);
        int fees = examFees;
        System.out.println(fees);


    }
}
// So, if we had a list of integers, we can't save them in an arrayList.to make it possible i can create a class IntClass
class IntClass{
    private int value;

    public IntClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

// Wrapper class
//The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.(javatpoint.com, n.d)
// The automatic conversion of primitive into an object is known as autoboxing and vice-versa unboxing

// It's a little bit messy because there's all this extra constructor code and here's getters and setters and so forth that
// we'd need to create to do that.
// So wouldn't it be good if there was an easier way to do this and for all the primitive types,Well that's what autoboxing
// is all about because Java does provide us with that functionality.
// Autoboxing
// The automatic conversion of primitive data type into its corresponding wrapper class is known as autoboxing, for example,
// byte to Byte, char to Character, int to Integer, long to Long, float to Float, boolean to Boolean, double to Double, and short to Short.
// In the IntClass Example, We actually created a wrapper, the integer myValue is the variable that's gonna contain the value for this class.
// And we wrapped up in a class. We made sure that it wasn't publicly available the variable. We can only update the variable using a
// constructor initially and then a setter. And you can retrieve the value only by using the getter.So that's sort of the concept of a wrapper.
// So for example in the case of Integer, we can do something like this.
//a new Integer when we're creating a new object, we can actually pass an int value.
// So the difference between Integer and int is that Integer's actually a class.

//Unboxing:
// When we convert the wrapper classes object type values into primitive type value, that behaviour called unboxing.
// For example, let's say you have wrapper object "Integer" which is storing some value.
// Then you went to another variable and assigned your wrapper object type values into "int" primitive data type variable,
// and this is what we called unboxing (Geeksforgeeks, n.d).

