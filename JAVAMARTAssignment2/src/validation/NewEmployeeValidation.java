package validation;

import java.util.*;

/**
 *
 * @author Marco Duarte
 */
public class NewEmployeeValidation extends EmployeeMenuValidation
{
//----------------------------------------------------------------------------//
//------Variables
    private Scanner userInput = new Scanner(System.in);
    private int hrEmpType;
    private boolean validMenuBool, validSelectionBool;
    
    private String firstName, lastName;
    private int age, year,  month,  day;
    private double baseSalary;
//----------------------------------------------------------------------------//
//------CONTRUCTOR
    public NewEmployeeValidation(int hrMenuInput, int hrEmpType)
    {
        super(hrMenuInput);
        
        this.hrEmpType = hrEmpType;
        
    }
//----------------------------------------------------------------------------//
//------GET
    public int getNewEmployeeType()
    {
        
        int newInput;
        //run a loop do-while the input is a valid integer
        //have a try catch block for format exception error handling
        do
        {
            try
            {
                newInput = Integer.parseInt(userInput.nextLine());
                //if the input is a valid menu option
                if(newInput >= 0 || newInput < 4)
                {
                    hrEmpType = newInput;
                    return hrEmpType;
                }
                //invalid, out of range input
                else
                {
                    menu.MenuPrompts.getInvalidMessage();
                    validMenuBool = true;
                }
            }
            catch(NumberFormatException numberFormat)
            {
                System.out.println(numberFormat.toString());
                System.out.println
                    ("Error: you must enter a valid integer.\n");
                validMenuBool = true;
                //display the main menu prompt
                menu.MenuPrompts.getHRMessage();
            }
            catch(Exception generalError)
            {
                System.out.println(generalError.toString());
                System.out.println("Error: Unexpected error.\n");
                validMenuBool = true;
                //display the main menu prompt
                menu.MenuPrompts.getHRMessage();
            }

        }while(validMenuBool);
        
        return hrEmpType;
    }
    
    //mak this aa a boolean return 
    public void getBasicEmployeeInfo(String firstName,String lastName,
            int age, int year,  int month, int day, double baseSalary)
    {
        
        String newLastName;
        int newAge, newYear,  newMonth,  newDay;
        double newBaseSalary;
        
        //int newInput;
        //boolean validSelectionBool;
    do
    {
        getFirstName(validSelectionBool);
        
    }while(validSelectionBool);        
    
    //validSelectionBool;
    
    do
    {    
        //prompt for the last name
        System.out.println("Please enter a new Last Name: ");
        newLastName = userInput.nextLine();

        System.out.println("Is this Last Name correct?" 
                + "\n" + newLastName + "\n");
        System.out.println("Please enter 1 for yes or 0 for no");

        if(newInput == 1)
        {
            this.lastName = newLastName;
            
        }
        else if(newInput == 0)
        {
            validSelectionBool = true;
        }
        else
        {
            menu.MenuPrompts.getInvalidMessage();
            validSelectionBool = true;
        }
    }while(validSelectionBool); 
     
        newAge = userInput.nextInt();
        System.out.println("Is this the correct Age?" 
                    + "\n" + newAge + "\n");
        System.out.println("Please enter 1 for yes or 0 for no");
        this.age = newAge;
        
        //Start date
        newYear = userInput.nextInt();
        
        this.year = newYear;
        
        newMonth = userInput.nextInt();
        this.month = newMonth;
        
        newDay = userInput.nextInt();
        this.day = newDay;
        
        //base salary
        newBaseSalary = userInput.nextInt();
        this.baseSalary = newBaseSalary;
       
    }//end of get basic employee info
    public boolean getFirstName(boolean validSelectionBool)
    {
        String newFirstName;
        int newInput;
        
        do
        {
            //prompt for the first name
            System.out.println("Please enter a new First Name: ");
            newFirstName = userInput.nextLine();
            //verify
            System.out.println("Is this First Name correct?\n" 
                    +  "\n" + newFirstName + "\n");
            System.out.println("Please enter 1 for yes or 0 for no");
            //
            newInput = Integer.parseInt(userInput.nextLine());
            if(newInput == 1)
            {
                this.firstName = newFirstName;
            }
            else if (newInput == 0)
            {
                validSelectionBool = true;
            }
            else
            {
                menu.MenuPrompts.getInvalidMessage();
                validSelectionBool = true;
            }
        }while(validSelectionBool);
        return false;
    }//end of get first name
    
//----------------------------------------------------------------------------//
//------SET
    private void setHrNewInput(int hrEmpType)
    {
        this.hrEmpType = hrEmpType;
    }
}
