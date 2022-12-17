package LeapYear;

import javax.swing.*;

public class LeapYearGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI() {
    }

    public static void main(String[] args) {
        LeapYearGUI leapYearGUI = new LeapYearGUI();
        leapYearGUI.setContentPane(leapYearGUI.panel1);
        leapYearGUI.setSize(500,500);
        leapYearGUI.setDefaultCloseOperation(EXIT_ON_CLOSE);
        leapYearGUI.setTitle("Leap Year Checker");
        leapYearGUI.setVisible(true);
    }
}
