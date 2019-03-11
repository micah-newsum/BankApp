/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micah
 */
public class SavingsAccount extends BankAccount
{
    SavingsAccount(String first, String last, String ssn, float initial)
    {
        super(first, last, ssn, initial);
    }
    
    @Override
    public void applyInterest()
    {
        float amount;
        balance = super.getBalance();
        if (balance > 10000)
        {
            balance = (float) (balance + balance * 0.05);
            super.setBalance(balance);
        }
    }
}
