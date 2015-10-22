package hr;
import java.util.*;


/**This seasonal employee class extends the full time employee class, 
 * which extends from the 'Employee' abstract super class. 
 * The distinct difference with this kind of employee is that they
 * have a fixed finish date for the end of their working season
 *
 * @author Marco Duarte
 */
//----------------------------------------------------------------------------//
//This seasonal employee class extends the employee abstract
public class SeasonalEmployee extends Employee
{

//------VARIABLES
    //------end of season date for termination    
    private int termYear, termMonth, termDay;
    private Date seasonTermination;
    private double baseSalary;
    
//----------------------------------------------------------------------------//    
//------CONSTRUCTOR
    public SeasonalEmployee(String firstName, String lastName, int age, 
            String position, double baseSalary)
    {
        super(firstName, lastName, age, position);
        this.baseSalary = baseSalary;
        //generate a gregorian calender object for the end of season termination date
        GregorianCalendar cal = new GregorianCalendar(termYear, termMonth-1, termDay);
        
        this.seasonTermination = cal.getTime();
    }//------end of Seasonal Employee constructor
    
//----------------------------------------------------------------------------//
//------METHODS
    //------termination date for the seasonal employee
    public void setEndOfSeasonTermination
        (int year, int month, int day, int termYear, int termMonth, int termDay)
    {
        Scanner input = new Scanner(System.in);
        int tYear, tMonth, tDay;
        
        
        System.out.println("Please enter the year.");
        tYear = input.nextInt();
        //place a validation for the year
        if(tYear < year)
        {
            menu.MenuPrompts.getInvalidMessage();
        }
        else
        {
            termYear = tYear;
        }
        System.out.println("Please enter the month.");
        tMonth = input.nextInt();
        //place a validation for the month
        if(tMonth < month)
        {
            menu.MenuPrompts.getInvalidMessage();
        }
        else
        {
             termMonth = tMonth;
        }
        System.out.println("Please enter the day.");
        tDay = input.nextInt();
        //place a validation for the day
        if(tDay < day)
        {
            menu.MenuPrompts.getInvalidMessage();
        }
        else
        {
            termDay = tDay;
        } 
        //test print
        System.out.println(termYear + " " + termMonth +  " " + termDay);
        this.seasonTermination = new Date(termYear, termMonth, termDay);
    }//------
        
    public double getBaseSalary()
    {
        return this.baseSalary;
    }//------//end of get base salary
    
    public Date getSeasonTermination()
    {
        return seasonTermination;
    }
//----------------------------------------------------------------------------//
    //------over ride base salary
    @Override
    public double salary()
    {
        return getBaseSalary();
    }//------
    
    //------over ride toString to include base earnings and 
    @Override
    public String toString() 
    {
        return super.toString() + "\nTotal Base Salary: \t" + getBaseSalary()
                + super.toString() + "\nSeasonal Termination Date: \t\t" 
                    + getSeasonTermination();  
    }//------
/**---------------------------------------------------------------------------*/
}//end of Seasonal Employee class