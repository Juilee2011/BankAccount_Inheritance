package Bank.BankAccount_Inheritance;

public class SavingsAccount extends BankAccount
{
    //declare variables
    private double interest;
    private double minimumBalance;
    private int withdrawCount;

    //returns the values of the variables
    public double getInterestRate()
    {
        interest = 10.0;
        return interest;
    }
    public double getMinimumBalance()
    {
        return minimumBalance;
    }
    public int getWithdrawCount()
    {
        return withdrawCount;
    }


}
