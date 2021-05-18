package com.company.CS1102.week5.progAssn;

import javax.swing.*;

public abstract class Question {

    static int nQuestions = 0;
    static int nCorrect = 0;

    String question;
    String correctAnswer;
    // It must be defined (implemented) in any concrete (non-abstract) subclasses of "Question"
    abstract String ask();

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
