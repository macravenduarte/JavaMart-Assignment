package gui;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Marco Duarte
 */
public class JMEmpSearchPanel extends JPanel
{
//local variables for components
    //labels
    private final JLabel    lblSearchType, lblName,
                             lblPosition, lblSalary;
    
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
    public JMEmpSearchPanel()
    {
        setLayout ( new GridLayout(0,2) );
        
    //create 
        //labels
        lblSearchType = new JLabel ("Search Type");
        lblName = new JLabel ("Name");
        lblPosition = new JLabel ("Position");
        lblSalary = new JLabel ("Salary");
        //text field
        txtSearch = new JTextField (2);
        //text area
        txtResult = new JTextArea(4,4);
        //combobox
        cmbName = new JComboBox<>(name);
        cmbPosition = new JComboBox<>(position);
        cmbSalary = new JComboBox<>(salary);
        
        //border
        setBorder(BorderFactory.createTitledBorder("Employee Search") );
        
    //add
        //SearchType
        add(lblSearchType);
        add(txtSearch);
        //FirstName
        add(lblName);
        add(cmbName);
        //Position
        add(lblPosition);
        add(cmbPosition);
        //Salary
        add(lblSalary);
        add(cmbSalary);
        //text area
        add(txtResult);
    }//end of JMEmpSearchPanel constructor
    
}//end of class