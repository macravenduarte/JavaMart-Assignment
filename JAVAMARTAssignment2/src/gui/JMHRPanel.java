package gui;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Marco Duarte
 */
public class JMHRPanel extends JPanel
{
//components
    //labels
    private final JLabel    lblFirstName, lblLastName, lblAge, 
                            lblPosition, lblHireYear, lblHireMonth, 
                            DateOfHireJLabel, lblCommissionRate;
    
    //text fields
    private final JTextField    txtFirstName, txtLastName, 
                                txtAge, txtCommissionRate;
    
    //buttons
    private ButtonGroup bg;
    private final JRadioButton RDBGenderMale, RDBGenderFemale;
    
    //dropdown lists
    private final JComboBox<String> cmbYear, cmbMonth, cmbDay, cmbPosition;
    
    private static final String[] 
            year = {"2014", "2015", "2016" },
            month = {"Jan", "Feb", "Mar", "Apr", "May", "Aug", "Sept", "Oct",
                "Nov", "Dec"},
            day = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11",
                "12", "13", "14", "15", "16", "17", "18", "19", "20", "21",
                "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"},
            position = {"sales", "admin", "manager", "supervisor"};       
    
    //constructor
    public JMHRPanel()
    {
        //set layout
        setLayout (new GridLayout(5,2) );
        
        //labels
        lblFirstName = new JLabel ("FirstName");
        lblLastName = new JLabel ("LastName");
        lblAge = new JLabel ("Age");
        lblPosition = new JLabel ("Position");
        lblHireYear = new JLabel ("HireYear");
        lblHireMonth = new JLabel ("HireMonth");
        DateOfHireJLabel = new JLabel ("DateOfHire");
        lblCommissionRate = new JLabel ("CommissionRate");
        
        //text fields
        txtFirstName = new JTextField (15);
        txtLastName = new JTextField (15);
        txtAge = new JTextField (2);
        txtCommissionRate = new JTextField (15);
        
        //radioButtons
        RDBGenderMale = new JRadioButton ("Male");
        RDBGenderFemale = new JRadioButton ("Female");
        bg = new ButtonGroup();
        bg.add(RDBGenderMale);
        bg.add(RDBGenderFemale);
        
        //comboboxes
        cmbYear = new JComboBox<>(year);
        cmbMonth = new JComboBox<>(month);
        cmbDay = new JComboBox<>(day);
        cmbPosition = new JComboBox<>(position);
        
        //border
        setBorder(BorderFactory.createTitledBorder("Employee Information"));
        //first name
        add(lblFirstName);
        add(txtFirstName);
        //last name
        add(lblLastName);
        add(txtLastName);
        //age
        add(lblAge);
        add(txtAge);
        //gender radio buttons
        add(RDBGenderMale);
        add(RDBGenderFemale);
        //hire dates combo box 
        add(lblHireYear);
        add(cmbYear);
        add(lblHireMonth);
        add(cmbMonth);
        add(DateOfHireJLabel);
        add(cmbDay);
        //plus position
        add(lblPosition);
        add(cmbPosition);
        //commission
        add(lblCommissionRate);
        add(txtCommissionRate);       
        
    }
}