package hr;
import general.*;
import java.util.*;

/** This is an abstract class for the EMPLOYEE object
 * an "EMPLOYEE" constructor will have a first name, last name, age, position, 
 * and date (YYYY-MM-DD) of when 'Employee' was hired
 * the constructor will also create and employee id and add to the roster of 
 * employees in an Array List
 * @author Marco Duarte
 */
//----------------------------------------------------------------------------//
public abstract class Employee 
{
//------CLASS instance variables
    private String firstName, lastName, position;
    private int empId, age;
    private Date dateOfHire;
    private static int empCounter;
//----------------------------------------------------------------------------//  
//------CONSTRUCTORS
//------explicit default constructor
    public Employee()
    {}
    
//------constructor with first name, last name, age, position, 
    //------and date (YYYY-MM-DD) of when 'Employee' was hired
    public Employee(String firstName, String lastName, int age, 
            String position, int year, int month, int day)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.position = position;
        
        //generate a gregorian calendar object for the date of hire
        GregorianCalendar cal = new GregorianCalendar(year, month-1, day);
        this.dateOfHire = cal.getTime();
        //System.out.println(dateOfHire);
        
        //call the static method of empId to get a new ID
        this.empId = ServiceClass.getEmpId();
        //add one to the static employee counter
        updateEmpCounter();
    }
//----------------------------------------------------------------------------//
//------GET(ACCESSOR) Methods 
    //------first name
    public String getFirstName()
    {
        return firstName;
    }//------
    
    //------last name
    public String getLastName()
    {
        return lastName;
    }//------
    
    //------full name
    public String getFullName()
    {
        return firstName + " " + lastName;
    }//------
    
    //------age
    public int getAge()
    {
        return age;
    }//------
    
    //------position
    public String getPosition()
    {
        return position;
    }//------
    
    //------date of hire
    public Date getDateOfHire()
    {
        return dateOfHire;
    }//------
    
    //------employee ID
    public int getEmpId()
    {
        return empId;
    }//------
    
    //------employee ID info
    public String getEmpInfo()
    {
        return toString();
    }//------
    //------total employee count
    public int getEmpCount()
    {
        return empCounter;
    }//------
    
//----------------------------------------------------------------------------//
//------OVERRIDE  toString method
    @Override
    public String toString() 
    {
        String employeeInfo = "";

        employeeInfo += "\nName:\t\t" + getFullName();
        employeeInfo += "\nId:\t\t" + getEmpId();
        employeeInfo += "\nAge:\t\t" + getAge();
        employeeInfo += "\nPosition:\t\t" + getPosition();
        employeeInfo += "\nHire-Date:\t\t" + getDateOfHire();
    
        return employeeInfo;
    }
//----------------------------------------------------------------------------//
//------SET(MUTATOR) methods
    //------first name
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }//------
    
    //------lastName
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }//------
    
    //------age
    public void setAge(int age)
    {
    //------age check
        if(age > 65 || age < 16)
        {
            this.age = age;
        }
    }//------
    
    //------position
    public void setPosition(String position)
    {
        this.position = position;
    }//------
    
    //------Date of hire
    public void setDateOfHire(int year, int month, int day)
    {
        //create a new calendar object and chain in the method to 
        //get the time in a Date object. 
        this.dateOfHire = new GregorianCalendar(year,month,day).getTime();
    }//------
    
    //------employee Id
    public void setEmpId(int empId)
    {
        //although this is ok for now, a check for an existing 
        //emp Id must be conducted here
        //checkEmpId(empId);
        this.empId = empId;
    }//------
    
//----------------------------------------------------------------------------//
//------OTHER METHODS
    //------update the employee counter
    private void updateEmpCounter()
    {
        //update the emp count
        empCounter++;
    }//------
    
//----------------------------------------------------------------------------//
//------ABSTRACT METHOD
    //------base salary
    public abstract double salary();
    
}//end of class
