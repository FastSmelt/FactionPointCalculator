package gg.compile.calc;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SubtractPercentageGUI {

    public static void main(String[] args) {
        createAndShowGUI();
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Subtract 15%");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        JLabel inputLabel = new JLabel("Enter a number: ");
        JTextField inputField = new JTextField(10);
        JButton calculateButton = new JButton("Calculate");
        JLabel resultLabel = new JLabel("Result: ");

        panel.add(inputLabel);
        panel.add(inputField);
        panel.add(calculateButton);
        panel.add(resultLabel);

        calculateButton.addActionListener((ActionEvent e) -> {
            try {
                double number = Double.parseDouble(inputField.getText());
                double result = number - number * 0.15;
                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input!");
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}