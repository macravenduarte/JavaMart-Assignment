package menu;

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
        //------display the employee list and details
            if(hrMenuInput == 1)
            {
                System.out.println("Run Employee Search HERE");

                //test employee
                //System.out.println(emp1);
                //System.out.println("Employee search test");
                //prompt user for what employee they want to search 
                
            //emp testing 
                //System.out.println(JAVAMART.Employees.toString());
                
                /** Run for loop to iterate through the employees in the
                 * Employees ArrayList
                 */ 

            }//end of option 1
        //------NEW EMPLOYEE
            else if(hrMenuInput == 2)
            {
                //validate the hrNewEmpBool to run the sub loop
                //hrNewEmpBool = true;
                //display menu prompt
                menu.MenuPrompts.getNewEmployeeMenu();
                //WHILE loop employee type selection menu 
                while(!hrNewEmpBool)
                {
                //------validate the selection of the employee type    
                    hrEmpType = newEmpValidation.getNewEmployeeType();
                    //Full-time Employee
                    if(hrEmpType == 1)
                    {
                        
                        //String firstName, lastName;
                        //int age, year, month, day;
                        //double baseSalary;
                        
                        System.out.println("Full-time Employee");
                        //newEmpValidation.getBasicEmployeeInfo
                        //(firstName,lastName,age,year,month,day,baseSalary);
                        
                        
                    }
                    //Part-time Employee
                    else if(hrEmpType == 2)
                    {
                        System.out.println("Part-time Employee");
                    }
                    //Seasonal Employee
                    else if(hrEmpType == 3)
                    {
                        
                        System.out.println("Seasonal Employee");
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
                }//end of inner while loop (Employee Selection)
                                 
                //employee test data
                //PartTimeEmployee emp1 = new  PartTimeEmployee
                //    ("Tony","Persson",50,"Sales Manager",2015,05,20,30000.00);

                //add test employee
                //JAVAMART.Employees.add(emp1);
                //addNewEmp();
            
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
//------GET
    
//----------------------------------------------------------------------------//
//------SET
    
    //------run a for loop to search through the employee ArrayList 
    //by first and last names
    
    //------run a check for what kind of Employee the user wants to add
                 
    //------Add a new employee to the employee list
    /**public static void addNewEmp()
    {
        Scanner userInput = new Scanner(System.in);
        String firstName, lastName; 
        int age, year,  month,  day;
        double baseSalary;
        
        firstName = userInput.next();       
        lastName = userInput.next();
        age = userInput.nextInt();
        year = userInput.nextInt();
        month = userInput.nextInt();
        day = userInput.nextInt();
        baseSalary = userInput.nextInt();
        
        
        
    }
    */
        
}//------end of Employee Menu

