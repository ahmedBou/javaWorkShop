package com.company.SolvingProbWithSoftware.week2.StringsSecondAssignments;

public class Part2 {

    public int howMany(String a, String dna) {

//        int count = 0,
//        startIndex = 0;
//
//        while ((startIndex = b.indexOf(a, startIndex)) != -1) {
//
//            System.out.println("Found at index: " + startIndex);
//            count++;
//            startIndex++;
//        }
//
//        return count;
        int pos = dna.indexOf(a);
        System.out.println("the position is:"+pos);
        int count = 0;
        while (pos >= 0) {
            count = count + 1;
            System.out.println("the count is "+count);
            pos = dna.indexOf(a, pos+1);

        }
        return count;
    }

    public void test(){
//        int count = howMany("GAA", "ATGAACGAATTGAATC");
//        System.out.println("the count1:"+count);
//        int count2 = howMany("AA", "ATAAAA");
//        System.out.println("the count2:"+count2);
        int count2 = howMany("TG", "CTGCCTGCATGATCGTA");
        System.out.println("the count2:"+count2);
    }
}
