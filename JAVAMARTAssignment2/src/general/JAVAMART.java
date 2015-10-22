package general;
import java.util.*;

/**
 * 
 * @author Marco Duarte
 */
//----------------------------------------------------------------------------//  
public class JAVAMART 
{
    /**
     * notes
     * the array lists shouldn't be static, anyone will be able to access and 
     * manipulate the list
     * 
     * the menu class needs to be an object mainly for display purposes
     * 
     * create a validation class that goes through validating local input
     * to change existing data
     */
    public static ArrayList<hr.Employee> Employees = new ArrayList(); 
    public static ArrayList<inventory.Product> Products = new ArrayList(); 
//----------------------------------------------------------------------------//   
    //------main method
    public static void main(String[] args)
    {
        //------run the the main menu class
        MainMenu.getMainMenu();
        
    }//------end of main

}//------end of JAVAMART
