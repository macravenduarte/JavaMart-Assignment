/**
 *  Back up of JAVAMART assignment before implementing the menu classes
 */
package general;

/**
 *
 * @author The Raven
 */
public class JAVAMARTAssignmentBACKUP 
{
    
}
/**
 * package general;
import java.util.*;

import menu.*;
import hr.*;
import inventory.*;
/**
 * 
 * @author Marco Duarte
 
public class JAVAMART 
{
    ArrayList<hr.Employee> Employees = new ArrayList(); 
    
    //main method
    public static void main(String[] args)
    {

        //employee test data
        //PartTimeEmployee emp1 = new  PartTimeEmployee("Tony","Persson",50,30000.00,"Sales Manager",2015,05,20,10000.00,0.2);
        
        //add test employee
        //Employees.add(emp1);
        
        //emp testing 
        //System.out.println(emp.toString());
        //emp.setLastName("Smith");
        //System.out.println(emp.toString());
       
        //product test data
        //Product myProduct = new Product("T123","Test Product", "Test Category", 
        //"Test manufacturer", "Test Description", "Test Part Num", 10.00, 20.00,
        //0.22,50);
        
        //lists for employees and products 
        ArrayList<hr.Employee> Employees = new ArrayList();
        ArrayList<inventory.Product> Products = new ArrayList();
        
        //input vars
        Scanner read = new Scanner(System.in);
        int input, hrInput, prodInput;
        String cont = "n";
        boolean mainBool = true, prodBool = true, hrBool = true;
        
/**---------------------------------------------------------------------------
        //display the main menu
        MainMenu.getMainMenu();
        
        //outter while loop to keep the system running
        while(mainBool)
        {
/**---------------------------------------------------------------------------
            
            //later on we will use instanceOf to check the data type and add
            //add a small validation.
            input = Integer.parseInt(read.nextLine());

            //if input is 1, run the product block
            if(input == 1)
            {

                //inner product loop that will work with the
                //product block. Runs until the user ends it.
                while(prodBool)
                {
                    //display the product message
                    menu.MenuPrompts.getProductMessage();

                    //read the user input
                    prodInput = Integer.parseInt(read.nextLine());
                    //selection statement to determine what to do
                    if(prodInput==1)
                    {
                        System.out.println("Display Product list and details:");

                        //System.out.println(myProduct.toString()); //test print
                    }
                    else if(prodInput==2)
                    {
                        System.out.println("Enter a new product here");

                    }
                    else if(prodInput==0)
                    {
                        prodBool = false;
                        menu.MenuPrompts.getMainMenuMessage();

                    }
                    else
                    {
                        System.out.println("Invalid input! Please try again");

                    }
                }
            }
/**---------------------------------------------------------------------------
            //if input is 2, run the HR block
                else if(input == 2)
                {

                    //inner HR loop that will work with the
                    //HR block. Runs until the user ends it.
                    while(hrBool)
                    {
                        //display the HR message
                        menu.MenuPrompts.getHRMessage();

                        //read the user input
                        hrInput = Integer.parseInt(read.nextLine());
                        //selection statement to determine what to do
                        if(hrInput==1)
                        {
                            System.out.println("Run Employee Search here");

                            //test employee
                            //System.out.println(emp1);

                            //prompt user for what employee they want to search 

                            //Run for loop to iterate through the employees in the
                            //Employees ArrayList
                              

                        }
                        else if(hrInput==2)
                        {
                            System.out.println("Enter a new employee here");

                        }
                        else if(hrInput==0)
                        {
                            hrBool = false;
                            menu.MenuPrompts.getMainMenuMessage();
                        }
                        else
                        {
                            System.out.println("Invalid input! Please try again");

                        }

                    }
                }
                else if(input == 0)//Exit block
                {
                    System.out.println("Thank you for using JAVAMART!");
                    mainBool = false;
                }
                else//default block if input is invalid
                {
                    mainBool = true;
                    System.out.println("Please enter a valid input value!");
                    menu.MenuPrompts.getMainMenuMessage();
                }
            }
            
    }//end of main
}//end of JAVAMART

 * 
 */