package validation;

import java.util.AbstractCollection.*;

/**This class extends the Employee menu validation. Its purpose is to take the
 * user input for the type of search, whether its by the first name, last name,
 * employee type.
 *
 * @author Marco Duarte
 */
public class EmpSearchMenuValidation extends MenuValidation
{
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
        
    }
    
    //LAST NAME
    
    
    //AGE
    
    
    //EMPLOYEE TYPE
    
    
    //SALARY
    
    
//SET
    //HR EMP SEARCH INPUT
    private void setEmpSearchInput(int hrEmpSearchInput)
    {
        this.hrEmpSearchInput = hrEmpSearchInput;
    }
    
}//class
