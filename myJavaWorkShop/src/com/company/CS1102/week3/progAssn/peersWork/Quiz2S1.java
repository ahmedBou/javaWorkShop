package com.company.CS1102.week3.progAssn.peersWork;

import javax.swing.*;

public class Quiz2S1 {
    static int nQuestions = 0;
    static int nCorrect = 0;
    static String ask1(String question) {
        while (true) {
            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();
            boolean valid = (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D"));
            if (valid) return answer;
            JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C,or D.");
        }
    }
    static void check1(String question, String correctAnswer) {
        nQuestions++;
        String answer = ask1(question);
        if (answer.equals(correctAnswer)) {
            JOptionPane.showMessageDialog(null,"Correct!");
            nCorrect++;
        } else {
            JOptionPane.showMessageDialog(null,"Incorrect. The correct answer is "+correctAnswer+".");
        }
    }


    public static void main(String[] args) {
        String question;
        question = "What does AU represent on the Periodic Table?\n";
        question+="A. Aluminium\n";
        question+="B. Oxygen\n";
        question+="C. Gold\n";
        question+="D. Sulphur\n";
        String answer = ask1(question);
        answer = answer.toUpperCase();
        check1(question, "C");

        question = "What does Li represent on the Periodic Table?\n";
        question += "A. Magnesium\n";
        question += "B. Plutanium\n";
        question += "C. Sodium\n";
        question += "D. Lithium\n";
        check1(question, "D");

        question = "What does Bh represent on the Periodic Table?\n";
        question += "A. Mercury\n";
        question += "B. Tin\n";
        question += "C. Bohrium\n";
        question += "D. Neon\n";
        check1(question, "C");
        JOptionPane.showMessageDialog(null,nCorrect+" correct out of "+nQuestions+" questions");
    }
}
