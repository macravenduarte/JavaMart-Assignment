package validation;
import java.util.*;

/** This class will create an input validation object to validate all user input
 * 
 *
 * @author Marco Duarte
 */
public class MenuValidation extends Validation
{
    private Scanner userInput = new Scanner(System.in);
    private int menuInput;
    private boolean validInt;
    
    //CONTRUCTOR
    public MenuValidation(int menuInput)
    {     
        this.menuInput = menuInput;
  
    }
//METHODS 
    //GET 
    public int getMenuOpt()
    {
        
        int newInput;
        
        //run a loop do-while the input is a valid integer
        //have a try catch block for format exception error handling
        do
        {
            menu.MenuPrompts.getMainMenuMessage();
            try
            {

                newInput = Integer.parseInt(userInput.nextLine());
                if(newInput >= 0 || newInput < 3)
                {
                    menuInput = newInput;
                    return menuInput;
                }
            }
            catch(NumberFormatException numberFormat)
            {
                System.err.println(numberFormat.toString());
                System.err.println("Error: you must enter a valid integer.\n");
                validInt = true;
                //display the main menu prompt
                menu.MenuPrompts.getMainMenuMessage();
            }
            catch(Exception generalError)
            {
                System.err.println(generalError.toString());
                System.err.println("Error: Unexpected error.\n");
                validInt = true;
                //display the main menu prompt
                menu.MenuPrompts.getMainMenuMessage();
            }

        }while(validInt);
        
        return menuInput;
    }//------end of getMenuOpt
    
    //SET
    private void setMainMenuInput(int menuInput)
    {
        this.menuInput = menuInput;
    }
}
