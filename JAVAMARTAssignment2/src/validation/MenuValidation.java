package validation;
import java.util.*;

/** This class will create an input validation object to validate all user input
 * 
 *
 * @author Marco Duarte
 */
public class MenuValidation 
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
            try
            {
                //display the main menu prompt
                menu.MenuPrompts.getMainMenuMessage();
                newInput = Integer.parseInt(userInput.nextLine());
                if(newInput > 0 || newInput < 3)
                {
                    menuInput = newInput;
                    return menuInput;
                }
            }
            catch(NumberFormatException numberFormat)
            {
               System.out.println(numberFormat.toString());
               System.out.println("Error: you must enter a valid integer");
               validInt = true;
            }
            catch(Exception generalError)
            {
                System.out.println(generalError.toString());
                System.out.println("Error: please contact your system administrator");
                validInt = true;
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
