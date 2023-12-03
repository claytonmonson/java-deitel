package cap2;

import javax.swing.*;
import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {

        int number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first integer"));

        int number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second integer"));
        System.out.print("Enter second integer: ");

        String message = String.format("Sum is %d%n", number1 + number2);

        JOptionPane.showMessageDialog(null, message);

    }
}
