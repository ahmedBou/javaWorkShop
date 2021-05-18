package com.company.CS1102.week5.progAssn;

import javax.swing.*;


public class TrueFalseQuestion extends Question{

    public TrueFalseQuestion(String question, String answer) {
        this.question = "True or False: "+question;
        this.correctAnswer = answer.toUpperCase();

        if (answer.equals("T") || answer.equals("TRUE") || answer.equals("Y") || answer.equals("YES")) correctAnswer = "TRUE";
        if (answer.equals("F") || answer.equals("FALSE") || answer.equals("N") || answer.equals("NO")) correctAnswer = "FALSE";

    }


    @Override
    String ask() {
        while (true) {
            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();

            if (answer.equals("T") || answer.equals("Y") || answer.equals("YES")) answer = "TRUE";
            if (answer.equals("F") || answer.equals("N") || answer.equals("NO")) answer = "FALSE";
            boolean valid = (answer.equals("FALSE") || answer.equals("TRUE"));
            if (valid) return answer;
            JOptionPane.showMessageDialog(null, "Invalid answer. Please enter TRUE or FAlSE");
        }
    }


}
