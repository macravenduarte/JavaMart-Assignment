package validation;

import java.util.Scanner;
import hr.*;
/** This class is an extension of the super Validation class. Its purpose is to
 * validate the first HR menu selection from the user.
 *
 * @author Marco Duarte
 */
public class EmployeeMenuValidation extends Validation
{
//----------------------------------------------------------------------------//
//------Variables  
    private int hrMenuInput;
    private boolean validMenuBool;
//----------------------------------------------------------------------------//
//------CONTRUCTOR    
    public EmployeeMenuValidation(int hrMenuInput)
    {
        this.hrMenuInput = hrMenuInput;
    }
//----------------------------------------------------------------------------//
//------GET hr menu input
    public int getHrMenuInput()
    {
        Scanner userInput = new Scanner(System.in);
        int newInput;
        //run a loop do-while the input is a valid integer
        //have a try catch block for format exception error handling
        do
        {
            try
            {
                newInput = Integer.parseInt(userInput.nextLine());
                if(newInput >= 0 && newInput < 3)
                {
                    hrMenuInput = newInput;
                    return hrMenuInput;
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
        
        return hrMenuInput;
    }
//----------------------------------------------------------------------------//
//------SET hr menu input
    private void setHrInput(int hrMenuInput)
    {
        this.hrMenuInput = hrMenuInput;
    }
    
//----------------------------------------------------------------------------//
}//------end of EmployeeMenuValidation sub class

