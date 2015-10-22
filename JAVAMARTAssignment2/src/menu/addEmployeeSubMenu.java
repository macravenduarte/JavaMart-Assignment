package menu;

import general.JAVAMART;
import hr.*;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**This sub employee menu is used to control the addition of new employees to 
 * the JAVAMART roster. 
 *
 * @author Marco Duarte
 */
//----------------------------------------------------------------------------//
public class addEmployeeSubMenu 
{
    private static int hrSubInput;
    private int year, month, day;   
    private static boolean hrSubBool = true;
 
//----------------------------------------------------------------------------//
    //------
    public static void addNewEmployee()
    {
        Scanner userInput = new Scanner(System.in);
        String firstName, lastName, position; 
        int age, year,  month,  day;
        //Date dateOfHire;
//----------------------------------------------------------------------------//    
        while(hrSubBool = true)
        {
    //------basic employee information prompts and intake
        //------display prompt for user to enter basic employee information   
            menu.MenuPrompts.getBasicEmployeeInfoMessage();
            //------first name
            menu.MenuPrompts.getEmployeeFirstNameMessage();
            firstName = userInput.next();       
            //------last name
            menu.MenuPrompts.getEmployeeLastNameMessage();
            lastName = userInput.next();
            //------position
            menu.MenuPrompts.getEmployeePositionNameMessage();
            position = userInput.next();
            //------age
            menu.MenuPrompts.getEmployeeAgeMessage();
            age = userInput.nextInt();
            //year
            menu.MenuPrompts.getEmployeeYearStartMessage();
            year = userInput.nextInt();
            if(year < 1950)
            {
                
            }
            else
            {
                
            }
            //month
            menu.MenuPrompts.getEmployeeMonthStartMessage();
            month = userInput.nextInt();
            //day
            menu.MenuPrompts.getEmployeeDayStartMessage();
            day = userInput.nextInt();     
        //------end of basic information
//----------------------------------------------------------------------------//
        
        //user employee type selection    
            menu.MenuPrompts.getEmployeeTypeMessage();
            hrSubInput = Integer.parseInt(userInput.nextLine());
//note: user selection succesful takes you back to the employee menu//
            //full time
            if(hrSubInput == 1)
            {
                addFullTimeEmployee
                (hrSubInput, firstName, lastName, age, position, year, month, day);
            }
            //part time
            else if(hrSubInput == 2)
            {
                addPatTimeEmployee
                (hrSubInput, firstName, lastName, age, position, year, month, day);
            }
            //seasonal
            else if(hrSubInput == 3)
            {
                addSeasonalEmployee
                (hrSubInput, firstName, lastName, age, position, year, month, day);
            }
            //exit to cancel
            else if(hrSubInput == 0)
            {
                menu.MenuPrompts.getCancelMessage();
                hrSubBool = false;
            //go back to Employee menu
                menu.EmployeeMenu.getEmployeeMenu();
            }
            //invalid input
            else
            {
                menu.MenuPrompts.getInvalidMessage();
            //go back to Employee menu
                menu.addEmployeeSubMenu.addNewEmployee();
            }
            
        }//------end of outer while
    
    }//------end of add new employee
    
//----------------------------------------------------------------------------//
//Adding each employee type
    //add fulltime 
    public static void addFullTimeEmployee(int hrSubInput, String firstName, 
            String lastName, int age, String position, int year, 
            int month, int day)
    {
    //------local base salary variable
        double baseSalary;
   
        Scanner userInput = new Scanner(System.in);
    //------display the add Full time employee messages
        menu.MenuPrompts.getFTEmployeeTypeMessage();  
        baseSalary = Double.parseDouble(userInput.next());
        
        JAVAMART.Employees.add(new FullTimeEmployee(firstName, lastName, age, 
                    position, baseSalary));
        
    //confirm to user new employee has been added
        menu.MenuPrompts.getCompleteMessage();
        
    //go back to Employee menu
        menu.EmployeeMenu.getEmployeeMenu();
    }//------end of addFullTimeEmployee
    
    //add part time
    public static void addPatTimeEmployee(int hrSubInput, String firstName, 
            String lastName, int age, String position, int year, 
            int month, int day)
    {
        Scanner userInput = new Scanner(System.in);
    
        hrSubInput = Integer.parseInt(userInput.nextLine());
                      
    //confirm to user new employee has been added
        menu.MenuPrompts.getCompleteMessage();
        
    //go back to Employee menu    
        menu.EmployeeMenu.getEmployeeMenu();
    }//------end of addPatTimeEmployee
    
    //add seasonal
    public static void addSeasonalEmployee(int hrSubInput, String firstName, 
            String lastName, int age, String position, int year, 
            int month, int day)
    {
        Scanner userInput = new Scanner(System.in);
        
        hrSubInput = Integer.parseInt(userInput.nextLine());
        
    //confirm to user new employee has been added
        menu.MenuPrompts.getCompleteMessage();
        
    //go back to Employee menu       
        menu.EmployeeMenu.getEmployeeMenu();
    }//------end of addSeasonalEmployee
//------end of adding add employe type 
//----------------------------------------------------------------------------//   

}//------end of add employee sub menu
