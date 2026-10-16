package Bank;

public class BankAccount 
{  
        //declare variables
        private double balance;
        private String accountNumber;

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
