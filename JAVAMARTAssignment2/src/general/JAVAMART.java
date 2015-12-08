package general;
import java.util.*;
import menu.MainMenu;
import gui.*;

import javax.swing.JFrame;


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
    private static MainMenu menu = new MainMenu(true);
    
    //------main method
    public static void main(String[] args)
    {
        //start gui
        MainTabbedPageGui gui = new MainTabbedPageGui();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.pack();
        gui.setVisible(true);
        
        //GET the main menu form the menu object       
        menu.getMainMenu();
       
    }//------end of main

}//------end of JAVAMART
