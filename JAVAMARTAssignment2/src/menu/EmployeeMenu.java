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
        
    //-----WHILE, driving the Employee menu to loop
        while(hrBool)
        {      
            menu.MenuPrompts.getHRMessage();
            //run the input validation for the employee menu selection
            hrMenuInput = employeeMenuValidation.getHrMenuInput();
//----------------------------------------------------------------------------//
    //------selection statements
        //OPTION 1
            //SEARCH the employee list and details
            if(hrMenuInput == 1)
            {
                System.out.println("Employee Search");
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

                //WHILE loop employee type selection menu 
                do
                {
                    //display menu prompt
                    menu.MenuPrompts.getNewEmployeeMenu();
                    //validate the selection of the employee type    
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
                        newEmpValidation.getNewPartTime();
                    }
                    //Seasonal Employee
                    else if(hrEmpType == 3)
                    {
                        System.out.println("Seasonal Employee");
                        newEmpValidation.getNewSeasonal();
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

            }//end of NEW EMPLOYEE selection, option 2
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
//------SET employee menu input
    private void setHrMenuInput(int hrMenuInput)
    {
        this.hrMenuInput = hrMenuInput;
    }
    
    private void setNewEmpMenuInput(int hrEmpType)
    {
        this.hrEmpType = hrEmpType;
    }
}//------end of Employee Menu

