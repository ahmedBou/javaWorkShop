package com.company.SolvingProbWithSoftware.week2.storageResource;
import edu.duke.*;
public class AllGeneStored {
    public int findStopCodon(String dnaStr, int startIndex, String stopCodon) {
        // find stopCodon starting from(startIndex +3), currIndex
        int currentIndex = dnaStr.indexOf(stopCodon, startIndex + 3);
        // as long as currIndex is not equal to -1
        while (currentIndex != -1) {
            //check if currIndex - startIndex is a multiple o 3
            if ((currentIndex - startIndex) % 3 == 0) {
                return currentIndex;
            } else {
                //if not,
                currentIndex = dnaStr.indexOf(stopCodon, currentIndex + 1);
            }
        }
        return -1;
    }

    public String findGene(String dna, int where) {
        //find first occurrence of "ATG", startIndex
        int startIndex = dna.indexOf("ATG", where);
        // if startIndex is -1, return ""
        if (startIndex == -1) {
            return "";
        }
        // use taaIndex to store findStoCodon(dna, startIndex);
        int taaIndex = findStopCodon(dna, startIndex, "TAA");
        int tagIndex = findStopCodon(dna, startIndex, "TAG");
        int tgaIndex = findStopCodon(dna, startIndex, "TGA");
        // store in minIndex the smallest of these three value
//        int temp = Math.min(taaIndex, tagIndex);
//        int minIndex = Math.min(temp, tgaIndex);
//        int minIndex = Math.min(tgaIndex, Math.min(taaIndex,tagIndex));
        // if minIndex is dna.length()? nothing found, return ""
//        if(minIndex == dna.length()){
//            return "";
//        }
//        //otherwise answer is text from startIndex to minIndex+3
//        return dna.substring(startIndex, minIndex+3);
        int minIndex;
        if (taaIndex == -1 ||
                (tgaIndex != -1 && tgaIndex < taaIndex)) {
            minIndex = tgaIndex;
        } else {
            minIndex = taaIndex;
        }
        if (minIndex == -1 ||
                (tgaIndex != -1 && tagIndex < minIndex)) {
            minIndex = tagIndex;
        }
        if (minIndex == -1) {
            return "";
        }
        return dna.substring(startIndex, minIndex + 3);
    }

    public StorageResource getAllGenes(String dna) {
        // create an empty storage resource call it gene list
        StorageResource geneList= new StorageResource();
        //Set start index to 0
        int startIndex = 0;
        // Repeat the following step
        while(true){
            // Find the next gene after start index
            String currentGene = findGene(dna, startIndex);
            // if no gene was found , leave this loop
            if(currentGene.isEmpty()){
                break;
            }
            // Add that gene to geneList
            geneList.add(currentGene);
            //Set start index to just past the end of the gene
            startIndex = dna.indexOf(currentGene, startIndex)+ currentGene.length();

        }
        return geneList;
    }

    public void testOn(String dna){
        System.out.println("Testing getAllGenes on "+dna);
        StorageResource genes = getAllGenes(dna);
        for(String gene: genes.data()){
            System.out.println(gene);
        }
    }

    public static void main(String[] args) {
        AllGeneStored gene = new AllGeneStored();
        gene.testOn("ATGATCTAATTTATGCTGCAACGGTGAAGA");
        gene.testOn("ATGAaaTCATAAGAAGATAATAGAGGGCCATGTAA");
    }

}
