package hr;
import java.util.*;


/**This seasonal employee class extends the full time employee class, 
 * which extends from the 'Employee' abstract super class. 
 * The distinct difference with this kind of employee is that they
 * have a fixed finish date for the end of their working season
 *
 * @author Marco Duarte
 */

//This seasonal employee class extends the employee abstract
public class SeasonalEmployee extends PartTimeEmployee
{
//-----------------------------------------------------------------------------/
//------Variables
    //------end of season date for termination    
    private Date seasonTermination;
    private int termYear,termMonth, termDay;
    
//-----------------------------------------------------------------------------/
//------SeasonalEmployee constructor
    public SeasonalEmployee(String firstName, String lastName, String gender, int age, 
            int year, int month, int day, int termYear, int termMonth, 
            int termDay, double hourlyRateSalary)
    {
        super(firstName, lastName, gender, age, year, month, day, hourlyRateSalary);
        
        this.termYear = termYear;
        this.termMonth = termMonth;
        this.termDay = termDay;
        
    //generate a gregorian calender object for the end of season termination date
        GregorianCalendar cal = 
                new GregorianCalendar(termYear, termMonth-1, termDay);
        
        this.seasonTermination = cal.getTime();
    }//------end of Seasonal Employee constructor
    
//-----------------------------------------------------------------------------/
//------methods
    //GET
    //SEASON TERMINATION DATE
    public Date getSeasonTermination()
    {
        return seasonTermination;
    }
    //TERMINATION YEAR
    public int getTermYear()
    {
        return termYear;
    }
    //TERMINATION MONTH
    public int getTermMonth()
    {
        return termMonth;
    }
    //TERMINATION DAY
    public int getTermDay()
    {
        return termDay;
    }
//-----------------------------------------------------------------------------/
    //SET
    //termination date for the seasonal employee
    public void setEndOfSeasonTermination
        (int termYear, int termMonth, int termDay)
    {
        this.termYear = termYear;
        this.termMonth = termMonth;
        this.termDay = termDay;
    }

    //over ride toString to include Termination Date
    @Override
    public String toString() 
    {
        return super.toString() + "\nSeason Termination Date: \t\t" 
                    + getSeasonTermination();  
    }
//-----------------------------------------------------------------------------/
}//end of Seasonal Employee class