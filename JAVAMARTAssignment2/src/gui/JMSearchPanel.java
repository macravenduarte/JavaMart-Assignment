package gui;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Marco Duarte
 */
public class JMSearchPanel extends JPanel
{
//local variables for components
    //labels
    private final JLabel    lblSearch, lblName,
                            lblPosition, lblSalary,
                            lblResult;
    
    //text field
    private final JTextField    txtSearch;
    
    //text area
    private final JTextArea     txtResult;
    
    //dropdown list
    private final JComboBox<String> cmbName, cmbPosition, cmbSalary;
    
    private static final String[]
            name = {"", 
                    "First Name", "Last Name"},
            position = {"", 
                        "Full-Time", "Part-Time", "Seasonal"},
            salary = {  "",
                        "     0 >= and < 10,000", 
                        "10,000 >= and < 15,000",
                        "15,000 >= and < 19,999",
                        "20,000 >= and < 24,999",
                        "25,000 >= and < 29,999",
                        ">= 30,000"};
//end of variable components
    
    //constructor
    public JMSearchPanel()
    {
        setLayout ( new GridLayout(6,2) );
        
    //create 
        //labels
        lblSearch = new JLabel ("Search");
        lblName = new JLabel ("Name");
        //text area
        lblResult = new JLabel ("Result");
        txtResult = new JTextArea();
        lblPosition = new JLabel ("Position");
        lblSalary = new JLabel ("Salary");
        //text field
        txtSearch = new JTextField (2);
        //combobox
        cmbName = new JComboBox<>(name);
        cmbPosition = new JComboBox<>(position);
        cmbSalary = new JComboBox<>(salary);
        
        //border
        setBorder(BorderFactory.createTitledBorder("Employee Search") );
        
    //add
        //SearchType
        add(lblSearch);
        add(txtSearch);
        //text area
        add(lblResult);
        add(txtResult);
        //FirstName
        add(lblName);
        add(cmbName);
        //Position
        add(lblPosition);
        add(cmbPosition);
        //Salary
        add(lblSalary);
        add(cmbSalary);

    }//end of JMSearchPanel constructor
    
}//end of class