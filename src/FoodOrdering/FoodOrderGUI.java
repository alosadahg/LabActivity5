package FoodOrdering;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

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

    private List<JRadioButton> discount;
    private List<JCheckBox> food;
    public FoodOrderGUI() {
        int[] prices = {100,80,65,55,50,40};
        double[] rate = {0,0.05,0.10,0.15};
        discount = new ArrayList<>();
        discount.add(rbNone);
        discount.add(rb5);
        discount.add(rb10);
        discount.add(rb15);
        food = new ArrayList<>();
        food.add(cPizza);
        food.add(cBurger);
        food.add(cFries);
        food.add(cSoftDrinks);
        food.add(cTea);
        food.add(cSundae);
        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = 0;
                double total = 0;
                for(JCheckBox f: food) {
                    if(f.isSelected()) {
                        total+=prices[i];
                    }
                    i++;
                }
                i = 0;
                for(JRadioButton d: discount) {
                    if(d.isSelected()) {
                        total = total - (total * rate[i]);
                    }
                    i++;
                }
                JOptionPane.showMessageDialog(panel1, String.format("The total price is Php %.2f", total));
            }
        });
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
