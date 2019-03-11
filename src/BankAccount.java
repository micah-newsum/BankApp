import java.lang.Comparable;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micah
 */
abstract class BankAccount implements Comparable<BankAccount>
{
    protected String acctNo;
    protected float balance;
    protected Customer customer;
        
    BankAccount(String first, String last, String ssn, float initBal)
    {
        int i;
        this.acctNo = "";
        for (i = 0; i <= 9; i++)
        {            
            double a = Math.random()*9;
            int pos = (int) Math.round(a);
            String number  = String.valueOf(pos);
            this.acctNo = this.acctNo + number;
        }
        this.balance = initBal;
        Customer cust = new Customer(first, last, ssn);
        this.customer = cust;
        checkSsn(customer.getCustomerSsn());        
    }
    
    public void checkSsn(String ssn)
    {        
        if (ssn.length() != 11)
        {
            System.out.println("Successfully created account for "+customer.getCustomerName()+"."+" "+"Invalid SSN!");
            System.out.println("Successfully created account for "+customer.getCustomerName()+" "+"Account Number"+" "+this.acctNo);               
        }
        else
        {
        System.out.println("Successfully created account for "+customer.getCustomerName()+" "+"Account Number"+" "+this.acctNo);
        }
    }
    
    public void deposit(float amount)
    {
        if (amount > 0)
        {   
            this.balance = this.balance + amount;
            System.out.println(customer.getCustomerName()+" "+"deposited"+" $"+amount+" Current balance "+this.getBalance());
        }
    }   
    public void withdraw(float amount)
    {  
        if (balance < amount)
        {
            System.out.println("Unable to withdraw "+amount+" for "+customer.getCustomerName()+" due to insfufficient funds.");
            return;
        }
        if (amount > 0)
        {
            balance = balance - amount;
            System.out.println(customer.getCustomerName()+" "+"withdrew"+" $"+amount+" Current balance "+this.getBalance());
        }
    }
    
    abstract void applyInterest();
    
    public void checkBalance()
    {
        System.out.println(customer.getCustomerName()+","+" Balance $"+this.getBalance());
    }
    
    public float getBalance()
    {
        return this.balance;
    }
    
    public float setBalance(float amount)
    {
        this.balance = amount;
        return this.balance;
    }
    
    @Override
    public String toString()
    {
        return this.customer.getCustomerName()+", accn #: "+this.acctNo+","+" Balance $"+this.getBalance();
    }
    
    @Override
    public int compareTo(BankAccount acct)
    {
        if (this.balance < acct.getBalance()){return -1;}
        if (this.balance > acct.getBalance()){return 1;}            
        return 0;
    }
}

