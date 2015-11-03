package validation;

import general.JAVAMART;
import java.util.*;
import hr.*;
/**
 *
 * @author Marco Duarte
 */
public class NewEmployeeValidation extends EmployeeMenuValidation
{
//----------------------------------------------------------------------------//
//------Variables
    private Scanner userInput = new Scanner(System.in);
    private int hrEmpType;
    private boolean validMenuBool, validSelectionBool;
    
    //carriers for all valid employee information
    private String firstName, lastName;
    private int age, year, month, day, termYear, termMonth, termDay;
    private double baseSalary, hourlyRateSalary;
//----------------------------------------------------------------------------//
//------CONTRUCTOR
    public NewEmployeeValidation(int hrMenuInput, int hrEmpType)
    {
        super(hrMenuInput);
        
        this.hrEmpType = hrEmpType;
        
    }
//----------------------------------------------------------------------------//
//------GET
    //EMPLOYEE TYPE
    public int getNewEmployeeType()
    {
        
        int newInput;
        //run a loop do-while the input is a valid integer
        //have a try catch block for format exception error handling
        do
        {
            try
            {
                newInput = Integer.parseInt(userInput.nextLine());
                //if the input is a valid menu option
                if(newInput >= 0 || newInput < 4)
                {
                    hrEmpType = newInput;
                    return hrEmpType;
                }
                //invalid, out of range input
                else
                {
                    menu.MenuPrompts.getInvalidMessage();
                    validMenuBool = true;
                }
            }
            catch(NumberFormatException numberFormat)
            {
                System.out.println(numberFormat.toString());
                System.out.println
                    ("Error: you must enter a valid integer.\n");
                validMenuBool = true;
                //display the main menu prompt
                menu.MenuPrompts.getHRMessage();
            }
            catch(Exception generalError)
            {
                System.out.println(generalError.toString());
                System.out.println("Error: Unexpected error.\n");
                validMenuBool = true;
                //display the main menu prompt
                menu.MenuPrompts.getHRMessage();
            }

        }while(validMenuBool);
        
        return hrEmpType;
    }//end of get EMPLOYEE TYPE
//----------------------------------------------------------------------------//
    //NEW FULL TIME EMPLOYEE
    public void getNewFullTime()
    {
        //validate the new information from the user
        setBasicEmployeeInfo(firstName, lastName, age, year, month, day);
        setBaseSalary(baseSalary);
        
        //add the new Fulltime employee to the EMPLOYEE Array List
        JAVAMART.Employees.add
            (new FullTimeEmployee
                (firstName, lastName, age, year, month, day, baseSalary));
        
    }//end of GET NEW FULL TIME EMPLOYEE
//----------------------------------------------------------------------------// 
    //NEW PART TIME EMPLOYEE
    public void getNewPartTime()
    {
        //validate the new information from the user
        setBasicEmployeeInfo(firstName, lastName, age, year, month, day);
        setHourlyRateSalary(hourlyRateSalary);
        
        //add the new Fulltime employee to the EMPLOYEE Array List
        JAVAMART.Employees.add
            (new PartTimeEmployee
                (firstName, lastName, age, year, month, day, hourlyRateSalary));
    }//end of NEW PART TIME EMPLOYEE
//----------------------------------------------------------------------------//
    //NEW SEASONAL EMPLOYEE
    public void getNewSeasonal()
    {
        //validate the new information from the user
        setBasicEmployeeInfo(firstName, lastName, age, year, month, day);
        setHourlyRateSalary(hourlyRateSalary);
        setTermDate(termYear, termMonth, termDay);
        
        //add the new Fulltime employee to the EMPLOYEE Array List
        //JAVAMART.Employees.add
    }//end of NEW SEASONAL EMPLOYEE
//----------------------------------------------------------------------------//
//------SET
    //BASIC EMPLOYEE information
    private void setBasicEmployeeInfo(String firstName, String lastName,
            int age, int year,  int month, int day)
    {        
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setYear(year);
        setMonth(month);
        setDay(day);
 
    }//end of get basic employee info
//----------------------------------------------------------------------------//
//Validate each variable individually
    //FIRST NAME validation
    private void setFirstName(String firstName)
    {
        String newFirstName;
        int newInput;
        
        do
        {
            //verify
            try
            {
                //prompt for the first name
                System.out.println("Please enter a new First Name: ");
                newFirstName = userInput.nextLine();
                
                System.out.println("Is this First Name correct?\n" 
                        +  "\n" + newFirstName + "\n");
                System.out.println("Please enter 1 for yes or 0 for no");
                //
                newInput = Integer.parseInt(userInput.nextLine());
                if(newInput == 1)
                {
                    firstName = newFirstName;
                    this.firstName = firstName;
                }
                else if (newInput == 0)
                {
                    validSelectionBool = true;
                }
                else
                {
                    menu.MenuPrompts.getInvalidMessage();
                    validSelectionBool = true;
                }
            }
            catch(NumberFormatException numberFormat)
            {
                System.err.println(numberFormat.toString());
                System.err.println("Error: you must enter a valid integer.\n");
                validSelectionBool = true;
            }
            catch(Exception generalError)
            {
                System.err.println(generalError.toString());
                System.err.println("Error: Unexpected error.\n");
                validSelectionBool = true;
            }
            
        }while(validSelectionBool);
        //return validSelectionBool;
    }//end of SET FIRST NAME
    
    //LAST NAME validation
    private void setLastName(String lastName)
    {
        String newLastName;
        int newInput;
        
        do
        {
            try
            {
                //prompt for the last name
                System.out.println("Please enter a new Last Name: ");
                newLastName = userInput.nextLine();

                System.out.println("Is this Last Name correct?" 
                        + "\n" + newLastName + "\n");
                System.out.println("Please enter 1 for yes or 0 for no.");

                newInput = Integer.parseInt(userInput.nextLine());
                if(newInput == 1)
                {
                    lastName = newLastName;
                    this.lastName = lastName;

                }
                else if(newInput == 0)
                {
                    validSelectionBool = true;
                }
                else
                {
                    menu.MenuPrompts.getInvalidMessage();
                    validSelectionBool = true;
                }
            }
            catch(NumberFormatException numberFormat)
            {
                System.err.println(numberFormat.toString());
                System.err.println("Error: you must enter a valid integer.\n");
                validSelectionBool = true;
            }
            catch(Exception generalError)
            {
                System.err.println(generalError.toString());
                System.err.println("Error: Unexpected error.\n");
                validSelectionBool = true;
            }
            
        }while(validSelectionBool);
        
        //return validSelectionBool; 
    }//end of SET LAST NAME
    
    //AGE validation
    private void setAge(int age)
    {
        int newAge, newInput;
        
        do
        {
            try
            {
                System.out.println("Please enter the employee's Age:");
                newAge = userInput.nextInt();

                System.out.println("Is this the correct Age?" 
                            + "\n" + newAge + "\n");
                System.out.println("Please enter 1 for yes or 0 for no.");
                newInput = userInput.nextInt();
                if(newInput == 1)
                {
                    //16 years old is the legal working age
                    if(newAge >= 16)
                    {
                        age = newAge;
                        this.age = age;
                    }
                    else
                    {
                        menu.MenuPrompts.getInvalidMessage();
                        validSelectionBool = true;
                    }
                }
                else if(newInput == 0)
                {
                    validSelectionBool = true;
                }
                else
                {
                    menu.MenuPrompts.getInvalidMessage();
                    validSelectionBool = true;
                }
            }
            catch(NumberFormatException numberFormat)
            {
                System.err.println(numberFormat.toString());
                System.err.println("Error: you must enter a valid integer.\n");
                validSelectionBool = true;
            }
            catch(InputMismatchException inputMismatch)
            {
                System.err.println(inputMismatch.toString());
                System.err.println("Error: You entered a letter. \n"
                        + "You must enter a valid integer.\n");
                validSelectionBool = true;
            }
            catch(Exception generalError)
            {
                System.err.println(generalError.toString());
                System.err.println("Error: Unexpected error.\n");
                validSelectionBool = true;
            }

        }while(validSelectionBool);
    }//end of SET AGE
    
    //YEAR validation
    private void setYear(int year)
    {
        int newYear, newInput;
        
        do
        {
            try
            {
                System.out.println("Please enter the employee's starting Year:");
                newYear = userInput.nextInt();

                System.out.println("Is this the correct Year?" 
                            + "\n" + newYear + "\n");
                System.out.println("Please enter 1 for yes or 0 for no.");
                newInput = userInput.nextInt();
                if(newInput == 1)
                {
                    //valid only if the year is the current year
                    if(newYear > 2014)
                    {
                        year = newYear;
                        this.year = year;
                    }
                    else
                    {
                        menu.MenuPrompts.getInvalidMessage();
                        validSelectionBool = true;
                    }
                }
                else if(newInput == 0)
                {
                    validSelectionBool = true;
                }
                else
                {
                    menu.MenuPrompts.getInvalidMessage();
                    validSelectionBool = true;
                }
            }
            catch(NumberFormatException numberFormat)
            {
                System.err.println(numberFormat.toString());
                System.err.println("Error: you must enter a valid integer.\n");
                validSelectionBool = true;
            }
            catch(InputMismatchException inputMismatch)
            {
                System.err.println(inputMismatch.toString());
                System.err.println("Error: You entered a letter. \n"
                        + "You must enter a valid integer.\n");
                validSelectionBool = true;
            }
            catch(Exception generalError)
            {
                System.err.println(generalError.toString());
                System.err.println("Error: Unexpected error.\n");
                validSelectionBool = true;
            }
            
        }while(validSelectionBool);
  
    }
    
    //MONTH validation
    private void setMonth(int month)
    {
        int newMonth, newInput;
        do
        {
            try
            {
                System.out.println("Please enter the employee's starting Month:");
                System.out.println("1 = January, 2 = February, 3 = March, etc.");
                newMonth = userInput.nextInt();

                System.out.println("Is this the correct Month?" 
                            + "\n" + newMonth + "\n");
                System.out.println("Please enter 1 for yes or 0 for no.");
                newInput = userInput.nextInt();
                if(newInput == 1)
                {
                    //valid only if the Month numerical value is correct
                    if(newMonth > 0 && newMonth < 13)
                    {
                        month = newMonth;
                        this.month = month;
                    }
                    else
                    {
                        menu.MenuPrompts.getInvalidMessage();
                        validSelectionBool = true;
                    }
                }
                else if(newInput == 0)
                {
                    validSelectionBool = true;
                }
                else
                {
                    menu.MenuPrompts.getInvalidMessage();
                    validSelectionBool = true;
                }
            }
            catch(NumberFormatException numberFormat)
            {
                System.err.println(numberFormat.toString());
                System.err.println("Error: you must enter a valid integer.\n");
                validSelectionBool = true;
            }
            catch(InputMismatchException inputMismatch)
            {
                System.err.println(inputMismatch.toString());
                System.err.println("Error: You entered a letter. \n"
                        + "You must enter a valid integer.\n");
                validSelectionBool = true;
            }
            catch(Exception generalError)
            {
                System.err.println(generalError.toString());
                System.err.println("Error: Unexpected error.\n");
                validSelectionBool = true;
            }
            
        }while(validSelectionBool);
    }//end of SET MONTH
    
    //DAY validation
    private void setDay(int day)
    {
        int newDay, newInput;
        do
        {
            try
            {
                System.out.println("Please enter the employee's starting Day:");
                newDay = userInput.nextInt();

                System.out.println("Is this the correct Day?" 
                            + "\n" + newDay + "\n");
                System.out.println("Please enter 1 for yes or 0 for no.");
                newInput = userInput.nextInt();
                if(newInput == 1)
                {
                    //valid only if the Month numerical value is correct
                    if(newDay > 0 && newDay < 32)
                    {
                        day = newDay;
                        this.day = day;
                    }
                    else
                    {
                        menu.MenuPrompts.getInvalidMessage();
                        validSelectionBool = true;
                    }
                }
                else if(newInput == 0)
                {
                    validSelectionBool = true;
                }
                else
                {
                    menu.MenuPrompts.getInvalidMessage();
                    validSelectionBool = true;
                }
            }
            catch(NumberFormatException numberFormat)
            {
                System.err.println(numberFormat.toString());
                System.err.println("Error: you must enter a valid integer.\n");
                validSelectionBool = true;
            }
            catch(InputMismatchException inputMismatch)
            {
                System.err.println(inputMismatch.toString());
                System.err.println("Error: You entered a letter. \n"
                        + "You must enter a valid integer.\n");
                validSelectionBool = true;
            }
            catch(Exception generalError)
            {
                System.err.println(generalError.toString());
                System.err.println("Error: Unexpected error.\n");
                validSelectionBool = true;
            }
            
        }while(validSelectionBool);
    }//end of SET DAY
    
//----------------------------------------------------------------------------// 
    //BASE SALARY validation for FULL TIME EMPLOYEES
    private void setBaseSalary(double baseSalary)
    {
        int newInput;
        double newBaseSalary;
       
        do
        {
            try
            {
                System.out.println("Please enter the employee's Base Salary:");
                System.out.println("Reminder: Base Salary starts at $15,000 per year");
                newBaseSalary = userInput.nextDouble();

                System.out.println("Is this the correct Base Salary?" 
                            + "\n" + newBaseSalary + "\n");
                System.out.println("Please enter 1 for yes or 0 for no.");
                newInput = userInput.nextInt();
                if(newInput == 1)
                {
                    //valid only if the Month numerical value is correct
                    if(newBaseSalary > 14999)
                    {
                        baseSalary = newBaseSalary;
                        this.baseSalary = baseSalary;
                    }
                    else
                    {
                        menu.MenuPrompts.getInvalidMessage();
                        validSelectionBool = true;
                    }
                }
                else if(newInput == 0)
                {
                    validSelectionBool = true;
                }
                else
                {
                    menu.MenuPrompts.getInvalidMessage();
                    validSelectionBool = true;
                }
            }
            catch(NumberFormatException numberFormat)
            {
                System.err.println(numberFormat.toString());
                System.err.println("Error: you must enter a valid double.\n");
                validSelectionBool = true;
            }
            catch(InputMismatchException inputMismatch)
            {
                System.err.println(inputMismatch.toString());
                System.err.println("Error: You entered a letter. \n"
                        + "You must enter a valid double.\n");
                validSelectionBool = true;
            }
            catch(Exception generalError)
            {
                System.err.println(generalError.toString());
                System.err.println("Error: Unexpected error.\n");
                validSelectionBool = true;
            }
            
        }while(validSelectionBool);
    }//end of SET BASE SALARY
//----------------------------------------------------------------------------//
    //HOURLRY SALARY FOR PART TIME AND SEASONAL EMPLOYEES
    private void setHourlyRateSalary(double hourlyRateSalary)
    {
        int newInput;
        double newHourlySalary;
       
        do
        {
            try
            {
                System.out.println("Please enter the employee's Hourly Salary:");
                System.out.println("Reminder: Minimum Hourly "
                        + "Salary starts at $11.75 per hour");
                newHourlySalary = userInput.nextDouble();

                System.out.println("Is this the correct Hourly Salary?" 
                            + "\n" + newHourlySalary + "\n");
                System.out.println("Please enter 1 for yes or 0 for no.");
                newInput = userInput.nextInt();
                if(newInput == 1)
                {
                    //valid only if the Month numerical value is correct
                    if(newHourlySalary > 11.74)
                    {
                        hourlyRateSalary = newHourlySalary;
                        this.hourlyRateSalary = hourlyRateSalary;
                    }
                    else
                    {
                        menu.MenuPrompts.getInvalidMessage();
                        validSelectionBool = true;
                    }
                }
                else if(newInput == 0)
                {
                    validSelectionBool = true;
                }
                else
                {
                    menu.MenuPrompts.getInvalidMessage();
                    validSelectionBool = true;
                }
            }
            catch(NumberFormatException numberFormat)
            {
                System.err.println(numberFormat.toString());
                System.err.println("Error: you must enter a valid double.\n");
                validSelectionBool = true;
            }
            catch(InputMismatchException inputMismatch)
            {
                System.err.println(inputMismatch.toString());
                System.err.println("Error: You entered a letter. \n"
                        + "You must enter a valid double.\n");
                validSelectionBool = true;
            }
            catch(Exception generalError)
            {
                System.err.println(generalError.toString());
                System.err.println("Error: Unexpected error.\n");
                validSelectionBool = true;
            }
            
        }while(validSelectionBool);
    }
//----------------------------------------------------------------------------//    
    //TERMINATION DATE for SEASONAL EMPLOYEES   
    private void setTermDate(int termYear,int termMonth,int termDay)
    {
        setTermYear(termYear);
        setTermMonth(termMonth);
        setTermDay(termDay);
    }
    //YEAR validation
    private void setTermYear(int termYear)
    {
        int newTermYear, newInput;
        
        do
        {
            try
            {
                System.out.println("Please enter the employee's starting Year:");
                newTermYear = userInput.nextInt();

                System.out.println("Is this the correct Termination Year?" 
                            + "\n" + newTermYear + "\n");
                System.out.println("Please enter 1 for yes or 0 for no.");
                newInput = userInput.nextInt();
                if(newInput == 1)
                {
                    //valid only if the year is or after the current year
                    if(newTermYear >= year)
                    {
                        termYear = newTermYear;
                        this.termYear = termYear;
                    }
                    else
                    {
                        menu.MenuPrompts.getInvalidMessage();
                        validSelectionBool = true;
                    }
                }
                else if(newInput == 0)
                {
                    validSelectionBool = true;
                }
                else
                {
                    menu.MenuPrompts.getInvalidMessage();
                    validSelectionBool = true;
                }
            }
            catch(NumberFormatException numberFormat)
            {
                System.err.println(numberFormat.toString());
                System.err.println("Error: you must enter a valid integer.\n");
                validSelectionBool = true;
            }
            catch(InputMismatchException inputMismatch)
            {
                System.err.println(inputMismatch.toString());
                System.err.println("Error: You entered a letter. \n"
                        + "You must enter a valid integer.\n");
                validSelectionBool = true;
            }
            catch(Exception generalError)
            {
                System.err.println(generalError.toString());
                System.err.println("Error: Unexpected error.\n");
                validSelectionBool = true;
            }
            
        }while(validSelectionBool);
  
    }
    
    //MONTH validation
    private void setTermMonth(int termMonth)
    {
        int newTermMonth, newInput;
        do
        {
            try
            {
                System.out.println("Please enter the employee's "
                                    + "end of season Termination Month:");
                System.out.println("1 = January, 2 = February, 3 = March, etc.");
                newTermMonth = userInput.nextInt();

                System.out.println("Is this the correct Termination Month?" 
                            + "\n" + newTermMonth + "\n");
                System.out.println("Please enter 1 for yes or 0 for no.");
                newInput = userInput.nextInt();
                if(newInput == 1)
                {
                    //valid only if the Month numerical value is correct
                    if(newTermMonth > month)
                    {
                        termMonth = newTermMonth;
                        this.termMonth = termMonth;
                    }
                    else
                    {
                        menu.MenuPrompts.getInvalidMessage();
                        validSelectionBool = true;
                    }
                }
                else if(newInput == 0)
                {
                    validSelectionBool = true;
                }
                else
                {
                    menu.MenuPrompts.getInvalidMessage();
                    validSelectionBool = true;
                }
            }
            catch(NumberFormatException numberFormat)
            {
                System.err.println(numberFormat.toString());
                System.err.println("Error: you must enter a valid integer.\n");
                validSelectionBool = true;
            }
            catch(InputMismatchException inputMismatch)
            {
                System.err.println(inputMismatch.toString());
                System.err.println("Error: You entered a letter. \n"
                        + "You must enter a valid integer.\n");
                validSelectionBool = true;
            }
            catch(Exception generalError)
            {
                System.err.println(generalError.toString());
                System.err.println("Error: Unexpected error.\n");
                validSelectionBool = true;
            }
            
        }while(validSelectionBool);
    }//end of SET MONTH
    
    //DAY validation
    private void setTermDay(int termDay)
    {
        int newTermDay, newInput;
        
        do
        {
            try
            {
                System.out.println("Please enter the employee's "
                                    + "end of season Termination Day:");
                newTermDay = userInput.nextInt();

                System.out.println("Is this the correct Termination Day?" 
                            + "\n" + newTermDay + "\n");
                System.out.println("Please enter 1 for yes or 0 for no.");
                newInput = userInput.nextInt();
                if(newInput == 1)
                {
                    //valid only if the Month numerical value is correct
                    if(newTermDay > 0 && newTermDay < 32)
                    {
                        termDay = newTermDay;
                        this.termDay = termDay;
                    }
                    else
                    {
                        menu.MenuPrompts.getInvalidMessage();
                        validSelectionBool = true;
                    }
                }
                else if(newInput == 0)
                {
                    validSelectionBool = true;
                }
                else
                {
                    menu.MenuPrompts.getInvalidMessage();
                    validSelectionBool = true;
                }
            }
            catch(NumberFormatException numberFormat)
            {
                System.err.println(numberFormat.toString());
                System.err.println("Error: you must enter a valid integer.\n");
                validSelectionBool = true;
            }
            catch(InputMismatchException inputMismatch)
            {
                System.err.println(inputMismatch.toString());
                System.err.println("Error: You entered a letter. \n"
                        + "You must enter a valid integer.\n");
                validSelectionBool = true;
            }
            catch(Exception generalError)
            {
                System.err.println(generalError.toString());
                System.err.println("Error: Unexpected error.\n");
                validSelectionBool = true;
            }
            
        }while(validSelectionBool);
    }//end of SET DAY
//----------------------------------------------------------------------------//
    //employee type menu selection
    private void setEmpType(int hrEmpType)
    {
        this.hrEmpType = hrEmpType;
    }
}
