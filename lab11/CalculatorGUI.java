import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorGUI extends JFrame implements ActionListener {

    JTextField field;
    double num1, num2;
    char op;

    CalculatorGUI() {
        setTitle("Калькулятор");
        setSize(300, 400);
        setLayout(new FlowLayout());

        field = new JTextField(20);
        add(field);

        String[] buttons = {
                "1","2","3","+",
                "4","5","6","-",
                "7","8","9","*",
                "0","=","C","/"
        };

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.addActionListener(this);
            add(btn);
        }

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.matches("[0-9]")) {
            field.setText(field.getText() + cmd);
        } else if (cmd.matches("[+\\-*/]")) {
            num1 = Double.parseDouble(field.getText());
            op = cmd.charAt(0);
            field.setText("");
        } else if (cmd.equals("=")) {
            num2 = Double.parseDouble(field.getText());

            switch (op) {
                case '+': field.setText("" + (num1 + num2)); break;
                case '-': field.setText("" + (num1 - num2)); break;
                case '*': field.setText("" + (num1 * num2)); break;
                case '/': field.setText("" + (num1 / num2)); break;
            }
        } else if (cmd.equals("C")) {
            field.setText("");
        }
    }

    public static void main(String[] args) {
        new CalculatorGUI();
    }
}