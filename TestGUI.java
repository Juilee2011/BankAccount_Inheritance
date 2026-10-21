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
    JButton button = new JButton("");
    button.setBounds(100, 200, 120, 40);
    frame.add(button);


    JLabel label2 = new JLabel("Press the button");
    label2.setBounds(100, 130, 100, 50);
    frame.add(label2);
   
    //made new label
    JLabel label = new JLabel("Your account balance is: ");
    label.setBounds(100, 300, 200, 50);
    frame.add(label);


   
    JTextArea area = new JTextArea("Please enter your account number: ");
    area.setBounds (100, 50, 200, 50);
    frame.add(area);


    String[] money = {"$10.00", "$25.00", "$50.00"};
    JComboBox <String> box = new JComboBox<>(money);
    box.setBounds(100, 150, 210, 80);
    frame.add(box);
    frame.setVisible(true);


   


    }
