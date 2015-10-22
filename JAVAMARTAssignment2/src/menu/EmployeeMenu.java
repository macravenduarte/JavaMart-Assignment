package menu;

import general.JAVAMART;
import java.util.*;
import hr.*;

/** This class will run the "Employees" section of the menu
 *
 * @author Marco Duarte
 */
//----------------------------------------------------------------------------//
public class EmployeeMenu 
{

//------VARIABLES
    
    private static boolean hrBool = true;
    private static int hrInput;    
//----------------------------------------------------------------------------//
//------GET Employee Menu
    public static void getEmployeeMenu()
    {

    //-----WHILE, driving the Employee menu to loop
        while(hrBool)
        {
            //------display the employee message
            menu.MenuPrompts.getHRMessage();
            //------read & assign the hr input
            Scanner read = new Scanner(System.in);
            hrInput = Integer.parseInt(read.nextLine());
//----------------------------------------------------------------------------//
    //------selection statements
        //------display the employee list and details
            if(hrInput==1)
            {
            System.out.println("Run Employee Search HERE");

                //test employee
                //System.out.println(emp1);
                System.out.println("Employee search test");
                //prompt user for what employee they want to search 
                
            //emp testing 
                System.out.println(JAVAMART.Employees.toString());
                
                /** Run for loop to iterate through the employees in the
                 * Employees ArrayList
                 */ 

            }
        //------enter a new employee
            else if(hrInput==2)
            {
                System.out.println("Enter a new employee HERE");
                //employee test data
                //PartTimeEmployee emp1 = new  PartTimeEmployee
                //    ("Tony","Persson",50,"Sales Manager",2015,05,20,30000.00);

                //add test employee
                //JAVAMART.Employees.add(emp1);
                //addNewEmp();
                menu.addEmployeeSubMenu.addNewEmployee();
            
            }
//----------------------------------------------------------------------------//
        //------return to the main menu
            else if(hrInput==0)
            {
                hrBool = false;
                menu.MenuPrompts.getMainMenuMessage();
            }
            
        }//-----end of WHILE loop
    }//------end of GET Employee Menu   
//----------------------------------------------------------------------------//
//------METHODS
    //------run a for loop to search through the employee ArrayList 
    //by first and last names
    
    //------run a check for what kind of Employee the user wants to add
                 
    //------Add a new employee to the employee list
    public static void addNewEmp()
    { 
        menu.addEmployeeSubMenu.addNewEmployee();
        
    }
    
        
}//------end of Employee Menu