package inventory;

import general.ServiceClass;

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
    private int productId;
    private String productName, category, description, partNum;
    private double productCost, productPrice;
    
    private static int productCounter;
//----------------------------------------------------------------------------//  
    //CONSTRUCTOR
    public Product
        (String productName, String category, String manufacturer,
                String description, String partNum)
    {
        super(manufacturer);
        
        this.productId = ServiceClass.getProdId();
        this.productName = productName;
        this.category = category;
        this.description = description;
        this.partNum = partNum;

        updateProdCounter();
    }
//----------------------------------------------------------------------------//  
    //GET
    //PRODUCT ID
    public int getProductId()
    {
        return productId;
    }
    //PRODUCT NAME
    public String getProductName()
    {
        return productName;
    }
    //CATEGORY
    public String getCategory()
    {
        return category;
    }
    //DESRCRIPTION
    public String getDescription()
    {
        return description;
    }
    //PART NUMBER
    public String getPartNum()
    {
        return partNum;
    }
    //PRODUCT COST
    public double getProductCost()
    {
        return productCost;
    }
    //PRODUCT PRICE
    public double getProductPrice()
    {
        return productPrice;
    }
    //PRODUCT COUNTER
    public int getProductCounter()
    {
        return productCounter;
    }
//----------------------------------------------------------------------------//  
    //SET
    //PRODUCT ID
    public void setProductId(int productId)
    {
         this.productId = productId;
    }
    //PRODUCT NAME
    public void setProductName(String productName)
    {
        this.productName = productName;
    }
    //CATEGORY
    public void setcategory(String category)
    {
         this.category = category;
    }
    //DESRCRIPTION
    public void setDescription(String description)
    {
        this.description = description;
    }
    //PART NUMBER
    public void setPartNum(String partNum)
    {
        this.partNum = partNum;
    }
    //PRODUCT COST
    public void setProductCost(double productCost)
    {
        this.productCost = productCost;
    }
    //PRODUCT PRICE
    public void setProductPrice(double productPrice)
    {
        this.productPrice = productPrice;
    }
//----------------------------------------------------------------------------//
//------STATIC
    private void updateProdCounter()
    {
        //update the product number counter
        productCounter++;
    }
//----------------------------------------------------------------------------//
    //OVER RIDE toString()
    @Override
    public String toString() 
    {

        //concate all the product info to the MANUFACTURER super class
        return super.toString() 
                + "\nId:\t\t" + getProductId()
                + "\nName:\t\t" + getProductName()
                + "\nPart Num:\t\t" + getPartNum()
                + "\nCategory:\t\t" + getCategory()
                + "\nDescription:\t\t" + getDescription()
                + "\nCost:\t\t$" + getProductCost()
                + "\nPrice:\t\t$" + getProductPrice();
                
    }

}//end of PRODUCTS
