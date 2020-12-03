public class Account {

    private double balance;
    private int accountNumber;
    public static int numberOfAccount;
    
    public Account()
    {
        balance = 0;
        accountNumber = numberOfAccount ++;
    }
    
    public Account(double balance)
    {
        this.balance = balance;
        accountNumber = numberOfAccount ++; 
    }
    
    public void Debit(double debit)
    {
       balance = balance + debit;  
    }
    
    public String Credit(double credit)
    {
        if (credit < balance)
        {
            balance = balance - credit;
            return "You are withdrawing: " + credit + ", Your balance is: " + balance;
        }
        
        else if ((credit == balance) || (credit > balance))
        {
            return "You are withdrawing more than your balance, You have " + balance;
        }
        else {}
        return null;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    } 

    public double getBalanace()
    {
        return balance;
    }

    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public static void setNumberOfAccount(int numberOfAc)
    {
        numberOfAccount = numberOfAc;
    }

    public static int getNumberOfAccount()
    {
        return numberOfAccount;
    }
}