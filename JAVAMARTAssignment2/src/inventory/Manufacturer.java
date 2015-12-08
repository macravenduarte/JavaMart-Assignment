package inventory;

import java.util.ArrayList;

/** The Manufacturer class will supply one Manufacturer name. No subsequent
 * products can be made without making a new Manufacturer first or visa versa.
 * For this example the Manufacturer names are: Bestbuy, Sobeys, Acme, and Zep,
 * are validated in the Manufacturer Validation class.
 * 
 * @author Marco Duarte
 */

public class Manufacturer 
{
//----------------------------------------------------------------------------//
//VARIABLES 
    //Contructor variable
    private String manufacturer;
    private ArrayList<String> manuList = new ArrayList<String>();   
    
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
        if(manuList.size() >= 0)
        {
            //take the set of manufacturer names and return it
            for(int i = 0; i < manuList.size(); i++)
            {
               System.out.print(manuList.get(i));
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
    private void setManufacturerList(String manufacturer)
    {
        //current business dealt with
        manuList.add("Bestbuy");
        manuList.add("Sobeys");
        manuList.add("Zep");
        manuList.add("Acme");
        
        //if the user wants to add a new manufacturer
        for(int i = 0; i < manuList.size(); i++)
        {
            try
            {
                if(manuList.get(i) != manufacturer)
                {
                    this.manufacturer = manufacturer;
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
                System.out.println("Manufacturer already in the list");
                menu.MenuPrompts.getInvalidMessage();
            }
        }

    }//end of set manufacturer list  
    //OVER RIDE
    @Override
    public String toString() 
    {
        String productInfo = "";

        productInfo += "\nManufacturer:\t\t" + getManufacturer();
        
        return productInfo;
    }
}//end of Manufacturer class
