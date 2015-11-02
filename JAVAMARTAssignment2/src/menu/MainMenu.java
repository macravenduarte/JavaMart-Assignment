
package menu;
//import java.util.*;
import validation.MenuValidation;
/** This class super main menu class will walk through the menu and call 
 * back user input in conjunction the validation class objects.
 *
 * @author Marco Duarte
 */
public class MainMenu extends Menu
{
/**---------------------------------------------------------------------------*/
//------Variables
    private boolean menuBool;
    private int menuInput;
//------have a private validation object to validate the user
    private MenuValidation menuValidation = new MenuValidation(menuInput);
//----------------------------------------------------------------------------//  
//------CONSTRUCTOR  
    public MainMenu(boolean menuBool)
    {
        this.menuBool = menuBool;
       
    }
//--------------------------------------------------------------------------
    //@param mainBool- 
    //@return 
//------GET Main Menu (main method)
    public boolean getMainMenu()
    {      
//-----WHILE mainBool driving the menu to loop through unless selected otherwise
        while(menuBool)
        {
        //------GET the main menu opt
            menuInput = menuValidation.getMenuOpt();
           
        //------if input is 1, run the getProductMenu class
            if(menuInput == 1)
            {
                ProductMenu prodMenu = new ProductMenu(true,true);
                prodMenu.getProductMenu();
            }
        //------if input is 2, run the getEmployeeMenu class
            else if(menuInput == 2)
            {
                EmployeeMenu empMenu = new EmployeeMenu(true,true);
                empMenu.getEmployeeMenu();
            }
        //------if the input is 0, exit 
            else if(menuInput == 0)
            {
                menu.MenuPrompts.getExitMessage();
                menuBool = false; 
            }
        //------else, if the input is invalid display the main menu options
            else
            {
                menuBool = true;
                menu.MenuPrompts.getInvalidMessage();
            }
        }//------end of WHILE loop
        return menuBool;
/**---------------------------------------------------------------------------*/     
    }//------end of GET Main Menu
    
    //GET
    public boolean getMenuBool()
    {
        return menuBool;
    }
    //SET
    private void setMenuBool(boolean menuBool)
    {
        this.menuBool = menuBool;
    }
/**---------------------------------------------------------------------------*/
}//------end of Main Menu class
