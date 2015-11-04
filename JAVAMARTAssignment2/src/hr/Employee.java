package hr;

import general.ServiceClass;
import java.util.*;

/** This is an abstract class for the EMPLOYEE object
 * an "EMPLOYEE" constructor will have a first name, last name, age, position, 
 * and date (YYYY-MM-DD) of when 'Employee' was hired
 * the constructor will also create and employee id and add to the roster of 
 * employees in an Array List
 * 
 * @author Marco Duarte
 */

public abstract class Employee 
{
//----------------------------------------------------------------------------//  
//VARIABLES
    private String firstName, lastName;
    private int empId, age, year, month, day;
    private Date dateOfHire;
    
    private static int empCounter;
//----------------------------------------------------------------------------//  
//CONSTRUCTORS
    
    //DEFAULT
    public Employee()
    {}
    
//------OVERLOADED with first name, last name, age, position, 
    //------and date (YYYY-MM-DD) of when 'Employee' was hired
    public Employee(String firstName, String lastName, int age, 
            int year, int month, int day)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        
        //generate a gregorian calendar object for the date of hire
        GregorianCalendar cal = new GregorianCalendar(year, month-1, day);
        this.dateOfHire = cal.getTime();
        //System.out.println(dateOfHire);
        
        //call the static method of empId to get a new ID for each new Employee
        this.empId = ServiceClass.getEmpId();
        //add one to the static employee counter
        updateEmpCounter();
    }
//----------------------------------------------------------------------------//
//GET 
    //FIRST NAME
    public String getFirstName()
    {
        return firstName;
    }
    
    //LAST NAME
    public String getLastName()
    {
        return lastName;
    }
    
    //FULL NAME
    public String getFullName()
    {
        return firstName + " " + lastName;
    }
    
    //AGE
    public int getAge()
    {
        return age;
    }
    
    //DATE OF HIRE
    public Date getDateOfHire()
    {
        return dateOfHire;
    } 
    //YEAR
    public int getYear()
    {
        return year;
    }
    //MONTH
    public int getMonth()
    {
        return month;
    }
    //DAY
    public int getDay()
    {
        return day;
    }
    
    //EMPLOYEE ID
    public int getEmpId()
    {
        return empId;
    }
    
    //EMPLOYEE ID INFO
    public String getEmpInfo()
    {
        return toString();
    }
    
    //TOTAL EMPLOYEE CONNT
    public int getEmpCount()
    {
        return empCounter;
    }
//----------------------------------------------------------------------------//
//SET
    //FIRST NAME
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    //LAST NAME
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    //AGE
    public void setAge(int age)
    {
        this.age = age; 
    }
     
    //DATE OF HIRE
    public void setDateOfHire(int year, int month, int day)
    {
        //create a new calendar object and chain in the method to 
        //get the time in a Date object. 
        this.dateOfHire = new GregorianCalendar(year,month,day).getTime();
    }
    
    //EMPLOYEE ID
    public void setEmpId(int empId)
    {
        //although this is ok for now, a check for an existing 
        //emp Id must be conducted here
        //checkEmpId(empId);
        this.empId = empId;
    }
//----------------------------------------------------------------------------//
//STATIC
    //UPDATE the employee counter
    private void updateEmpCounter()
    {
        //update the emp count
        empCounter++;
    }
    
//----------------------------------------------------------------------------//
//------ABSTRACT METHOD
    //SALARY
    public abstract double salary();
    
//----------------------------------------------------------------------------//
//------OVERRIDE  
    //toString method
    @Override
    public String toString() 
    {
        String employeeInfo = "";

        employeeInfo += "\nName:\t\t" + getFullName();
        employeeInfo += "\nId:\t\t" + getEmpId();
        employeeInfo += "\nAge:\t\t" + getAge();
        employeeInfo += "\nHire-Date:\t\t" + getDateOfHire();
    
        return employeeInfo;
    }
    
}//end of class
