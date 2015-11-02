package menu;

/** this class will perform displaying the menu messages for the menu class
 *
 * @author Marco Duarte
 */

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
    //static product menu message method
    public static void getProductMessage()
    {
        System.out.println("What would you like to do?:");
        System.out.println("Please enter a choice:");
        System.out.println("1: Search products");
        System.out.println("2: Enter new product");
        System.out.println("0: Exit");
    }
    //static HR menu message method
    public static void getHRMessage()
    {
        System.out.println("What would you like to do?:");
        System.out.println("Please enter a choice:");
        System.out.println("1: Search employees");
        System.out.println("2: Enter new employee");
        System.out.println("0: Exit");
    }

    public static void getNewEmployeeMenu()
    {
        System.out.println("What type of Employee do you want to create?:");
        System.out.println("Please enter a choice:");
        System.out.println("1: Full-time Employee");
        System.out.println("2: Part-time Employee");
        System.out.println("3: Seasonal Employee");
        System.out.println("0: Exit");
    }
    
    //invalid input
    public static void getInvalidMessage()
    {
        System.out.println("Invalid input! Please try again");
    }
    
    //exiting a menu selectio
    public static void getMenuExitMessage()
    {
        System.out.println("Exiting back to previous menu options.");
    }
    
    //exiting the porgram
    public static void getExitMessage()
    {
        System.out.println("Thank you for using JAVAMART!\n GoodBye!");
    }
}//end of menu prompts class
