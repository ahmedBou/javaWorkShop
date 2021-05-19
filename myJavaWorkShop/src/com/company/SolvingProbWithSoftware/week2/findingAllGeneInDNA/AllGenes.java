package com.company.SolvingProbWithSoftware.week2.findingAllGeneInDNA;


public class AllGenes {
    public int findStopCodon(String dnaStr, int startIndex, String stopCodon){
        // find stopCodon starting from(startIndex +3), currIndex
        int currentIndex = dnaStr.indexOf(stopCodon, startIndex+3);
        // as long as currIndex is not equal to -1
        while (currentIndex != -1){
            //check if currIndex - startIndex is a multiple o 3
            if((currentIndex - startIndex) % 3 == 0){
                return currentIndex;
            }else{
                //if not,
                currentIndex = dnaStr.indexOf(stopCodon, currentIndex+1);
            }
        }
        return -1;
    }


    public String findGene(String dna, int where){
        //find first occurrence of "ATG", startIndex
        int startIndex = dna.indexOf("ATG", where);
        // if startIndex is -1, return ""
        if(startIndex == -1){
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
        if(taaIndex == -1 ||
                (tgaIndex !=-1 && tgaIndex < taaIndex)){
            minIndex = tgaIndex;
        }else{
            minIndex = taaIndex;
        }
        if(minIndex == -1 ||
                (tgaIndex !=-1 && tagIndex < minIndex)){
            minIndex = tagIndex;
        }
        if(minIndex == -1){
            return "";
        }
        return dna.substring(startIndex, minIndex+3);
    }

    public void printAllGenes(String dna){
        // Set startIndex to 0
        int startIndex = 0;
        // Repeat the following steps
        while(true){
            // Find the next gene after index startIndex
            String currentGene = findGene(dna, startIndex);
            // If no gene was found, leave this loop
            if(currentGene.isEmpty()){
               break;
            }
            // Print that gene out
            System.out.println(currentGene);

            //Set startIndex to just past the end of the gene
            startIndex = dna.indexOf(currentGene, startIndex) +
                    currentGene.length();
        }

    }

    public void testOn(String dna){
        System.out.println("Testing printAllGenes on "+dna);
        printAllGenes(dna);
    }
    public void test(){
            //      ATGv  TAAv  ATG   v  v  TGA
        testOn("ATGATCTAATTTATGCTGCAACGGTGAAGA");
        testOn(" ");
            //      ATGv  v  v  v  TAAv  v  v  ATGTAA
        testOn("ATGAaaTCATAAGAAGATAATAGAGGGCCATGTAA");
    }

//    public void testFindStop() {
//        // 01234567890123456789012345
//        String dna = "xxxyyyzzzTAAxxxyyyzzzTAAxx";
//        int dex = findStopCodon(dna, 0, "TAA");
//        System.out.println("the min dna is"+ dex);
//
//        if (dex != 9) {
//            System.out.println("error on 9");
//        }
//        dex = findStopCodon(dna, 9, "TAA");
//        if (dex != 21) {
//            System.out.println("error on 21");
//        }
//        dex = findStopCodon(dna, 1, "TAA");
//        if (dex != 26) System.out.println("error on 26");
//        dex = findStopCodon(dna, 0, "TAG");
//        if (dex != 26) System.out.println("error on 26");
//        System.out.println("system finished");
//    }
}

//    public void test(){
//        String dna = "CTGCCTGCATGATCGTA";
//        int pos = dna.indexOf("TG");
//        int count = 0;
//        while (pos >= 0) {
//            count = count + 1;
//            pos = dna.indexOf("TG",pos);
//        }
//        System.out.println(count);

//}