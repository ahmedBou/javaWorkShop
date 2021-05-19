package com.company.SolvingProbWithSoftware.week2.FindingOneGeneInDNA;

public class Part3 {
    public String twoOccurrences(String stringa, String stringb) {

        int count = 0, fromIndex = 0;

        while ((fromIndex = stringb.indexOf(stringa, fromIndex)) != -1) {

            System.out.println("Found at index: " + fromIndex);
            count++;
            fromIndex++;

        }
        return "Total occurrences: " + count;
    }

    public String lastPart(String stringa, String stringb){
        String res = "";
        int start = stringb.indexOf(stringa);
        System.out.println(stringa.length());
        res = stringb.substring(start+stringa.length());
        System.out.println(start);
        return res;
    }

    public void testing(){
//        String occA = "a";
//        String b = "banana";
//        String result = twoOccurrences(occA, b);
//        System.out.println("the count of occurrence of"+ occA+"is"+ result);
        String start = "an";
        String cont= "banana";
//        String start = "zoo";
//        String cont= "forest";

        if(cont.contains(start)){
            System.out.println(lastPart(start, cont));

        }else{
            System.out.println(cont);
        }
    }


}
