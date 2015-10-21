package menu;

import java.util.*;
import inventory.*;
import general.*;


/** This class will run through the "PRODUCTS" section of the menu
 *
 * @author Marco Duarte
 */
public class ProductMenu 
{
/**---------------------------------------------------------------------------*/
//------Variables
    private static boolean prodBool = true;
    private static int prodInput;
/**---------------------------------------------------------------------------*/
//------GET Products Menu
    public static void getProductMenu()
    {
        Product myProduct = new Product("T123","Test Product", "Test Category",
                "Test manufacturer", "Test Description", "Test Part Num",
                10.00, 20.00, 0.22,50);
                
    //-----WHILE 
        while(prodBool)
        {
            //------display the product message
            menu.MenuPrompts.getProductMessage();
            
            //------read & assign the product input
            Scanner read = new Scanner(System.in);
            prodInput = Integer.parseInt(read.nextLine());
/**---------------------------------------------------------------------------*/
    //------selection statements
        //------display the product list and details
            if(prodInput==1)
            {
                System.out.println("Display Product list and details HERE:");

                //System.out.println(myProduct.toString()); //test print
            }
        //------enter a new product
            else if(prodInput==2)
            {
                System.out.println("Enter a new product here");

            }
/**---------------------------------------------------------------------------*/
        //------return to the main menu
            else if(prodInput==0)
            {
                prodBool = false;
                menu.MenuPrompts.getMainMenuMessage();
            }
        //------invalid input
            else
            {
                menu.MenuPrompts.getInvalidMessage();
            }
            
        }//-----end of WHILE loop
/**---------------------------------------------------------------------------*/       
    }//-----end of getProductMenu
/**---------------------------------------------------------------------------*/ 
}//-----end of ProductMenu class