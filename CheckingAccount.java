package Bank.BankAccount_Inheritance;

public class CheckingAccount extends BankAccount
{
    //declare variables
    private boolean isDirectDeposit;
    private boolean isOverdraftProtection;

    //returns values in variables because of the private keyword
    public boolean getDirectDeposit()
    {
        return isDirectDeposit;
    }
    public boolean getOverdraftProtection()
    {
        return isOverdraftProtection;
    }

    //changes the values of both booleans depending on the account
    public void changeDirectDeposit (boolean newDirectDeposit)
    {
        isDirectDeposit = newDirectDeposit;
    }
    public void changeOverdraftProtection (boolean newOverdraftProtection)
    { 
        isOverdraftProtection = newOverdraftProtection;

    }
}
