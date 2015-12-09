package hr;

/**For the part time employee class, the distinct difference is that they have
 *  an hourly wage
 *
 * @author Marco Duarte
 */
//----------------------------------------------------------------------------//  
public class PartTimeEmployee extends Employee
{  
//CLASS instance variables
    private double hourlyRateSalary;
    protected String empType;
//----------------------------------------------------------------------------//  
//CONSTRUCTORS    
    //create part time employee constructor
    public PartTimeEmployee
                (String firstName, String lastName, String gender, int age, 
                        int year, int month, int day, double hourlyRateSalary,
                        String empType)
    {
        super(firstName, lastName, gender, age, year, month, day);
        this.hourlyRateSalary = hourlyRateSalary;
        this.empType  = empType;
    }//end of part time employee constructor
//----------------------------------------------------------------------------//          
//GET 
    //HOURLIY SALARY
    public double getHourlyRateSalary()
    {
        return hourlyRateSalary;
    }
    //EMPLOPYEE TYPE
    public String getEmployeeType()
    {
        return empType;
    }
    //SET 
    private void setEmployeeType(String empType)
    {
        empType = PartTimeEmployee.class.getSimpleName();
        this.empType = empType;
    }
//OVERRIDE    
    //salary
    @Override
    public double salary()
    {
        return getHourlyRateSalary();
    }
    
    @Override
    public String getEmpType()
    {
        return getEmployeeType();
    }
    //toString method  
    @Override
    public String toString() 
    {
        return super.toString() + "\nTotal Hour Rate Salary: \t\t" + getHourlyRateSalary();  
    }
    
}//end of part time employee class
