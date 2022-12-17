package SimpleCalc;

import javax.swing.*;
import java.awt.event.*;

public class SimpleCalcGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public SimpleCalcGUI() {
        cbOperations.addItem("+");
        cbOperations.addItem("-");
        cbOperations.addItem("*");
        cbOperations.addItem("/");
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                compute();
            }
        });
        tfNumber1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!tfNumber2.getText().equals("")) {
                    compute();
                }
            }
        });
        tfNumber2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!tfNumber1.getText().equals("")) {
                    compute();
                }
            }
        });
        cbOperations.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!tfNumber1.getText().equals("")&&!tfNumber2.getText().equals(""))
                    compute();
            }
        });
    }

    public static void main(String[] args) {
        SimpleCalcGUI simpleCalcGUI = new SimpleCalcGUI();
        simpleCalcGUI.setContentPane(simpleCalcGUI.panel1);
        simpleCalcGUI.setSize(500,500);
        simpleCalcGUI.setDefaultCloseOperation(EXIT_ON_CLOSE);
        simpleCalcGUI.setTitle("Simple Calculator");
        simpleCalcGUI.setVisible(true);
    }

    public void compute() {
        try {
            double n1 = Double.parseDouble(tfNumber1.getText());
            double n2 = Double.parseDouble(tfNumber2.getText());
            double result = 0;
            int selected = cbOperations.getSelectedIndex();
            switch (selected) {
                case 0:
                    result = n1 + n2;
                    break;
                case 1:
                    result = n1 - n2;
                    break;
                case 2:
                    result = n1 * n2;
                    break;
                case 3:
                    result = n1 / n2;
                    if(n2==0) {
                        throw new ArithmeticException();
                    }
                    break;
            }
            if (result % 1 == 0)
                lblResult.setText(String.valueOf(String.format("%.0f", result)));
            else
                lblResult.setText(String.valueOf(String.format("%.2f", result)));
        } catch (IllegalArgumentException i) {
            JOptionPane.showMessageDialog(panel1, "Invalid input.\nPlease enter a number.");
        } catch (ArithmeticException a) {
            JOptionPane.showMessageDialog(panel1, "Invalid operation.");
        }
    }
}
