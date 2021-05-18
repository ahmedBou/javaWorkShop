package com.company.CS1102;

import javax.swing.*;

public class Quiz2 {

    static String answer;
    static String correctAnswer1 = "B";
    static String correctAnswer2 = "A";
    static int nQuestions = 0;
    static int nCorrect = 0;
    public static void main(String[] args) {

        String question1 = "What is a quiz?\n";
        question1 += "A. a test of knowledge, especially a brief informal test given to students\n";
        question1 += "B. 42\n";
        question1 += "C. a duck\n";
        question1 += "D. to get to the other side\n";
        question1 += "E. To be or not to be, that is the question.";

        String question2 = "Which of the following are primitives?\n int[] lowercase = new int[0];" +
                "\n  Integer[] uppercase = new Integer[0];";


        question2+= "A. Only lowercase";
        question2+= "B. Only uppercase";
        question2+="C. Bother lowercase and uppercase";
        question2+="D. Neither lowercase nor uppercase";
        //Quiz2.ask(question);

        Quiz2.check(question1, correctAnswer1);
        Quiz2.check(question2, correctAnswer2);

        JOptionPane.showMessageDialog(null, "correct out of questions"+nCorrect);

    }


    public static String ask(String question){
        answer = JOptionPane.showInputDialog(question).toUpperCase();
        return answer;
    }

    static void check(String question, String correctAnswer){
        nQuestions++;
        while(true){
        String answer = ask(question);

        if(answer.equals(correctAnswer)){
            JOptionPane.showMessageDialog(null, "Correct!");
            nCorrect++;
            return;
        }else{
            JOptionPane.showMessageDialog(null, "Incorrect");
            JOptionPane.showMessageDialog(null, "The Correct answer is: "+correctAnswer);
        }
        }
    }
}
