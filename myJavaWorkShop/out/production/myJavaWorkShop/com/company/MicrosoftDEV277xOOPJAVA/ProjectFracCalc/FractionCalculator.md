Module 2 Project - Fraction Calculator
This project is designed to help you practice building your own object class and testing it with a client class.
You will be creating two classes, one called Fraction and the other called FractionCalculator. 
The Fraction class is an object that holds information about a fraction (numerator and denominator). 
It will have several constructors and both private and public methods implementing the behavior of a fraction. 
The FractionCalculator class is a class that will allow the user to enter in fractions and operations, calculating and displaying the result. 
It will run until the user tells it to quit. When this program is complete, you won’t have to second guess your fraction arithmetic ever again!

Part 1 - Fraction Class
Create a new class called "Fraction" and include the following:

Fields
two private instance variables to hold the numerator and denominator as ints
Constructors
a two parameter constructor that initializes the numerator and denominator
This constructor should throw an IllegalArgumentException if the denominator is zero
If the user enters a negative denominator bump the negative sign to the numerator. For example, -3/-2 should be converted to 3/2. 
Likewise, 5/-3 should be converted to -5/3
example: Fraction myFrac = new Fraction(4,5); creates a fraction who's numerator is 4 and denominator is 5
one parameter constructor that initializes the object equal in value to the integer parameter.
example: Fraction myFrac = new Fraction(3) would create a Fraction with numerator equal to 3 and denominator equal to 1.
zero parameter constructor that initializes the object to 0, meaning the numerator is 0 and the denominator is 1
example: Fraction myFrac = new Fraction(); would create a fraction who's decimal value is 0
You should eliminate as much redundancy as possible by letting your constructors rely on one another using the "this" keyword.