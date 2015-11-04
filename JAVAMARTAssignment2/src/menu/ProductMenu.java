package menu;

import validation.MenuValidation;

/** This class will run through the "PRODUCTS" section of the menu
 *
 * @author Marco Duarte
 */
public class ProductMenu extends MainMenu
{
//-----------------------------------------------------------------------------/
//Variables
    private boolean prodMenuBool;
    private int prodMenuInput;
    
    private MenuValidation menuValidation =
            new MenuValidation(prodMenuInput);
//----------------------------------------------------------------------------//  
//CONSTRUCTOR 
    public ProductMenu(boolean menuBool, boolean prodMenuBool)
    {
        super(menuBool);
        this.prodMenuBool = prodMenuBool;
    }
//-----------------------------------------------------------------------------/
//GET 
    //product menu bool
    public boolean getProdMenuBool()
    {
        return prodMenuBool;
    }
    
    //getProducts Menu method will return a user input between 0 and 2 if valid
    public boolean getProductMenu()
    {
                   
        while(prodMenuBool)
        {
            //display the product message
            menu.MenuPrompts.getProductMessage();
            
            //validation object with the product menu input
            prodMenuInput = menuValidation.getMenuOpt();
//-----------------------------------------------------------------------------/
    //selection statements
        //display the product list and details
            if(prodMenuInput == 1)
            {
                System.out.println("Display Product list and details HERE:");

                //System.out.println(myProduct.toString()); //test print
            }
            
        //enter a new product
            else if(prodMenuInput == 2)
            {
                System.out.println("Enter a new product here");
                //
            //Product myProduct = new Product("T123","Test Product", "Test Category",
                   // "Test manufacturer", "Test Description", "Test Part Num",
                   // 10.00, 20.00, 0.22,50);
            }

        //return to the main menu
            else if(prodMenuInput == 0)
            {
                menu.MenuPrompts.getMainMenuMessage();
                prodMenuBool = false;
            }
            
        //invalid input
            else
            {
                menu.MenuPrompts.getInvalidMessage();
                prodMenuBool = true;
            }
            
        }//-----end of WHILE loop
        
        return prodMenuBool;
      
    }//end of getProductMenu
//-----------------------------------------------------------------------------/       
//SET
    //prod menu input
    private void setProductInput(int prodMenuInput)
    {
        this.prodMenuInput = prodMenuInput;
    }
    
//-----------------------------------------------------------------------------/ 
}//-----end of ProductMenu class