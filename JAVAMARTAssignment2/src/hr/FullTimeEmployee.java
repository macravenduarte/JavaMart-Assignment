
package hr;

/**This full time employee class extends the Employee abstract. The employee 
 * will have a base salary, and an added line in the to string for the 
 * base salary
 *
 * @author Marco Duarte
 */
public class FullTimeEmployee extends Employee
{
//------CLASS instance variables
    private double baseSalary;
    private String empType;
//----------------------------------------------------------------------------//  
//------CONSTRUCTORS   
    public FullTimeEmployee
            (String firstName, String lastName, String gender, int age, 
                int year, int month, int day, double baseSalary, String empType)
    {
        super(firstName, lastName, gender, age, year, month, day);
        
        this.baseSalary = baseSalary;
        this.empType = empType;
    }//------end of full time employee constructor
    
//----------------------------------------------------------------------------//
//BASE SALARY
//GET 
    public double getBaseSalary()
    {
        return baseSalary;
    }
//SET  
    public void setBaseSalary(double baseSalary)
    {
        this.baseSalary = baseSalary;
    }
//EMPLOPYEE TYPE
//GET
    public String getEmployeeType()
    {
        return this.empType;
    }
    
//SET 
    private void setEmployeeType(String empType)
    {
        empType = FullTimeEmployee.class.getSimpleName();
        this.empType = empType;
    }
    
//------OVERRIDE   
    //over ride the salary to get the base salary
    @Override
    public double salary()
    {
        return getBaseSalary();
    }
    
    //------over ride the to String to display the totla base earnings
    @Override
    public String toString() 
    {
        return super.toString() 
                + "\nTotal Base Salary:\t\t" + getBaseSalary();  
    }
    
    @Override
    public String getEmpType()
    {
        return getEmployeeType();
    }
}//------end of fulltime employee cladd
    
