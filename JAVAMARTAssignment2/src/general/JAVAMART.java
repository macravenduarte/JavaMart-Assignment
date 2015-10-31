package general;
import java.util.*;
import menu.*;


/** This class will run the JAVAMART application through a menu driven object
 * using input validation with a validation object. This application is 
 * intended to generate and manage EMPLOYEE objects and PRODUCT objects. 
 * The application will also be able to search for specific Employee 
 * and Product objects.
 * 
 * @author Marco Duarte
 */
public class JAVAMART 
{
    public static ArrayList<hr.Employee> Employees = new ArrayList(); 
    public static ArrayList<inventory.Product> Products = new ArrayList(); 
    public static ArrayList<menu.MainMenu> MainMenu = new ArrayList();
    
    //------main method
    public static void main(String[] args)
    {
        //add a MAIN MENU OBJECT in the MainMenu ARRAYLIST
        MainMenu.add(new MainMenu(true));
        
        //start the application
        //startApp();    
        
    }//------end of main

    public static void startApp()
    {
        int input;
        
       
        
        //------Create a Main Menu Object
        //MainMenu menu =  new MainMenu();
        
        //MainMenu.getMainMenu(mainBool);
    }
}//------end of JAVAMART
