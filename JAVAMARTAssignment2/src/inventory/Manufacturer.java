package inventory;

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
    //Manufacturer name references
    private String manu1 = "Staples", manu2 = "Zep";
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
        String manufacturerNames;
        
        //take the set of manufatturer names and return it
        manufacturerNames = manu1 + " " + manu2 + "\n";
        
        return manufacturerNames;
    }
    
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
