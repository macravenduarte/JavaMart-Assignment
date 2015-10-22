
package general;
import  java.util.*;
/**
 *
 * @author Marco Duarte
 */
//----------------------------------------------------------------------------//  
public class MainMenu
{

//------VARIABLES
    private static boolean mainBool = true;
    private static int userInput;
//----------------------------------------------------------------------------//  
//------GET Main Menu (main method)
    public static void getMainMenu()
    {
//-----WHILE mainBool driving the menu to loop through unless selected otherwise
        while(mainBool)
        {
        //------display main menu options
            menu.MenuPrompts.getMainMenuMessage();
            
            Scanner read = new Scanner(System.in);
        //------assign the entered value to userInput
            userInput = Integer.parseInt(read.nextLine());
            
        //------if input is 1
            if(userInput == 1)
            {
                //display the Product Menu 
                menu.ProductMenu.getProductMenu();
            }
        //------if input is 2
            else if(userInput == 2)
            {
                //display the Employee Menu 
                menu.EmployeeMenu.getEmployeeMenu();
            }
        //------if the input is 0, exit 
            else if(userInput == 0)
            {
                //display exit message
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
//----------------------------------------------------------------------------//
    }//------end of GET Main Menu
    
//----------------------------------------------------------------------------//
}//------end of Main Menu class
