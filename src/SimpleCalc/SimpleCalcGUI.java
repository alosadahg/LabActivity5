package SimpleCalc;

import javax.swing.*;

public class SimpleCalcGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public SimpleCalcGUI() {
    }

    public static void main(String[] args) {
        SimpleCalcGUI simpleCalcGUI = new SimpleCalcGUI();
        simpleCalcGUI.setContentPane(simpleCalcGUI.panel1);
        simpleCalcGUI.setSize(500,500);
        simpleCalcGUI.setDefaultCloseOperation(EXIT_ON_CLOSE);
        simpleCalcGUI.setTitle("Simple Calculator");
        simpleCalcGUI.setVisible(true);
    }
}
