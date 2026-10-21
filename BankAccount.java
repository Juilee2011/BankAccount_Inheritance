import java.util.Scanner;
package Bank.BankAccount_Inheritance;

public class BankAccountTest
{  
        //declare variables
        private double balance;
        private String accountNumber;
        private String choice;
        private double add;
        private double withdraw;

        public void getUserInput()
        {
        //gets user input
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your account number: ");
        accountNumber = input.nextLine();
        System.out.println("Please enter your current balance: ");
        balance = input.nextDouble();
        System.out.println("Would you like to add or withdraw money? Please put A for add, W for withdraw.");
        choice = input.nextLine();
        }

        if (choice.equals("A"))
        {
            Scanner input2 = new Scanner (System.in);
            System.out.println("Please enter the amount of money you would like to add: ");
            add = input2.nextDouble();
        }
        if (choice.equals("W"))
        {
            Scanner input3 = new Scanner (System.in);
            System.out.println("Please enter the amount of money you would like to withdraw: ");
            withdraw = input3.nextDouble();
        }

        //methods to access the balance and accountNumber
        public double getBalance()
        {
            return balance;
        }
        public String getNumber()
        {
            return accountNumber;
        }
        
        //this method will change the value of the balance after adding money
        public void addMoney (double deposit)
        {
            balance = balance + deposit;
        }
        //this method will change the value of the balance after withdrawing money
        public void withdrawMoney (double withdraw)
        {
            balance = balance - withdraw;
        }
    
}
