import java.util.ArrayList;
/**
 * Write a description of class Register here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Register
{
    // instance variables - replace the example below with your own
    private int x;
    private int Customer_ID;
    private String Customer_Name;
    private int Choice;
    private int Choice_New;
    
    private ArrayList<String> Customer_Name_Arr = new ArrayList(); 
    
    
    /**
     * Constructor for objects of class Register
     */
    public Register()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void Customer()
    {
        Customer_ID += 1;
        
        
        
        Customer_Name = User.inputString("Please Type a Customer Name: ");
        Customer_Name_Arr.add(Customer_Name);
    }
    
    public void Search_Customer()
    {
        Choice = User.inputInt("Please Type a Number: ");
        Choice_New = Choice -1;
        User.message("Customer Names: " + Customer_Name_Arr.get(Choice));
    }
}
