/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micah
 */
public class CheckingAccount extends BankAccount        
{
    CheckingAccount(String first, String last, String ssn, float initial)
    {
        super(first, last, ssn, initial);
    }
    
    @Override
    public void applyInterest()
    {
        float amount;
        float interest = (float) 0.02;
        balance = super.getBalance();
        if (balance > 10000)
        {
            amount = balance - 10000;
            balance = balance + (amount * interest);
            super.setBalance(balance);
        }
    }
}
