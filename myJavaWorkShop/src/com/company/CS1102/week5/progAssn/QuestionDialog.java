package com.company.CS1102.week5.progAssn;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuestionDialog extends JDialog implements ActionListener {
    String answer;
    @Override
    public void actionPerformed(ActionEvent e) {
        answer = e.getActionCommand();
        dispose();
    }

}
