package com.georgiaEdx.part2.module6.interfaces.Canine;

public class ClientClass {
    public static void main(String[] args) {
        // Since canine is abstract ,that means any object of its concrete subclasses can be inserted.
        // Don't ask why we put wolves and poodle together.The goal here is to show that even though we learned that the elements of an array
        // must be of the same type or the array one compile.There's some flexibility and that rule you impart to inheritance.
        // However, regardless of what's in the array,the operations that we can directly invoke on the elements using their references
        // are dictated by their race type.The references in groomer for example can only invoke the public canine methods on each object.
        // The object will however performance specific classes implementation of that method.
        Groomable[] groomer = {
                new Wolf(17.01, 3),
                new Poodle("richie", 9, "Lux Brand", "Rich Brand"),
                new Wolf(16, 5),
                new Poodle("pixy", 4, "Top Shelf", "Only the Best"),
                new Car("Honda", "Hrv", 2021)
        };

        for(Groomable g: groomer){
            g.groom();
        }
    }
}
