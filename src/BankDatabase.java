import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micah
 */
public class BankDatabase 
{
    ArrayList<BankAccount> bankAccounts = new ArrayList<>(); 

    void createCheckingAccount(String customerName, String ssn, float Deposit)
    {
        String[] nameArray = new String[2];
        int a = 0;
        for(String name : customerName.split(" "))
        {
            nameArray [a] = name;
            a++;
        }
        CheckingAccount checking = new CheckingAccount(nameArray[0], nameArray[1], ssn, Deposit);
        bankAccounts.add(checking);
    }
    
    void createSavingAccount(String customerName, String ssn, float Deposit)
    {
        String[] nameArray = new String[2];
        int b = 0;
        for(String name : customerName.split(" "))
        {
            nameArray [b] = name;
            b++;
        }
        SavingsAccount saving = new SavingsAccount(nameArray[0], nameArray[1], ssn, Deposit);
        bankAccounts.add(saving);
    }
    
    void applyInterest()
    {
        int i = 0;        
        while (i < bankAccounts.size())
        {            
            bankAccounts.get(i).applyInterest();
            i++;
        }
    }
    
    void print()
    {
        Collections.sort(bankAccounts);
        int i = 0;
        while (i < bankAccounts.size())                  
        {            
            System.out.println(bankAccounts.get(i));            
            i++;
        }        
    }
}
