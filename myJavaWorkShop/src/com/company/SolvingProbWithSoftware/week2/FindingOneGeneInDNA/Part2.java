package com.company.SolvingProbWithSoftware.week2.FindingOneGeneInDNA;

public class Part2 {
    public String findSimpleGen(String dna, String startCodon, String stopCodon) {
        int start = dna.indexOf(startCodon);
        if (start == -1) {
            return "";
        }
        int stop = dna.indexOf(stopCodon, start + 3);
        System.out.println(dna.substring(start, stop + 3));
        System.out.println(stop - start);
        if ((stop - start) % 3 == 0) {
            System.out.println("valid");
            return dna.substring(start, stop + 3);
        } else {
            return "";
        }
    }
    public void testing() {
        //String a = "cccatggggtttaaataataataggagagagagagagagttt";
        //String ap = "atggggtttaaataataatag";
        //String a = "atgcctag";
        //String ap = "";
        String a =  "AAATGCCCTAACTAGATTAAGAAACC";
        //String ap = "ATGCCCTAG";
        String startCodon = "atg";
        String stopCodon= "taa";
        String result = findSimpleGen(a.toLowerCase(), startCodon, stopCodon);
        System.out.println(result);
//        if (a.equals(result)) {
//            System.out.println("success for " + a + " length " + a.length());
//        }
//        else {
//            System.out.println("mistake for input: " + a);
//            System.out.println("got: " + result);
//            System.out.println("not: " + a);
//        }
    }
}

