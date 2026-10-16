package Bank;

public class SavingsAccount extends BankAccount
{
    //declare variables
    private double interestRate;
    private double minimumBalance;
    private int withdrawCount;

    //returns the values of the variables
    public double getInterestRate()
    {
        return interestRate;
    }
    public double getMinimumBalance()
    {
        return minimumBalance;
    }
    public int getWithdrawCount()
    {
        return withdrawCount;
    }
    
    //this method calculates the interest
    public void calculateInterest()
    {
        //add code to calculate interest!!
    }


}
