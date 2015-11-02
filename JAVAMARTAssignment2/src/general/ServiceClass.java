package general;

/**
 *
 * @author Marco Duarte
 */
public class ServiceClass 
{
    private static int empId = 1000, prodId = 1000;    
    
    //employee counter
    public static int getEmpId()
    {
        return empId++;
    }
    
    //product counter
    public static int getProdId()
    {
        return prodId++;
    }
}//end of service class
