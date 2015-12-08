package menu;

import general.JAVAMART;
import validation.EmpSearchMenuValidation;
import validation.MenuValidation;
import validation.NewEmployeeValidation;



/** This Employee Menu class extends the Main menu super class. Its purpose
 *  is to run the "Employees" section of the menu, run a validation object to 
 *  check user input for menu selection and new Employee information to add
 * to the Employees array list in JAVAMART
 *
 * @author Marco Duarte
 */
public class EmployeeMenu extends MainMenu
{
//----------------------------------------------------------------------------//
//------Variables
    
    private boolean hrBool, hrNewEmpBool;
    private int hrMenuInput, hrEmpType, hrEmpSearch;
//------have a private validation object to validate the user    
    private MenuValidation menuValidation = 
            new MenuValidation(hrMenuInput);
    
    //private NewEmployeeMenuValidation newEmpValidation = 
            //new NewEmployeeMenuValidation(hrMenuInput, hrEmpType);
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
        while(hrBool)
        {      
            menu.MenuPrompts.getHRMessage();
            //run the input validation for the employee menu selection
            
            hrMenuInput = menuValidation.getMenuOpt();
//----------------------------------------------------------------------------//
    //selection statements
        //OPTION 1
            //SEARCH the employee list and details
            if(hrMenuInput == 1)
            {
                
                //emp testing 
                //System.out.print(JAVAMART.Employees.toString());
                //Validate the selection for the type of search
                menu.MenuPrompts.getEmpSearchMenu();
                EmpSearchMenuValidation newEmpSearch = 
                        new EmpSearchMenuValidation(hrMenuInput, hrEmpSearch);
            //search by
                //first name
                if(hrEmpSearch == 1)
                {
                    
                }
                //last name
                else if(hrEmpSearch == 2)
                {
                    
                }
                //age
                else if(hrEmpSearch == 3)
                {
                    
                }
                //employee type
                else if(hrEmpSearch == 4)
                {
                    
                }
                //salary
                else if(hrEmpSearch == 5)
                {
                    
                }
                //back to main menu
                else if(hrEmpSearch == 0)
                {
                    menu.MenuPrompts.getMenuExitMessage();
                }
                //invalid selection
                else
                {
                    menu.MenuPrompts.getInvalidMessage();
                }

            }//end of option 1
        //OPYION 2
            //NEW EMPLOYEE         
            else if(hrMenuInput == 2)
            {
                //display menu prompt
                menu.MenuPrompts.getNewEmployeeMenu();
                
                do
                {
                    //validate the selection of the employee type    
                    hrEmpType = menuValidation.getMenuOpt();
                    
                //Full-time Employee
                    if(hrEmpType == 1)
                    {
                        System.out.println("Full-time Employee");
                        
                        //validator object
                        NewEmployeeValidation newEmp = 
                                new NewEmployeeValidation(hrMenuInput,hrEmpType);
                        
                        newEmp.getNewFullTime();

                    }
                //Part-time Employee
                    else if(hrEmpType == 2)
                    {
                        System.out.println("Part-time Employee");
                        
                        //validator object
                        NewEmployeeValidation newEmp = 
                                new NewEmployeeValidation(hrMenuInput,hrEmpType);
                        
                        newEmp.getNewPartTime();
                    }
                //Seasonal Employee
                    else if(hrEmpType == 3)
                    {
                        System.out.println("Seasonal Employee");
                        
                        //validator object
                        NewEmployeeValidation newEmp = 
                                new NewEmployeeValidation(hrMenuInput,hrEmpType);
                        
                        newEmp.getNewSeasonal();
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
                        menu.MenuPrompts.getInvalidMessage();
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

