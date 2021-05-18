package com.georgiaEdx.part2.module6.interfaces.Canine;

public class Poodle extends Dog {
    private String favoriteShampoo;
    private String favoriteConditioner;



    public Poodle(String name, double size,
                  String favoriteShampoo, String favoriteConditioner) {
        super(name, size);
        this.favoriteShampoo = favoriteShampoo;
        this.favoriteConditioner = favoriteConditioner;
    }

    public void groom(){
        System.out.println(favoriteShampoo + "rinse"+
                            favoriteConditioner+" wait 10 min"+
                                    "dry and massage");
    }
}
