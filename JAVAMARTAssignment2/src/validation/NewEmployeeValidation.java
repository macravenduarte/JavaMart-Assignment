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
    private int hrNewInput;
    private boolean validMenuBool;
    
    private String firstName, lastName;
//----------------------------------------------------------------------------//
//------CONTRUCTOR
    public NewEmployeeValidation(int hrMenuInput, int hrNewInput)
    {
        super(hrMenuInput);
        
        this.hrNewInput = hrNewInput;
        
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
                if(newInput >= 0 || newInput < 4)
                {
                    hrNewInput = newInput;
                    return hrNewInput;
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
        
        return hrNewInput;
    }
    
    public String getBasicEmployeeInfo()
    {
        String firstName,lastName;
        //boolean validSelection;
        firstName = userInput.nextLine();
        
        //System.out.println("Is this First Name correct?\n" + firstName + "\n");
        //System.out.println("Please enter Y or N");
        if(firstName != "")
        {
            this.firstName = firstName;
        }
        
        lastName = userInput.nextLine();
       
            this.lastName = lastName;
        
        
        return firstName + lastName;
    }
//----------------------------------------------------------------------------//
//------SET
    private void setHrNewInput(int hrNewInput)
    {
        this.hrNewInput = hrNewInput;
    }
}
