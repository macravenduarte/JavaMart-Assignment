package inventory;

/** this product class will create a product number 
 *
* @author Marco Duarte
 */
public class ProductClass 
{
    private static int prodId = 1000;
    
    public static int getProdId()
    {
        return prodId++;
    }//end of static constructor 
}//end of product class
