/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2;

import java.util.*;

/**
 *
 * @author 200296437
 */
public class Store {

    static ArrayList<Employee> employee = new ArrayList<>();
    static ArrayList<Product> product = new ArrayList<>();
    static ArrayList<Manufacturing> manufacturer = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        manufacturer.add(new Manufacturing("Manu1", "1234 Double Ave", "A1B2C3", "Bob Smith", "BobSmith@Manu1.com", "Manu1.com", "7051234567"));
        manufacturer.add(new Manufacturing("Manu2", "4321 Float Drive", "B1C2D3", "Jeff Johnson", "JeffJohnson@Manu2.com", "Manu2.com", "7057654321"));
        manufacturer.add(new Manufacturing("Manu3", "4444 Boolean Lane", "C1D2E3", "Ted Williams", "TedWilliams@Manu3.com", "Manu3.com", "7051237654"));
        manufacturer.add(new Manufacturing("Manu4", "0011 Integer Cresent", "D1E2F3", "Jack Brown", "JackBrown@Manu4.com", "Manu4.com", "7057654123"));
        menu();
    }
    // Main Menu
    public static void menu() {
        int choice = 0;

        do {
            try {
                System.out.println("Welcome to the Store");
                System.out.println("Pick a option to continue");
                System.out.println("------------------------------");
                System.out.println("|Press 1 to Create a Employee|");
                System.out.println("|Press 2 to Create a Product |");
                System.out.println("|Press 3 to Search Employees |");
                System.out.println("|Press 4 to Search Products  |");
                System.out.println("|Press 5 to Exit             |");
                System.out.println("------------------------------");
                choice = Integer.parseInt(input.nextLine());
                if (choice == 1) {
                    employeeType();
                } else if (choice == 2) {
                    newProduct();
                } else if (choice == 3) {
                    displayEmployee();
                } else if (choice == 4) {
                    displayProduct();
                }
            } catch (Exception e) {
                System.out.println("Enter a proper value");
            }
        } while (choice != 5);

    }
    // Employee type menu
    public static void employeeType() {
        int choice = 0;
        boolean runloop = false;
        do {
            try {
                System.out.println("What Kind Of Employee?");
                System.out.println("Pick a option to continue");
                System.out.println("----------------------------------------");
                System.out.println("|Press 1 to Create a Full Time Employee|");
                System.out.println("|Press 2 to Create a Part Time Employee|");
                System.out.println("|Press 3 to Create a Seasonal Employee |");
                System.out.println("----------------------------------------");
                choice = Integer.parseInt(input.nextLine());

                if (choice >= 1 && choice <= 3) {
                    newEmployee(choice);
                    runloop = true;
                }

            } catch (Exception e) {
                System.out.println("Enter a proper value");
            }
        } while (!runloop);
    }
    // gather new employee info
    public static void newEmployee(int choice) {
        String firstName, lastName;
        String startDate, endDate;
        int hours;
        double salary, payRate;
        boolean runloop = false;
        do {
            try {

                System.out.println("Enter the First Name:");
                firstName = input.nextLine();
                System.out.println("Enter the Last Name:");
                lastName = input.nextLine();
                System.out.println("Enter the Hours Worked:");
                hours = Integer.parseInt(input.nextLine());

                if (choice == 1) {
                    System.out.println("Enter the Salary:");
                    salary = Integer.parseInt(input.nextLine());
                    employee.add(new FullTimeEmployee(firstName, lastName, hours, salary));
                } else if (choice == 2) {
                    System.out.println("Enter the Pay Rate:");
                    payRate = Double.parseDouble(input.nextLine());
                    employee.add(new PartTimeEmployee(firstName, lastName, hours, payRate));
                } else if (choice == 3) {
                    System.out.println("Enter the Start date:");
                    startDate = input.nextLine();
                    System.out.println("Enter the End date:");
                    endDate = input.nextLine();
                    System.out.println("Enter the Salary:");
                    salary = Double.parseDouble(input.nextLine());
                    employee.add(new SeasonalEmployee(firstName, lastName, hours, startDate, endDate, salary));
                }
                runloop = true;
            } catch (Exception e) {
                System.out.println("Not a valid entry - Try Again");
            }
        } while (!runloop);
    }
    // gather new product info
    public static void newProduct() {
        String productName;
        int price, quantity, choice = 0;
        boolean runloop = false;
        do {
            try {
                System.out.println("Enter the Product Name:");
                productName = input.nextLine();
                System.out.println("Enter the Price:");
                price = Integer.parseInt(input.nextLine());
                System.out.println("Enter the Quantity:");
                quantity = Integer.parseInt(input.nextLine());
                do {
                    // pick a Manufacturer sub menu
                    System.out.println("Pick a Manufacturer");
                    System.out.println("--------------------");
                    System.out.println("|Press 1 For Manu1 |");
                    System.out.println("|Press 2 For Manu2 |");
                    System.out.println("|Press 3 For Manu3 |");
                    System.out.println("|Press 4 For Manu4 |");
                    System.out.println("|Press 5 to Return |");
                    System.out.println("--------------------");
                    choice = Integer.parseInt(input.nextLine());
                    
                    if (choice >= 1 && choice <=4) {
                    product.add(new Product(productName, price, quantity, manufacturer.get(choice-1)));
                    runloop = true;
                    }
                } while (choice <1 && choice > 5);

            } catch (Exception e) {
                System.out.println("Not a valid entry - Try Again");
            }
        } while (!runloop);
    }
    //search employee array for employee
    public static void displayEmployee() {
        String name;
        boolean foundRec = false;
        System.out.println("Enter the employee's first and last name");
        System.out.println("For example John Smith");
        name = input.nextLine();
        for (Employee s : employee) {
            if (name.equalsIgnoreCase(s.getFullName())) {
                    s.ToString();
                    foundRec = true;           
            }
        }
        if(!foundRec)
        System.out.println("No records found");    
    }
    //search product array for products
    public static void displayProduct() {
        String name;
        boolean foundRec = false;
        System.out.println("Enter the product's name");
        System.out.println("For example Banana");
        name = input.nextLine();
        for (Product s : product) {
            if (name.equalsIgnoreCase(s.getProductName())) {
                    s.ToString();
                    foundRec = true;           
            }
        }
        if(!foundRec)
        System.out.println("No records found");    
    }

}
