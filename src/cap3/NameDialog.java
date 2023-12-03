package cap3;

import javax.swing.*;

public class NameDialog {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");

        String message = String.format("Welcome, %s, to Java Programing!", name);

        JOptionPane.showMessageDialog(null, message);
    }

}
