package LeapYear;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class LeapYearGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI() {
        btnCheckYear.addActionListener(e -> checkLeapYear());
        tfYear.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ENTER) {
                    checkLeapYear();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        LeapYearGUI leapYearGUI = new LeapYearGUI();
        leapYearGUI.setContentPane(leapYearGUI.panel1);
        leapYearGUI.setSize(500,500);
        leapYearGUI.setDefaultCloseOperation(EXIT_ON_CLOSE);
        leapYearGUI.setTitle("Leap Year Checker");
        leapYearGUI.setVisible(true);
    }
    public void checkLeapYear() {

            int year = Integer.parseInt(tfYear.getText());

            if (year % 4 == 0) {
                JOptionPane.showMessageDialog(panel1, (year % 400 == 0 || year % 100 != 0) ? "Leap Year" : "Not a Leap Year");
            } else {
                JOptionPane.showMessageDialog(panel1, "Not a Leap Year");
            }

    }
}
