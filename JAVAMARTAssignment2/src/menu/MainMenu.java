
package menu;
import java.util.*;
/** This class super main menu class will walk through the menu and call 
 * back user input in conjunction the validation class objects.
 *
 * @author Marco Duarte
 */
public class MainMenu
{
/**---------------------------------------------------------------------------*/
//------Variables
    private boolean mainBool = true;
   // private int userInput;
    
    public MainMenu(boolean mainBool)
    {
        this.mainBool = mainBool;
    }
/**---------------------------------------------------------------------------*/
//------GET Main Menu (main method)
    public boolean getMainMenu(boolean mainBool)
    {
        
//-----WHILE mainBool driving the menu to loop through unless selected otherwise
        while(mainBool)
        {
        //------display main menu options
            menu.MenuPrompts.getMainMenuMessage();
            
            Scanner read = new Scanner(System.in);
        //------assign the entered value to userInput
            userInput = Integer.parseInt(read.nextLine());
            
        //------if input is 1, run the getProductMenu class
            if(userInput == 1)
            {
                menu.ProductMenu.getProductMenu();
            }
        //------if input is 2, run the getEmployeeMenu class
            else if(userInput == 2)
            {
                menu.EmployeeMenu.getEmployeeMenu();
            }
        //------if the input is 0, exit 
            else if(userInput == 0)
            {
                menu.MenuPrompts.getExitMessage();
                mainBool = false; 
            }
        //------else, if the input is invalid display the main menu options
            else
            {
                mainBool = true;
                menu.MenuPrompts.getInvalidMessage();
            }
        }//------end of WHILE loop
        return mainBool;
/**---------------------------------------------------------------------------*/     
    }//------end of GET Main Menu
    
/**---------------------------------------------------------------------------*/
}//------end of Main Menu class
