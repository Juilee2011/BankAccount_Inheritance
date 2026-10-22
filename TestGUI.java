package BankAccount_Inheritance;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class TestGUI
{
    public static void main (String [] args)
    {

    JFrame frame = new JFrame("Bank");
    frame.setSize(500, 500);
    frame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
    frame.setLocationRelativeTo(null);
    frame.setLayout(null);
    //frame.setVisible(true);


    JLabel area = new JLabel("Welcome to the Bank!");
    area.setBounds (100, 50, 150, 20);
    frame.add(area);

    JLabel number = new JLabel("Your account number is:");
    number.setBounds(100, 80, 200, 50);
    frame.add(number);

    JTextArea add1 = new JTextArea("12345678");
    add1.setBounds(390, 100, 150, 20);
    frame.add(add1);

    JLabel selection = new JLabel("Please select your amount to add:");
    selection.setBounds(200, 100, 200, 50);
    frame.add(area);

    String[] money = {"$10.00", "$25.00", "$50.00"};
    JComboBox <String> box = new JComboBox<>(money);
    box.setBounds(100, 150, 210, 80);
    frame.add(box);

    JButton addMoney = new JButton("Add money");
    addMoney.setBounds(100, 250, 150, 20);
    frame.setLocationRelativeTo(null);
    frame.add(addMoney);
    frame.setVisible(true);

    //made new label
    JLabel label2 = new JLabel("Your account balance is: ");
    label2.setBounds(100, 300, 200, 50);
    frame.add(label2);
    //frame.setVisible(true);
    
    JLabel newBalance = new JLabel("0");
    newBalance.setBounds (300, 300, 200, 50);
    frame.add(newBalance);


    //code for identifying what the code does after button is pressed
    addMoney.addActionListener ( e -> {
    int selectedIndex = box.getSelectedIndex();

    if (selectedIndex == 0)
    {
        int balance = Integer.valueOf(newBalance.getText()) + 10;
        newBalance.setText(Integer.toString(balance));
    }
    if (selectedIndex == 1)
    {
        int balance = Integer.valueOf(newBalance.getText()) + 25;
        newBalance.setText(Integer.toString(balance));
    }
    if (selectedIndex == 2)
    {
        int balance = Integer.valueOf(newBalance.getText()) + 50;
        newBalance.setText(Integer.toString(balance));
    }
    });
    }
}
