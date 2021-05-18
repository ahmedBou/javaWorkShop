package com.georgiaEdx.part2.module5.abstracte.Canine;

public class Wolf extends Canine {

    protected int rank;

    public Wolf( double size, int rank) {
        super(size);
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public void bark(){
        for(int i=0; i<3;i++){
            System.out.println("the wolf bark: ");
            super.bark();
        }
    }

    public void groom(){};

}
