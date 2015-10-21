package general;

/**
 *
 * @author Marco Duarte
 */
public class ServiceClass 
{
    private static int empId = 1000;
    
    public static int getEmpId()
    {
        return empId++;
    }//end of static constructor
}//end of service class
