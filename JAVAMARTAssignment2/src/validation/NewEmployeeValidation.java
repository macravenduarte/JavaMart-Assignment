package validation;

import general.JAVAMART;
import hr.FullTimeEmployee;
import hr.PartTimeEmployee;
import hr.SeasonalEmployee;
import java.util.InputMismatchException;
import java.util.Scanner;

/** This Class is an extension of the New Employee Menu Validation class. 
 * Its purpose is to validate all content that creates any employee type. 
 * Before injecting the values in the user must enter in correct information 
 * for the values to pass through. There are sections that deal with the 
 * basic employee information and separate methods that deal with the unique 
 * differences between each type of employee. Base salary, hourly rate and 
 * termination date are all validated on their own.
 *
 * @author Marco Duarte
 */
public class NewEmployeeValidation extends NewEmployeeMenuValidation
{
//----------------------------------------------------------------------------//
//------Variables
    private Scanner userInput = new Scanner(System.in);
    
    private boolean validSelectionBool = false;
    
    //carriers for all valid employee information
    private String firstName, lastName, gender;
    private int age, year, month, day, termYear, termMonth, termDay;
    private double baseSalary, hourlyRateSalary;
//----------------------------------------------------------------------------//
//CONTRUCTOR 
    public NewEmployeeValidation(int hrMenuInput, int hrEmpType)
    {
        super(hrMenuInput, hrEmpType);
    }
//----------------------------------------------------------------------------//
    //NEW FULL TIME EMPLOYEE
    public void getNewFullTime()
    {
        
        //validate the new information from the user and associate with 
        //the class variables
        setBasicEmployeeInfo(firstName, lastName, gender, age, year, month, day);
        setBaseSalary(baseSalary);
        
        //add the new Fulltime employee to the EMPLOYEE Array List
        JAVAMART.Employees.add
            (new FullTimeEmployee
                (firstName, lastName, gender, age, year, month, day, baseSalary));
        
    }//end of GET NEW FULL TIME EMPLOYEE
//----------------------------------------------------------------------------// 
    //NEW PART TIME EMPLOYEE
    public void getNewPartTime()
    {
        //validate the new information from the user and associate with 
        //the class variables
        setBasicEmployeeInfo(firstName, lastName, gender, age, year, month, day);
        setHourlyRateSalary(hourlyRateSalary);
        
        //add the new Part time employee to the EMPLOYEE Array List
        JAVAMART.Employees.add
            (new PartTimeEmployee
                (firstName, lastName, gender, age, year, 
                            month, day, hourlyRateSalary));
    }//end of NEW PART TIME EMPLOYEE
//----------------------------------------------------------------------------//
    //NEW SEASONAL EMPLOYEE
    public void getNewSeasonal()
    {
        //validate the new information from the user and associate with 
        //the class variables
        setBasicEmployeeInfo(firstName, lastName, gender, age, year, month, day);
        setHourlyRateSalary(hourlyRateSalary);
        setTermDate(termYear, termMonth, termDay);
        
        //add the new Seasonal employee to the EMPLOYEE Array List
        JAVAMART.Employees.add
                (new SeasonalEmployee
                    (firstName, lastName, gender, age, year, month, day, 
                            termYear, termMonth, termDay, hourlyRateSalary));
    }//end of NEW SEASONAL EMPLOYEE
//----------------------------------------------------------------------------//
//SET
    //BASIC EMPLOYEE information, first & last names, age, and the year, month
        // and day they joined
    private void setBasicEmployeeInfo(String firstName, String lastName, 
            String gender, int age, int year, int month, int day)
    {        
        setFirstName(firstName);
        setLastName(lastName);
        setGender(gender);
        setAge(age);
        setYear(year);
        setMonth(month);
        setDay(day);
 
    }//end of get basic employee info
//----------------------------------------------------------------------------//
//Validate each object variable individually
    //FIRST NAME
    private void setFirstName(String firstName)
    {
        String newFirstName;
        int newInput;
        
        do
        {
            
            try
            {
                //prompt
                System.out.println("Please enter a new First Name: ");
                newFirstName = userInput.nextLine();
                
                //verify
                System.out.println("Is this First Name correct?\n" 
                        +  "\n" + newFirstName + "\n");
                System.out.println("Please enter 1 for yes or 0 for no");
                
                newInput = Integer.parseInt(userInput.nextLine());
                if(newInput == 1)
                {
                    firstName = newFirstName;
                    this.firstName = firstName;
                    validSelectionBool = true;
                }
                else if (newInput == 0)
                {
                    validSelectionBool = false;
                }
                else
                {
                    menu.MenuPrompts.getInvalidMessage();
                    validSelectionBool = false;
                }
            }
            catch(NumberFormatException numberFormat)
            {
                System.err.println(numberFormat.toString());
                System.err.println("Error: you must enter a valid integer.\n");
                validSelectionBool = false;
            }
            catch(Exception e)
            {
                System.err.println(e.toString());
                System.err.println("Error: Unexpected error.\n");
                validSelectionBool = false;
            }
            
        }while(!validSelectionBool);

    }//end of SET FIRST NAME
//----------------------------------------------------------------------------//   
    //LAST NAME
    private void setLastName(String lastName)
    {
        String newLastName;
        int newInput;
        
        do
        {
            try
            {
                //prompt 
                System.out.println("Please enter a new Last Name: ");
                newLastName = userInput.nextLine();
                //verify
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
            catch(Exception e)
            {
                System.err.println(e.toString());
                System.err.println("Error: Unexpected error.\n");
                validSelectionBool = true;
            }
            
        }while(validSelectionBool);

    }//end of SET LAST NAME
//----------------------------------------------------------------------------//    
    //GENDER
    private void setGender(String gender)
    {
        boolean outerSelect = true;
        
        do
        {
            try
            {
                if( gender.toLowerCase().contentEquals("male") )
                {
                    menu.MenuPrompts.getConfirm();
                    if(userInput.nextInt() == 1)
                    {
                        this.gender = gender;
                        outerSelect = false;
                    }
                    else if(userInput.nextInt() == 0)
                    {
                        outerSelect = true;
                    }
                    else
                    {
                        System.out.println("No valid selection was made."
                                                    + " Please try again");
                        outerSelect = true;
                    }
                }//end if male
                else if( gender.toLowerCase().contentEquals("female")  )
                {
                    menu.MenuPrompts.getConfirm();
                    if(userInput.nextInt() == 1)
                    {
                        this.gender = gender;
                        outerSelect = false;
                    }
                    else if(userInput.nextInt() == 0)
                    {
                        outerSelect = true;
                    }
                    else
                    {
                        System.out.println("No valid selection was made."
                                                    + " Please try again");
                        outerSelect = true;
                    }
                }//end else if female
                else
                {
                    System.out.println("No gender selected. Please select a gender.");

                }
            }
            //catch()
            //{
                
            //}
            catch(Exception e)
            {
                e.printStackTrace();
                System.err.print("Unexcpected error. Please start again.");
            }
        } while(outerSelect);
        
    }//end of set Gender

    //AGE
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
                    //16 years old is the legal working age, 65 for retirement
                    if(newAge >= 16 && newAge <= 65)
                    {
                        age = newAge;
                        this.age = age;
                        validSelectionBool = true;
                    }
                    else
                    {
                        menu.MenuPrompts.getInvalidMessage();
                        validSelectionBool = false;
                    }
                }
                else if(newInput == 0)
                {
                    validSelectionBool = false;
                }
                else
                {
                    menu.MenuPrompts.getInvalidMessage();
                    validSelectionBool = false;
                }
            }
            catch(NumberFormatException numberFormat)
            {
                System.err.println(numberFormat.toString());
                System.err.println("Error: you must enter a valid integer.\n");
                validSelectionBool = false;
            }
            catch(InputMismatchException inputMismatch)
            {
                System.err.println(inputMismatch.toString());
                System.err.println("Error: You entered a letter. \n"
                        + "You must enter a valid integer.\n");
                validSelectionBool = false;
            }
            catch(Exception e)
            {
                System.err.println(e.toString());
                System.err.println("Error: Unexpected error.\n");
                validSelectionBool = false;
            }

        }while(!validSelectionBool);
    }//end of SET AGE
//----------------------------------------------------------------------------//
    //YEAR
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
                        validSelectionBool = true;
                    }
                    else
                    {
                        menu.MenuPrompts.getInvalidMessage();
                        validSelectionBool = false;
                    }
                }
                else if(newInput == 0)
                {
                    validSelectionBool = false;
                }
                else
                {
                    menu.MenuPrompts.getInvalidMessage();
                    validSelectionBool = false;
                }
            }
            catch(NumberFormatException numberFormat)
            {
                System.err.println(numberFormat.toString());
                System.err.println("Error: you must enter a valid integer.\n");
                validSelectionBool = false;
            }
            catch(InputMismatchException inputMismatch)
            {
                System.err.println(inputMismatch.toString());
                System.err.println("Error: You entered a letter. \n"
                        + "You must enter a valid integer.\n");
                validSelectionBool = false;
            }
            catch(Exception e)
            {
                System.err.println(e.toString());
                System.err.println("Error: Unexpected error.\n");
                validSelectionBool = false;
            }
            
        }while(!validSelectionBool);
  
    }//end of SET YEAR
//----------------------------------------------------------------------------//
    //MONTH
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
                        validSelectionBool = true;
                    }
                    else
                    {
                        menu.MenuPrompts.getInvalidMessage();
                        validSelectionBool = false;
                    }
                }
                else if(newInput == 0)
                {
                    validSelectionBool = false;
                }
                else
                {
                    menu.MenuPrompts.getInvalidMessage();
                    validSelectionBool = false;
                }
            }
            catch(NumberFormatException numberFormat)
            {
                System.err.println(numberFormat.toString());
                System.err.println("Error: you must enter a valid integer.\n");
                validSelectionBool = false;
            }
            catch(InputMismatchException inputMismatch)
            {
                System.err.println(inputMismatch.toString());
                System.err.println("Error: You entered a letter. \n"
                        + "You must enter a valid integer.\n");
                validSelectionBool = false;
            }
            catch(Exception e)
            {
                System.err.println(e.toString());
                System.err.println("Error: Unexpected error.\n");
                validSelectionBool = false;
            }
            
        }while(!validSelectionBool);
    }//end of SET MONTH
//----------------------------------------------------------------------------//
    //DAY
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
                        validSelectionBool = true;
                    }
                    else
                    {
                        menu.MenuPrompts.getInvalidMessage();
                        validSelectionBool = false;
                    }
                }
                else if(newInput == 0)
                {
                    validSelectionBool = false;
                }
                else
                {
                    menu.MenuPrompts.getInvalidMessage();
                    validSelectionBool = false;
                }
            }
            catch(NumberFormatException numberFormat)
            {
                System.err.println(numberFormat.toString());
                System.err.println("Error: you must enter a valid integer.\n");
                validSelectionBool = false;
            }
            catch(InputMismatchException inputMismatch)
            {
                System.err.println(inputMismatch.toString());
                System.err.println("Error: You entered a letter. \n"
                        + "You must enter a valid integer.\n");
                validSelectionBool = false;
            }
            catch(Exception e)
            {
                System.err.println(e.toString());
                System.err.println("Error: Unexpected error.\n");
                validSelectionBool = false;
            }
            
        }while(!validSelectionBool);
    }//end of SET DAY
//----------------------------------------------------------------------------//
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
                System.out.println("Reminder:"
                                + " Base Salary starts at $15,000 per year");
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
                        validSelectionBool = true;
                    }
                    else
                    {
                        menu.MenuPrompts.getInvalidMessage();
                        validSelectionBool = false;
                    }
                }
                else if(newInput == 0)
                {
                    validSelectionBool = false;
                }
                else
                {
                    menu.MenuPrompts.getInvalidMessage();
                    validSelectionBool = false;
                }
            }
            catch(NumberFormatException numberFormat)
            {
                System.err.println(numberFormat.toString());
                System.err.println("Error: you must enter a valid double.\n");
                validSelectionBool = false;
            }
            catch(InputMismatchException inputMismatch)
            {
                System.err.println(inputMismatch.toString());
                System.err.println("Error: You entered a letter.\n"
                        + "You must enter a valid double.\n");
                validSelectionBool = false;
            }
            catch(Exception e)
            {
                System.err.println(e.toString());
                System.err.println("Error: Unexpected error.\n");
                validSelectionBool = false;
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
                        validSelectionBool = true;
                    }
                    else
                    {
                        menu.MenuPrompts.getInvalidMessage();
                        validSelectionBool = false;
                    }
                }
                else if(newInput == 0)
                {
                    validSelectionBool = false;
                }
                else
                {
                    menu.MenuPrompts.getInvalidMessage();
                    validSelectionBool = false;
                }
            }
            catch(NumberFormatException numberFormat)
            {
                System.err.println(numberFormat.toString());
                System.err.println("Error: you must enter a valid double.\n");
                validSelectionBool = false;
            }
            catch(InputMismatchException inputMismatch)
            {
                System.err.println(inputMismatch.toString());
                System.err.println("Error: You entered a letter. \n"
                        + "You must enter a valid double.\n");
                validSelectionBool = false;
            }
            catch(Exception e)
            {
                System.err.println(e.toString());
                System.err.println("Error: Unexpected error.\n");
                validSelectionBool = false;
            }
            
        }while(validSelectionBool);
    }//end of SET HOURLY RATE
//----------------------------------------------------------------------------//    
    //TERMINATION year, month and day for SEASONAL EMPLOYEES   
    private void setTermDate(int termYear,int termMonth,int termDay)
    {
        setTermYear(termYear);
        setTermMonth(termMonth);
        setTermDay(termDay);
    }
    //TERMINATION YEAR validation
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
                        validSelectionBool = true;
                    }
                    else
                    {
                        menu.MenuPrompts.getInvalidMessage();
                        validSelectionBool = false;
                    }
                }
                else if(newInput == 0)
                {
                    validSelectionBool = false;
                }
                else
                {
                    menu.MenuPrompts.getInvalidMessage();
                    validSelectionBool = false;
                }
            }
            catch(NumberFormatException numberFormat)
            {
                System.err.println(numberFormat.toString());
                System.err.println("Error: you must enter a valid integer.\n");
                validSelectionBool = false;
            }
            catch(InputMismatchException inputMismatch)
            {
                System.err.println(inputMismatch.toString());
                System.err.println("Error: You entered a letter. \n"
                        + "You must enter a valid integer.\n");
                validSelectionBool = false;
            }
            catch(Exception e)
            {
                System.err.println(e.toString());
                System.err.println("Error: Unexpected error.\n");
                validSelectionBool = false;
            }
            
        }while(validSelectionBool);
  
    }//end of SET TERMINATION YEAR
    
    //TERMINATION MONTH
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
                        validSelectionBool = true;
                    }
                    else
                    {
                        menu.MenuPrompts.getInvalidMessage();
                        validSelectionBool = false;
                    }
                }
                else if(newInput == 0)
                {
                    validSelectionBool = false;
                }
                else
                {
                    menu.MenuPrompts.getInvalidMessage();
                    validSelectionBool = false;
                }
            }
            catch(NumberFormatException numberFormat)
            {
                System.err.println(numberFormat.toString());
                System.err.println("Error: you must enter a valid integer.\n");
                validSelectionBool = false;
            }
            catch(InputMismatchException inputMismatch)
            {
                System.err.println(inputMismatch.toString());
                System.err.println("Error: You entered a letter. \n"
                        + "You must enter a valid integer.\n");
                validSelectionBool = false;
            }
            catch(Exception e)
            {
                System.err.println(e.toString());
                System.err.println("Error: Unexpected error.\n");
                validSelectionBool = false;
            }
            
        }while(validSelectionBool);
    }//end of SET TERMINATION MONTH
    
    //TERMINATION DAY
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
                        validSelectionBool = true;
                    }
                    else
                    {
                        menu.MenuPrompts.getInvalidMessage();
                        validSelectionBool = false;
                    }
                }
                else if(newInput == 0)
                {
                    validSelectionBool = false;
                }
                else
                {
                    menu.MenuPrompts.getInvalidMessage();
                    validSelectionBool = false;
                }
            }
            catch(NumberFormatException numberFormat)
            {
                System.err.println(numberFormat.toString());
                System.err.println("Error: you must enter a valid integer.\n");
                validSelectionBool = false;
            }
            catch(InputMismatchException inputMismatch)
            {
                System.err.println(inputMismatch.toString());
                System.err.println("Error: You entered a letter. \n"
                        + "You must enter a valid integer.\n");
                validSelectionBool = false;
            }
            catch(Exception e)
            {
                System.err.println(e.toString());
                System.err.println("Error: Unexpected error.\n");
                validSelectionBool = false;
            }
            
        }while(validSelectionBool);
    }//end of SET TERMINATION DAY

}//end of class