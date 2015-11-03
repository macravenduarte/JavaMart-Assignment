package menu;

/** this class will perform displaying the menu messages for the menu class
 *
 * @author Marco Duarte
 */

public class MenuPrompts 
{

    //static MAIN MENU message
    public static void getMainMenuMessage()
    {
        System.out.println("---------------------------------------------");
        System.out.println("Welcome to JAVAMART!");
        System.out.println("Please enter a choice:");
        System.out.println("1: Products");
        System.out.println("2: HR");
        System.out.println("0: Exit");
        System.out.println("---------------------------------------------\n");
    }
    //static PRODUCT MENU message 
    public static void getProductMessage()
    {
        System.out.println("---------------------------------------------");
        System.out.println("What would you like to do?:");
        System.out.println("Please enter a choice:");
        System.out.println("1: Search products");
        System.out.println("2: Enter new product");
        System.out.println("0: Exit");
        System.out.println("---------------------------------------------\n");
    }
    //static HR MENU message 
    public static void getHRMessage()
    {
        System.out.println("\n---------------------------------------------");
        System.out.println("What would you like to do?:");
        System.out.println("Please enter a choice:");
        System.out.println("1: Search employees");
        System.out.println("2: Enter new employee");
        System.out.println("0: Exit");
        System.out.println("---------------------------------------------\n");
    }

    //static NEW EMPLOYEE MENU message
    public static void getNewEmployeeMenu()
    {
        System.out.println("---------------------------------------------");
        System.out.println("What type of Employee do you want to create?:");
        System.out.println("1: Full-time Employee");
        System.out.println("2: Part-time Employee");
        System.out.println("3: Seasonal Employee");
        System.out.println("0: Exit");
        System.out.println("---------------------------------------------\n");
    }
    
    //static INVALID INPUT
    public static void getInvalidMessage()
    {
        System.out.println("---------------------------------------------");
        System.out.println("Invalid input! Please try again");
        System.out.println("---------------------------------------------\n");
    }
    
    //static EXITING a MENU selection
    public static void getMenuExitMessage()
    {
        System.out.println("---------------------------------------------");
        System.out.println("Exiting back to previous menu options.");
        System.out.println("---------------------------------------------\n");
    }
    
    //static EXITING the program
    public static void getExitMessage()
    {
        System.out.println("---------------------------------------------");
        System.out.println("Thank you for using JAVAMART!\n GoodBye!");
        System.out.println("---------------------------------------------\n");
    }
}//end of menu prompts class
