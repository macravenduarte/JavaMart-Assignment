package inventory;

/*
 * Product class
 * 
 */

/** This Product class extends the Manufacturer class. Every Product object 
 * is only valid with a valid Manufacturer. This class will return a product Id,
 * product name, description, part number, product cost, product price.
 *
 * @author Marco Duarte
 */
public class Product extends Manufacturer
{
//----------------------------------------------------------------------------//  
    //VARIABLES
    private String productId, productName, category,description, partNum;
    private double productCost, productPrice;
//----------------------------------------------------------------------------//  
    //CONSTRUCTOR
    public Product
        (String productId,String productName,String category, 
            String manufacturer,String description, String partNum)
    {
        super(manufacturer);
        
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.description = description;
        this.partNum = partNum;

    }
//----------------------------------------------------------------------------//  
    //GET
    //PRODUCT ID
    public String getProductId()
    {
        return this.productId;
    }
    //PRODUCT NAME
    public String getProductName()
    {
        return this.productName;
    }
    //CATEGORY
    public String getCategory()
    {
        return this.category;
    }
    //DESRCRIPTION
    public String getDescription()
    {
        return this.description;
    }
    //PART NUMBER
    public String getPartNum()
    {
        return this.partNum;
    }
    //PRODUCT COST
    public double getProductCost()
    {
        return this.productCost;
    }
    //PRODUCT PRICE
    public double getProductPrice()
    {
        return this.productPrice;
    }
//----------------------------------------------------------------------------//  
    //SET
    //PRODUCT ID
    public void getProductId(String productId)
    {
         this.productId = productId;
    }
    //PRODUCT NAME
    public void getProductName(String productName)
    {
        this.productName = productName;
    }
    //CATEGORY
    public void category(String category)
    {
         this.category = category;
    }
    //DESRCRIPTION
    public void getDescription(String description)
    {
        this.description = description;
    }
    //PART NUMBER
    public void getPartNum(String partNum)
    {
        this.partNum = partNum;
    }
    //PRODUCT COST
    public void getProductCost(double productCost)
    {
        //add validation here before setting the value
        this.productCost = productCost;
        //run activation check 
    }
    //PRODUCT PRICE
    public void getProductPrice(double productPrice)
    {
        //add validation here before setting the value
        this.productPrice = productPrice;
        //run changeActivationState if needed
    }

    //OVER RIDE toString()
    @Override
    public String toString() 
    {

        return super.toString() 
                + "\nId:\t\t" + getProductId()
                + "\nName:\t\t" + getProductName()
                + "\nPart Num:\t\t" + getPartNum()
                + "\nCategory:\t\t" + getCategory()
                + "\nDescription:\t\t" + getDescription()
                + "\nCost:\t\t$" + getProductCost()
                + "\nPrice:\t\t$" + getProductPrice();
                
    }

}//end of MANUFACTURER
