package menu;

import general.JAVAMART;
import validation.EmployeeMenuValidation;
import validation.NewEmployeeValidation;


/** This class will run the "Employees" section of the menu
 *
 * @author Marco Duarte
 */
public class EmployeeMenu extends MainMenu
{
//----------------------------------------------------------------------------//
//------Variables
    
    private boolean hrBool, hrNewEmpBool;
    private int hrMenuInput, hrEmpType;
//------have a private validation object to validate the user    
    private EmployeeMenuValidation employeeMenuValidation = 
            new EmployeeMenuValidation(hrMenuInput);
    
    private NewEmployeeValidation newEmpValidation = 
            new NewEmployeeValidation(hrMenuInput, hrEmpType);
//----------------------------------------------------------------------------//
//------CONTRUCTOR
    public EmployeeMenu(boolean menuBool, boolean hrBool)
    {
        super(menuBool);
        
        this.hrBool = hrBool;
    }
//----------------------------------------------------------------------------//
//------GET Employee Menu
    public boolean getEmployeeMenu()
    {
        menu.MenuPrompts.getHRMessage();
    //-----WHILE, driving the Employee menu to loop
        while(hrBool)
        {            
        //------run the input validation for the employee menu selection
            hrMenuInput = employeeMenuValidation.getHrMenuInput();
//----------------------------------------------------------------------------//
    //------selection statements
        //OPTION 1
            //SEARCH the employee list and details
            if(hrMenuInput == 1)
            {
                System.out.println("Run Employee Search HERE");
                //emp testing 
                System.out.print(JAVAMART.Employees.toString());
                
                /** Run for loop to iterate through the employees in the
                 * Employees ArrayList
                 */ 

            }//end of option 1
        //OPYION 2
            //NEW EMPLOYEE         
            else if(hrMenuInput == 2)
            {
                //validate the hrNewEmpBool to run the sub loop
                //hrNewEmpBool = true;
                //display menu prompt
                menu.MenuPrompts.getNewEmployeeMenu();
                //WHILE loop employee type selection menu 
                do
                {
                //------validate the selection of the employee type    
                    hrEmpType = newEmpValidation.getNewEmployeeType();
                    //Full-time Employee
                    if(hrEmpType == 1)
                    {
                        System.out.println("Full-time Employee");
                        newEmpValidation.getNewFullTime();

                    }
                    //Part-time Employee
                    else if(hrEmpType == 2)
                    {
                        System.out.println("Part-time Employee");
                        //newEmpValidation.getNewPartTime();
                    }
                    //Seasonal Employee
                    else if(hrEmpType == 3)
                    {
                        System.out.println("Seasonal Employee");
                        //newEmpValidation.getNewSeasonal();
                    }
                    //exit new employee menu
                    else if(hrEmpType == 0)
                    {
                        menu.MenuPrompts.getMenuExitMessage();
                        hrNewEmpBool = false;
                    }
                    //if the input is invalid display the employee selection
                    //menu options
                    else
                    {
                        menu.MenuPrompts.getNewEmployeeMenu();
                        hrNewEmpBool = true; 
                    }
                }while(hrNewEmpBool);
                //end of inner while loop (Employee Selection)

            }//end of NEW EMPLOYEE selection
//----------------------------------------------------------------------------//
        //------return to the main menu
            else if(hrMenuInput == 0)
            {
                hrBool = false;
                menu.MenuPrompts.getMainMenuMessage();
            }
            
        }//-----end of WHILE loop
        return hrBool;
        
    }//------end of GET Employee Menu   

    
//----------------------------------------------------------------------------//
//------SET
    
    //------run a for loop to search through the employee ArrayList 
    //by first and last names
    
        
}//------end of Employee Menu

