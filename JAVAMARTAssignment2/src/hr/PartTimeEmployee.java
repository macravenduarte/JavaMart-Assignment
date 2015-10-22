package hr;

/**For the part time employee class, the distinct difference is that they have
 *  an hourly wage
 *
 * @author Marco Duarte
 */
//----------------------------------------------------------------------------//  
public class PartTimeEmployee extends Employee
{  
//------CLASS instance VARIABLES
    private double hourlyRateSalary;
//----------------------------------------------------------------------------//  
//------CONSTRUCTORS    
    //create part time employee constructor
    public PartTimeEmployee
        (String firstName, String lastName, int age, String position, 
                double hourlyRateSalary)
    {
        super(firstName, lastName, age, position);
        
    }//------end of part time employee constructor
//----------------------------------------------------------------------------//          
//------METHODS
    public double getHourlyRateSalary()
    {
        this.hourlyRateSalary = this.salary();
        return hourlyRateSalary;
    }
//------OVERRIDE    
    //------salary
    @Override
    public double salary()
    {
        return getHourlyRateSalary();
    }//------
    
    //------toString method  
    @Override
    public String toString() 
    {
        return super.toString() + "\nTotal Hour Rate Salary: \t\t" + getHourlyRateSalary();  
    }//------
    
}//end of part time employee class
