package gg.compile.calc;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class SubtractPercentageGUI {

    public static void main(String[] args) {
        createAndShowGUI();
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Arithmetic Operations with Percentage");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel inputLabel = new JLabel("Enter a number: ");
        JTextField inputField = new JTextField(10);
        JLabel percentageLabel = new JLabel("Select percentage: ");
        String[] percentages = {"5%", "10%", "15%", "20%", "25%"};
        JComboBox<String> percentageBox = new JComboBox<>(percentages);
        JLabel operationLabel = new JLabel("Select operation: ");
        String[] operations = {"Subtract", "Add", "Multiply", "Divide"};
        JComboBox<String> operationBox = new JComboBox<>(operations);
        JButton calculateButton = new JButton("Calculate");
        JLabel resultLabel = new JLabel("Result: ");

        Font font = new Font("Arial", Font.PLAIN, 14);
        inputLabel.setFont(font);
        inputField.setFont(font);
        percentageLabel.setFont(font);
        percentageBox.setFont(font);
        operationLabel.setFont(font);
        operationBox.setFont(font);
        calculateButton.setFont(font);
        resultLabel.setFont(font);

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(inputLabel, gbc);
        gbc.gridx = 1;
        panel.add(inputField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(percentageLabel, gbc);
        gbc.gridx = 1;
        panel.add(percentageBox, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(operationLabel, gbc);
        gbc.gridx = 1;
        panel.add(operationBox, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        panel.add(calculateButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(resultLabel, gbc);

        calculateButton.addActionListener((ActionEvent e) -> {
            try {
                double number = Double.parseDouble(inputField.getText());
                String selectedPercentage = (String) percentageBox.getSelectedItem();
                double percentage = Double.parseDouble(selectedPercentage.replace("%", "")) / 100;
                String selectedOperation = (String) operationBox.getSelectedItem();
                double result = 0;

                switch (selectedOperation) {
                    case "Subtract":
                        result = number - number * percentage;
                        break;
                    case "Add":
                        result = number + number * percentage;
                        break;
                    case "Multiply":
                        result = number * (1 + percentage);
                        break;
                    case "Divide":
                        result = number / (1 + percentage);
                        break;
                }

                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input!");
            }
        });
        frame.add(panel);
        frame.setVisible(true);
    }
}