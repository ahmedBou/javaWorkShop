package com.company.SolvingProbWithSoftware.week2.debugging;

public class FindString {

    public static void main(String[] args) {
        FindString find = new FindString();
        find.testFind();
    }

    public void findAbc(String input) {
        int index = input.indexOf("abc");
        System.out.println(index);

        while (true) {
            if(index > input.length() - 4){
                break;
            }
            if (index == -1) {
                break;
            }
            System.out.println("index " + index);
            String found = input.substring(index+1, index+4);
            System.out.println(found);
            index = input.indexOf("abc", index+4);
            System.out.println("index after updating " + index);
        }
    }
    public void testFind() {
        //no code yet
        //findAbc("abcdefabcghi");
        //findAbc("abcd");
        //findAbc("abcdabc");
        //findAbc("woiehabchi");
        //findAbc("abcbbbabcdddabc");
        //findAbc("aaaaabc");
        //findAbc("yabcyabc");
        //findAbc("eusabce");
        //findAbc("abcdkfjsksioehgjfhsdjfhksdfhuwabcabcajfieowj");
        findAbc("abcdkfjsksioehgjfhsdjfhksdfhuwabcabcajfieowj");
        //findAbc("kdabcabcjei");
        //findAbc("ttabcesoeiabco");
        //findAbc("abcabcabcabca");

// bcb,bcc,bcd
        // bca,bca,bca,bca
    }
}
