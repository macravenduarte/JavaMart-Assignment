
package validation;

import java.util.Scanner;

/** This Manufacturer class will validate 
 *
 * @author Marco Duarte
 */
public class ManufacturerValidation extends ProductMenuValidation
{
//----------------------------------------------------------------------------//
//------Variables
    private Scanner userInput = new Scanner(System.in);
    private int manuType;
    private boolean validMenuBool, validSelectionBool;
    private int manuMenuInput;
    //carriers for all valid employee information
    private String manu1 = "Staples", manu2 = "Zep";
//----------------------------------------------------------------------------//
//------CONTRUCTOR
    public ManufacturerValidation(int prodMenuInput, int manuMenuInput)
    {   
        super(prodMenuInput);
    }
//----------------------------------------------------------------------------//
//------GET
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
                if(newInput >= 0 || newInput < 4)
                {
                    manuMenuInput = newInput;
                    return manuMenuInput;
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
        
        return manuMenuInput;
    }//end of get EMPLOYEE TYPE
//----------------------------------------------------------------------------//
}//end of MANUFACTURER VALIDATION class
