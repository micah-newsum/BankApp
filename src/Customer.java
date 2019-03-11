import java.util.Scanner;
/**
 *
 * @author micah
 */
public class Customer {
    private String firstName;
    private String lastName;
    private String ssn;
    
    Customer(String first, String last, String socSec)
    {
        firstName = first;
        lastName = last;
        ssn = socSec;
    }
  
    public String getCustomerName()
    {
        return firstName+" "+lastName;
    }
    
    public String getCustomerSsn()
    {
        return ssn;
    }
}   
    
