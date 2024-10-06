import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator20{
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(new GridLayout(5, 2));

        // Create components
        JTextField number1Field = new JTextField();
        JTextField number2Field = new JTextField();
        JButton addButton = new JButton("Add");
        JButton subtractButton = new JButton("Subtract");
        JButton multiplyButton = new JButton("Multiply");
        JButton divideButton = new JButton("Divide");
        JLabel resultLabel = new JLabel("Result: ");

        // Add action listeners for buttons
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(number1Field.getText());
                double num2 = Double.parseDouble(number2Field.getText());
                double result = num1 + num2;
                resultLabel.setText("Result: " + result);
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(number1Field.getText());
                double num2 = Double.parseDouble(number2Field.getText());
                double result = num1 - num2;
                resultLabel.setText("Result: " + result);
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(number1Field.getText());
                double num2 = Double.parseDouble(number2Field.getText());
                double result = num1 * num2;
                resultLabel.setText("Result: " + result);
            }
        });

        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(number1Field.getText());
                double num2 = Double.parseDouble(number2Field.getText());
                if (num2 != 0) {
                    double result = num1 / num2;
                    resultLabel.setText("Result: " + result);
                } else {
                    resultLabel.setText("Error: Division by zero");
                }
            }
        });

        // Add components to the frame
        frame.add(new JLabel("Number 1:"));
        frame.add(number1Field);
        frame.add(new JLabel("Number 2:"));
        frame.add(number2Field);
        frame.add(addButton);
        frame.add(subtractButton);
        frame.add(multiplyButton);
        frame.add(divideButton);
        frame.add(resultLabel);

        // Set frame visibility
        frame.setVisible(true);
    }
}
