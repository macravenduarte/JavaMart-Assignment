package validation;

import java.util.Scanner;

/**
 *
 * @author Marco Duarte
 */
public class ManufacturerValidation extends Validation
{
    private Scanner userInput = new Scanner(System.in);
    
    public ManufacturerValidation()
    {
        
    }
    
    public int getMenuOpt()
    {
        
        return 0;
    }
    @Override
    public int getMenu()
    {
        return getMenuOpt();
    }
}