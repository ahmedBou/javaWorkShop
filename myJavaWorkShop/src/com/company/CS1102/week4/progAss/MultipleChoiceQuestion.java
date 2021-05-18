package com.company.CS1102.week4.progAss;

import javax.swing.*;

public class MultipleChoiceQuestion {
    static int nQuestions = 0;
    static int nCorrect = 0;

    String question;
    String correctAnswer;

    public MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
        question = query+"\n";
        question += a;
        question += b;
        question += c;
        question += d;
        question += e;
        correctAnswer = answer;
    }

     String ask() {
        while (true) {
            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();
            boolean valid = (answer.equals("A") || answer.equals("B") || answer.equals("C") ||
                    answer.equals("D") || answer.equals("E"));
            if (valid) return answer;
            JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D, or E.");
        }
    }
     void check() {
        nQuestions++;
        String answer = ask();
        if (answer.equals(correctAnswer)) {
            JOptionPane.showMessageDialog(null,"Correct!");
            nCorrect++;

        }else {
            JOptionPane.showMessageDialog(null,"Incorrect." +
                    " The correct answer is "+correctAnswer+".");
        }
    }

    static void showResults(){

        JOptionPane.showMessageDialog(null,nCorrect+" correct out of "+nQuestions+" questions");

    }
}
