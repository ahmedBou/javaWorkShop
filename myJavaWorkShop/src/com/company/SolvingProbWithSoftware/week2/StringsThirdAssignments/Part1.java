package com.company.SolvingProbWithSoftware.week2.StringsThirdAssignments;

import edu.duke.FileResource;
import edu.duke.StorageResource;
import java.io.*;

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



    public double cgRatio(String dna){
        int count = 0;
        for(int i= 0; i < dna.length(); i++){
            if(dna.charAt(i)== 'C' || dna.charAt(i)== 'G'){
                count++;
            }
        }
        return (double) count / dna.length() ;
    }
    public StorageResource srIsFile(){
        FileResource fr = new FileResource("brca1line.fa");
        String Newdna = fr.asString();
        StorageResource sr = new StorageResource();
        sr.add(Newdna);
        for(String s : sr.data()){
            System.out.println("this is my list of genes: " + s);
        }
        return sr;
    }

    public void processGenes(StorageResource sr){
        System.out.println("list of gene is sr");
    }



    // test
    public void testOn(String dna) {
        System.out.println("Testing getAllGenes on "+dna);
        StorageResource genes = getAllGenes(dna);
        for(String gene: genes.data()){
            System.out.println(gene);
        }
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

    public static void main(String[] args) {
        Part1 ratio = new Part1();
        //System.out.println(ratio.cgRatio("ATGCCATAG"));
        ratio.srIsFile();
    }
}
