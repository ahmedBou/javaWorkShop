package com.company.SolvingProbWithSoftware.week2.FindingOneGeneInDNA;

import java.util.Locale;

public class Part1 {

    public String findSimpleGene(String dna){

        int startCodon = dna.indexOf("atg");
//        System.out.println(startCodon);
        if(startCodon == -1){
            System.out.println("not valid startCodon");
            return " ";
        }
        int stopCodon = dna.indexOf("taa", startCodon+3);
//        System.out.println(stopCodon);
        if(stopCodon == -1){
            System.out.println("not find stopCodon");
            return " ";
        }
//        System.out.println(startCodon+3);
//        System.out.println(dna.substring(startCodon+3, stopCodon));
//        int diff = stopCodon-startCodon;
//        System.out.println(diff);
        if((stopCodon-startCodon) % 3 == 0){

          return dna.substring(startCodon, stopCodon+3);
        }else{
            System.out.println("not a valid gene");
            return " ";
        }
    }

    public void testSimpleGene(){
        String a = "ggggtttaaataa";
        String b = "cccatggggttt";
        String d = "aggagagagagagagagttt";
        String e = "cccatggggtttaaataataataggagagagagagagagttt";
        String x = "AAATGCCCTAACTAGATTAAGAAACC";

        String result = findSimpleGene(x.toLowerCase(Locale.ROOT));
        System.out.println(result);


    }
}
