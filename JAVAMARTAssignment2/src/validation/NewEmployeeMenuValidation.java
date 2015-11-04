package validation;

import java.util.*;

/** This Class is an extension of the Menu Validation class. Its purpose
 * is to validate the employee type selected by the user. 
 *
 * @author Marco Duarte
 */
public class NewEmployeeMenuValidation extends MenuValidation
{
//----------------------------------------------------------------------------//
//Variables
    private Scanner userInput = new Scanner(System.in);
    
    private int hrEmpType;
    private boolean validMenuBool;

//----------------------------------------------------------------------------//
//CONTRUCTOR
    public NewEmployeeMenuValidation(int hrMenuInput, int hrEmpType)
    {
        super(hrMenuInput);
        
        this.hrEmpType = hrEmpType;
        
    }
//----------------------------------------------------------------------------//
//GET
    //EMPLOYEE TYPE sub menu selection
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
                if(newInput >= 0 && newInput < 4)
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
    }//end of get EMPLOYEE TYPE
//----------------------------------------------------------------------------//   

}//end of class
