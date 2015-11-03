
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
//----------------------------------------------------------------------------//  
//------CONSTRUCTORS   
    public FullTimeEmployee(String firstName, String lastName, int age, 
            int year, int month, int day, double baseSalary)
    {
        super(firstName, lastName, age, year, month, day);
        
        this.baseSalary = getBaseSalary();
    }//------end of full time employee constructor
    
//----------------------------------------------------------------------------//
//------METHODS 
    public double getBaseSalary()
    {
        return this.baseSalary;
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
        return super.toString() + "\nTotal Base Salary:\t" + getBaseSalary();  
    }
    
}//------end of fulltime employee cladd
    
