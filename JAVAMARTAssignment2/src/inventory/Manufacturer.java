package inventory;

import java.util.ArrayList;
import java.util.Arrays;
/** The Manufacturer class will supply one Manufacturer name. No subsequent
 * products can be made without making a new Manufacturer first or visa versa.
 * For this example the Manufacturer names are: Staples and Zep, and are
 * validated in the Manufacturer Validation class.
 * 
 * @author Marco Duarte
 */

public class Manufacturer 
{
//----------------------------------------------------------------------------//
//VARIABLES 
    //Contructor variable
    private String manufacturer;
    private ArrayList<String> manuList = 
                Arrays.asList(new String[]{"BestBuy", "Zep", "Ikea"});
    
//----------------------------------------------------------------------------//
//CONSTRUCTOR
    //default constructor
    public Manufacturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
    }
//----------------------------------------------------------------------------//
//GET
    //MANUFACTURER NAMES
    public String getManufacturer()
    {
        return manufacturer;
    }
    //run the names in an array list and display them
    public String getManufacturerList()
    {
        //inner message regarding about the lists
        String noList = "Looks like we have no Manufacturers in our list.";
        //check if any Manyfacturers exist
        if(manuList.length >= 0)
        {
            //take the set of manufacturer names and return it
            for(int i = 0; i < manuList.length; i++)
            {
               System.out.print(manuList[i]);
            }
        }   
        else
        {
            return noList;
        }
        
        return noList;
        
    }//end of get manufacturer list
    
//SET
    //MANUFACTURER
    private void setManufacturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
    }    
    //OVER RIDE
    @Override
    public String toString() 
    {
        String productInfo = "";

        productInfo += "\nManufacturer:\t\t" + getManufacturer();
        
        return productInfo;
    }
}//end of Manufacturer class
