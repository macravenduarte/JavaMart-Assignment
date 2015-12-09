package validation;

import general.*;
import hr.Employee;
import java.util.Scanner;


/**This class extends the Employee menu validation. Its purpose is to take the
 * user input for the type of search, whether its by the first name, last name,
 * employee type.
 *
 * @author Marco Duarte
 */
public class EmpSearchMenuValidation extends MenuValidation
{
    private Scanner userInput = new Scanner(System.in);
    private int hrEmpSearchInput;
    
    public EmpSearchMenuValidation(int hrMenuInput, int hrEmpSearchInput)
    {
        super(hrMenuInput);
        
        this.hrEmpSearchInput = hrEmpSearchInput;
    }
//GET SEARCH BY
    //FIRST NAME 
    public void getFirstName()
    {
        String searchFName;
        System.out.println("Please enter the first name");
        
        searchFName = userInput.next();
        
        for (Employee Employee : JAVAMART.Employees) {
            if (Employee.getFirstName().matches(searchFName)) {
                System.out.print(Employee.toString());
            } else {
                System.out.println("No Employee by that first name");
            }
        }
    }
    
    //LAST NAME
    public void getLastName()
    {
        String searchLName;
        System.out.println("Please enter the first name");
        
        searchLName = userInput.next();
        
        for(int i = 0; i < JAVAMART.Employees.size(); i++)
        {
            if(JAVAMART.Employees.get(i).getLastName().matches(searchLName))
            {
                System.out.print(JAVAMART.Employees.get(i).toString());
            }
            else
            {
                System.out.println("No Employee by that last name");
            }
        }
    }
    
    //AGE
    public void getAge()
    {
        int searchAge;
        System.out.println("Please enter the last name");
        
        searchAge = userInput.nextInt();
        
        for(int i = 0; i < JAVAMART.Employees.size(); i++)
        {
            if(JAVAMART.Employees.get(i).getAge() == searchAge)
            {
                System.out.print(JAVAMART.Employees.get(i).toString());
            }
            else
            {
                System.out.println("No Employee by that age");
            }
        }
    }
    
    //EMPLOYEE TYPE
    public void getEmpType()
    {
        String searchEmpType;
        System.out.println("Please select one of the types of Employees.");
        
        searchEmpType = userInput.next();
        
        for(int i = 0; i < JAVAMART.Employees.size(); i++)
        {
            if( JAVAMART.Employees.get(i).getClass().getSimpleName().matches(searchEmpType))
            {
                System.out.println(searchEmpType);
            }
            else
            {
                System.out.println("Unknown Employee type");
            }
        }
    }
    
    //SALARY
    public void getAllSalary()
    {
        double searchSalary;
        System.out.println("Please enter the salary");
        
        searchSalary = userInput.nextDouble();
        
        for (Employee Employee : JAVAMART.Employees) {
            if (Employee.equals(searchSalary)) {
                System.out.print(Employee.toString());
            } else {
                System.out.println("No Employee by that first name");
            }
        }
    }
 
    
//SET
    //HR EMP SEARCH INPUT
    private void setEmpSearchInput(int hrEmpSearchInput)
    {
        this.hrEmpSearchInput = hrEmpSearchInput;
    }
    
}//class
