package com.company.CS1102.week5.progAssn;

import java.awt.*;
import javax.swing.*;

public class TrueFalseQuestion extends Question{

    public TrueFalseQuestion(String question, String answer) {
        super(question);
        JPanel buttons = new JPanel();
        addButton(buttons,"TRUE");
        addButton(buttons,"FALSE");
        this.question.add(buttons);


        initQuestionDialog();
        correctAnswer = answer;
        answer = answer.toUpperCase();

        if (answer.equals("T") || answer.equals("TRUE") || answer.equals("Y") || answer.equals("YES")) correctAnswer = "TRUE";
        if (answer.equals("F") || answer.equals("FALSE") || answer.equals("N") || answer.equals("NO")) correctAnswer = "FALSE";
    }
    void addButton(JPanel buttons, String label) {
        JButton button = new JButton(label);
        button.addActionListener(question);
        buttons.add(button);
    }
      /*
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

         */
    }


