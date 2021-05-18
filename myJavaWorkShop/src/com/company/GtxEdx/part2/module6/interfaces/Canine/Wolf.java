package com.georgiaEdx.part2.module6.interfaces.Canine;

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
    public void bar(int barkMultiple){
        for(int i = 1; i <= barkMultiple; i++){
            super.bark();
        }
    }

    public void groom(){
        System.out.println("lick");
    };

}
