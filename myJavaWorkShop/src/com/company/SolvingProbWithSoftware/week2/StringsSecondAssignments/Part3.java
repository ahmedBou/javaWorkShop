package com.company.SolvingProbWithSoftware.week2.StringsSecondAssignments;

public class Part3 {
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

    public void countGenes(String dna){

        int startIndex = 0;
        int count = 0;

        String fr = "ATGAAATAA";
        dna = fr.toUpperCase();

        while (true) {
            String gene = findGene(dna, startIndex);

            if (gene == "") {
                break;
            }

            startIndex = dna.indexOf(gene, startIndex) + gene.length();

            if(gene.length() > 60) {
                count++;
            }
        }

        System.out.println("How many genes are: " + count);

    }

}
