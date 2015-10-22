package menu;

/** this class will perform displaying the menu messages for the menu class
 *
 * @author Marco Duarte
 */
//----------------------------------------------------------------------------//
public class MenuPrompts 
{

    //static main menu message method
    public static void getMainMenuMessage()
    {
        System.out.println("Welcome to JAVAMART!");
        System.out.println("Please enter a choice:");
        System.out.println("1: Products");
        System.out.println("2: HR");
        System.out.println("0: Exit");
    }
    
    //static cancel message method
    public static void getCancelMessage()
    {
        System.out.println("Exiting Menu.");
    }
    
    //static exit message method
    public static void getExitMessage()
    {
        System.out.println("Thank you for using JAVAMART!\n GoodBye!");
    }
    
//----------------------------------------------------------------------------//
    //static product menu message method
    public static void getProductMessage()
    {
        System.out.println("What would you like to do?:");
        System.out.println("Please enter a choice:");
        System.out.println("1: Search products");
        System.out.println("2: Enter new product");
        System.out.println("0: Exit");
    }
//----------------------------------------------------------------------------//
//HR Menu Prompts
    //static HR menu message method
    public static void getHRMessage()
    {
        System.out.println("What would you like to do?:");
        System.out.println("Please enter a choice:");
        System.out.println("1: Search employees");
        System.out.println("2: Enter new employee");
        System.out.println("0: Exit");
    }
//Basic Employee Info Message
    public static void getBasicEmployeeInfoMessage()
    {
        System.out.println("Please enter some basic Employee information:");
        System.out.println("Enter their first name, last name, position, age: ");
    }
//Basic info sub messages
    //first name
    public static void getEmployeeFirstNameMessage()
    {
        System.out.println("Enter the first name: ");
    }
    //last name
    public static void getEmployeeLastNameMessage()
    {
        System.out.println("Enter the last name: ");
    }
    //position
    public static void getEmployeePositionNameMessage()
    {
        System.out.println("Enter their position: ");
    }
    //age
    public static void getEmployeeAgeMessage()
    {
        System.out.println("Enter the age: ");
    }
    //year
    public static void getEmployeeYearStartMessage()
    {
        System.out.println("Enter their starting year: ");
    }
    //month
    public static void getEmployeeMonthStartMessage()
    {
        System.out.println("Enter their sarting month: ");
    }
    //day
    public static void getEmployeeDayStartMessage()
    {
        System.out.println("Enter their starting day: ");
    }
    //end of basic employee info messages
//----------------------------------------------------------------------------//
    
//Employee Type Selection Message
    public static void getEmployeeTypeMessage()
    {
        System.out.println("What type of Employee do you want to add?:");
        System.out.println("Please enter a choice:");
        System.out.println("1: Full-Time Employees");
        System.out.println("2: Part-Time Employee");
        System.out.println("3: Seasonal Employee");
        System.out.println("0: Exit");
    }
    
//Employee Type Details Selection
    //Full time
    public static void getFTEmployeeTypeMessage()
    {
        System.out.println("What type of Employee do you want to add?:");
        System.out.println("Please enter a choice:");
        System.out.println("1: Full-Time Employees");
        System.out.println("2: Part-Time Employee");
        System.out.println("3: Seasonal Employee");
        System.out.println("0: Exit");
    }
    
    //Part time
    public static void getPTEmployeeTypeMessage()
    {
        System.out.println("What type of Employee do you want to add?:");
        System.out.println("Please enter a choice:");
        System.out.println("1: Full-Time Employees");
        System.out.println("2: Part-Time Employee");
        System.out.println("3: Seasonal Employee");
        System.out.println("0: Exit");
    }
    
    //Seasonal
    public static void getSNLEmployeeTypeMessage()
    {
        System.out.println("What type of Employee do you want to add?:");
        System.out.println("Please enter a choice:");
        System.out.println("1: Full-Time Employees");
        System.out.println("2: Part-Time Employee");
        System.out.println("3: Seasonal Employee");
        System.out.println("0: Exit");
    }

//----------------------------------------------------------------------------//
    //Entry complete
    public static void getCompleteMessage()
    {
        System.out.println("Entry Complete!");
    }

    //invalid input
    public static void getInvalidMessage()
    {
        System.out.println("Invalid input! Please try again");
    }
}//end of menu prompts class
