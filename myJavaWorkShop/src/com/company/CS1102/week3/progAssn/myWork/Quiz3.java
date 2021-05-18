package com.company.CS1102.week3.progAssn.myWork;

import javax.swing.*;

public class Quiz3 {
    static int nQuestions = 0;
    static int nCorrect = 0;

    static String ask(String question) {
        while (true) {
            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();
            boolean valid = (answer.equals("A") || answer.equals("B") || answer.equals("C") ||
                    answer.equals("D") || answer.equals("E"));
            if (valid) return answer;
            JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D, or E.");
        }
    }

    static void check(String question, String correctAnswer) {
        nQuestions++;
        String answer = ask(question);
        if (answer.equals(correctAnswer)) {
            JOptionPane.showMessageDialog(null,"Correct!");
            nCorrect++;

        }else {
        JOptionPane.showMessageDialog(null,"Incorrect." +
                " The correct answer is "+correctAnswer+".");
        }
    }
    public static void main(String[] args) {
        String question = "What is a quiz?\n";
        question += "A. a test of knowledge, especially a brief informal test given to students\n";
        question += "B. 42\n";
        question += "C. a duck\n";
        question += "D. to get to the other side\n";
        question += "E. To be or not to be, that is the question.";
        check(question,"B");
        question = "Which of the following are primitives?\n int[] lowercase = new int[0];" +
                "\n  Integer[] uppercase = new Integer[0];";
        question+= "A. Only lowercase";
        question+= "B. Only uppercase";
        question+="C. Bother lowercase and uppercase";
        question+="D. Neither lowercase nor uppercase";

        check(question,"B");

        question = "How many legs does a spider have?\n";
        question += "A. Two.\n";
        question += "B. Ten.\n";
        question += "C. Eight.\n";
        question += "D. Six.\n";
        question += "E. Nine.";

        check(question,"C");
        JOptionPane.showMessageDialog(null,nCorrect+" correct out of "+nQuestions+" questions");
    }
}
