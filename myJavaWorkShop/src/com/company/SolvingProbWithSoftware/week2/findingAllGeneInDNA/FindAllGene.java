package com.company.SolvingProbWithSoftware.week2.findingAllGeneInDNA;

public class FindAllGene {
    public String findGene(String dna){
        // Find first occurrence of "ATG" call its index "startIndex"
        int startIndex = dna.indexOf("ATG");
        System.out.println("startIndex "+startIndex);
        // Find the "TAA" starting from(startIndex+3), call it res currentIndex
        int currentIndex = dna.indexOf("TAA", startIndex+3);
        System.out.println("currentIndex "+currentIndex);
        System.out.println((currentIndex - startIndex) % 3);
        // As long as currIndex is not equal to -1
        while(currentIndex != -1){
            // Check if(currIndex- startIndex) is a multiple of 3
            if((currentIndex - startIndex) % 3 == 0){
                System.out.println("startIndex in while loop " + startIndex);
                System.out.println("currentIndex in while loop " + currentIndex);
                System.out.println((currentIndex - startIndex));
                // if so, the text between  startIndex and currentIndex +3
                return dna.substring(startIndex, currentIndex+3);

            }else{
                // if not update the currentIndex to the index of the next index
                // of the new TAA, starting from the currentIndex +1
                System.out.println("currentIndex not incremented after TAA "+(currentIndex+1));
                currentIndex = dna.indexOf("TAA", currentIndex+1);
                System.out.println("currentIndex after TAA "+currentIndex);
            }
        }
        return "";


    }



    public void testSimpleGene(){
        String dna = "AATGCGTAATTAATCG";
        System.out.println("DNA strand is "+ dna);
        String gene = findGene(dna);
        System.out.println("Gene is "+gene);
        System.out.println("**********************");
        String dna2 = "CGATGGTTGATAAGCCTAAGCTATAA";
        System.out.println("DNA strand is "+ dna2);
        String gene2 = findGene(dna2);
        System.out.println("Gene is "+gene2);
        System.out.println("**********************");
        String dna3 = "CGATGGTTGATAAGCCTAAGCTAAA";
        System.out.println("DNA strand is "+ dna3);
        String gene3 = findGene(dna3);
        System.out.println("Gene is "+gene3);


    }
}
