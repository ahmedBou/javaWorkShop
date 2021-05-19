package com.company.SolvingProbWithSoftware.week2.StringsSecondAssignments;

public class Part1 {
    public int findStopCodon(String dna, int startIndex, String stopCodon) {
        int currentIndex = dna.indexOf(stopCodon, startIndex + 3);

        while (currentIndex != -1) {
            int diff = currentIndex - startIndex;
            if (diff % 3 == 0) {
                System.out.println(currentIndex);
                return currentIndex;
            } else {
                currentIndex = dna.indexOf(stopCodon, currentIndex + 1);
            }
        }
        return dna.length();
    }

    public String findGene(String dna, int where) {
        int startIndex = dna.indexOf("ATG", where);
        if (startIndex == -1) {
            return "";
        }
        int taaIndex = findStopCodon(dna, startIndex, "TAA");
        int tagIndex = findStopCodon(dna, startIndex, "TAG");
        int tgaIndex = findStopCodon(dna, startIndex, "TGA");
        int minIndex = 0;
        if (taaIndex == -1 ||
                (tgaIndex != -1 && tgaIndex < taaIndex)) {
            minIndex = tgaIndex;
        } else {
            minIndex = taaIndex;
        }
        if (minIndex == -1 ||
                (tagIndex != -1 && tagIndex < minIndex)) {
            minIndex = tagIndex;
        }
        if (minIndex == -1) {
            return "";
        }
        return dna.substring(startIndex, minIndex + 3);


    }

    public void printAllGenes(String dna) {
        // Set startIndex to 0
        int startIndex = 0;
        // Repeat the following steps
        while (true) {
            // Find the next gene after index startIndex
            String currentGene = findGene(dna, startIndex);
            // If no gene was found, leave this loop
            if (currentGene.isEmpty()) {
                break;
            }
            // Print that gene out
            System.out.println(currentGene);

            //Set startIndex to just past the end of the gene
            startIndex = dna.indexOf(currentGene, startIndex) +
                    currentGene.length();
        }

    }

    // test
    public void testOn(String dna) {
        System.out.println("Testing printAllGenes on " + dna);
        printAllGenes(dna);
    }

    public void testFindStopCodon() {
        //      ATGv  TAAv  ATG   v  v  TGA
        testOn(" AATGCTAACTAGCTGACTAAT");
//        testOn(" ");
//        //      ATGv  v  v  v  TAAv  v  v  ATGTAA
//        testOn("ATGAaaTCATAAGAAGATAATAGAGGGCCATGTAA");

//        Question 1
//        Which one of the following is the first gene for this strand of DNA where you want to consider all three of the stop codons?
//
//    “AATGCTAACTAGCTGACTAAT”

    }
}