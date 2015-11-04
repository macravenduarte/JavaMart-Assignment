package validation;

/**This class extends the Employee menu validation. Its purpose is to take the
 * user input for the type of search, whether its by the first name, last name,
 * employee type.
 *
 * @author Marco Duarte
 */
public class EmpSearchMenuValidation extends EmployeeMenuValidation
{
    private int hrEmpSearchInput;
    
    public EmpSearchMenuValidation(int hrMenuInput, int hrEmpSearchInput)
    {
        super(hrMenuInput);
        
        this.hrEmpSearchInput = hrEmpSearchInput;
    }
    //GET
    
    //SET
    
}//class
