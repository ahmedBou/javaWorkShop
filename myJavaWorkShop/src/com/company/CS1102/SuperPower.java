package com.company.CS1102;

import javax.swing.*;
import java.util.Locale;

public class SuperPower {
    public static void main(String[] args) {
       // System.out.println("SUPER POWERS TO THE RESCUE");
        String power = JOptionPane.showInputDialog("What is your super power?");
        JOptionPane.showMessageDialog(null,power.toUpperCase(Locale.ROOT)+ " TO THE RESCUE!");

    }
}
