package inventory;

/** The Manufacturer class will supply one Manufacturer name. No subsequent
 * products can be made without making a new Manufacturer first or visa versa.
 *For this example the Manufacturer names are: Staples, Zep and are validated
 * in the Manufacturer Validation class.
 * @author Marco Duarte
 */
public class Manufacturer 
{
//----------------------------------------------------------------------------//
//VARIABLES    
    private String manufacturer;
//----------------------------------------------------------------------------//
//CONSTRUCTOR
    //default constructor
    public Manufacturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
    }
//----------------------------------------------------------------------------//
    //GET
    public String getManufacturer()
    {
        return manufacturer;
    }
    
    //SET
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
