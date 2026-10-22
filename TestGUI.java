package Bank.BankAccount_Inheritance;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class TestGUI
{
    JFrame frame = new JFrame("Test");
    frame.setSize (500 , 500);
    frame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
    frame.setLocationRelativeTo(null);

    JTextArea area = new JTextArea("Welcome to the Bank!");
    area.setBounds (100, 50, 200, 50);
    frame.add(area);

    JLabel selection = new JLabel("Please select your amount to add:")
    selection.setBounds(200, 80, 200, 50);
    frame,add(area);

    String[] money = {"$10.00", "$25.00", "$50.00"};
    JComboBox <String> box = new JComboBox<>(money);
    box.setBounds(100, 150, 210, 80);
    frame.add(box);

    JLabel label1 = new JLabel("Add money");
    label2.setBounds(100, 130, 100, 50);
    frame.add(label1);
   
    //made new label
    JLabel label = new JLabel("Your account balance is: ");
    label.setBounds(100, 300, 200, 50);
    frame.add(label);
    frame.setVisible(true);


   


    }
