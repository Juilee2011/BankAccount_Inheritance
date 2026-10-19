import java.util.Scanner;
package Bank.BankAccount_Inheritance;

public class BankAccount
{  
        //declare variables
        private double balance;
        private String accountNumber;

        public void getUserInput()
        {
        //gets user input
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your account number: ");
        accountNumber = input.nextLine();
        System.out.println("Please enter your current balance: ");
        balance = input.nextDouble();
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
