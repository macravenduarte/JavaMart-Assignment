
package hr;

/**This full time employee class extends the Employee abstract. The employee 
 * will have a base salary, and an added line in the to string for the 
 * base salary
 *
 * @author Marco Duarte
 */
//----------------------------------------------------------------------------//  
public class FullTimeEmployee extends Employee
{
//------CLASS instance VARIABLES
    private double baseSalary;

//------CONSTRUCTORS   
    public FullTimeEmployee(String firstName, String lastName, int age, 
            String position, double baseSalary)
    {
        super(firstName, lastName, age, position);
        
        this.baseSalary = getBaseSalary();
    }//------end of full time employee constructor
    
//----------------------------------------------------------------------------//
//------METHODS 
    public double getBaseSalary()
    {
        return this.baseSalary;
    }//------//end of get base salary
//------OVERRIDE   
    //------over ride the salary to get the base salary
    @Override
    public double salary()
    {
        return getBaseSalary();
    }//------
    
    //------over ride the to String to display the totla base earnings
    @Override
    public String toString() 
    {
        return super.toString() + "\nTotal Base Salary:\t" + getBaseSalary();  
    }//------
}//------end of fulltime employee cladd
    
