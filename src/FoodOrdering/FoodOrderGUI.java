package FoodOrdering;

import SimpleCalc.SimpleCalcGUI;

import javax.swing.*;

public class FoodOrderGUI extends JFrame{
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    public FoodOrderGUI() {
    }

    public static void main(String[] args) {
        FoodOrderGUI foodOrderGUI = new FoodOrderGUI();
        foodOrderGUI.setContentPane(foodOrderGUI.panel1);
        foodOrderGUI.setSize(500,500);
        foodOrderGUI.setDefaultCloseOperation(EXIT_ON_CLOSE);
        foodOrderGUI.setTitle("Food Ordering System");
        foodOrderGUI.setVisible(true);
    }
}
