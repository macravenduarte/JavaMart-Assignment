package validation;

import java.util.*;

/**
 *
 * @author Marco Duarte
 */
public class ProductValidation extends Validation
{
//----------------------------------------------------------------------------//
//------Variables  
    private int prodMenuInput;
    private boolean validMenuBool;
//----------------------------------------------------------------------------//
//------CONTRUCTOR     
    public ProductValidation(int prodMenuInput)
    {
        this.prodMenuInput = prodMenuInput;       
    }
//----------------------------------------------------------------------------//
//------GET product menu input
    public int getProdMenuInput()
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
                if(newInput >= 0 || newInput < 3)
                {
                    prodMenuInput = newInput;
                    return prodMenuInput;
                }
            }
            catch(NumberFormatException numberFormat)
            {
                System.out.println(numberFormat.toString());
                System.out.println
                    ("Error: you must enter a valid integer.\n");
                validMenuBool = true;
                //display the main menu prompt
                menu.MenuPrompts.getProductMessage();
            }
            catch(Exception generalError)
            {
                System.out.println(generalError.toString());
                System.out.println("Error: Unexpected error.\n");
                validMenuBool = true;
                //display the main menu prompt
                menu.MenuPrompts.getProductMessage();
            }

        }while(validMenuBool);
        
        return prodMenuInput;
    }
//----------------------------------------------------------------------------//
//------SET product menu input
    private void setProdMenuInput(int prodMenuInput)
    {
        this.prodMenuInput = prodMenuInput;
    }
    
//----------------------------------------------------------------------------//
}//------end of EmployeeMenuValidation sub class
