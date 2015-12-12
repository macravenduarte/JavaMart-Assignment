package gui;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Marco Duarte
 */
public class JMHRPanel extends JPanel
{
//component variables
    //labels
    private final JLabel    lblFirstName, lblLastName, lblAge, 
                            lblPosition, lblHireYear, lblHireMonth, 
                            DateOfHireJLabel;
    
    //text fields
    private final JTextField    txtFirstName, txtLastName, 
                                txtAge;
    
    //buttons
    private ButtonGroup bg;
    private final JRadioButton RDBGenderMale, RDBGenderFemale;
    
    //dropdown lists
    private final JComboBox<String> cmbYear, cmbMonth, cmbDay, cmbPosition;
    
    private static final String[] 
            year = {"2014", "2015", "2016" },
            month = {   "Jan", "Feb", "Mar", "Apr",
                        "May", "June", "July", "Aug",
                        "Sept", "Oct", "Nov", "Dec"},
            day = { "1", "2", "3", "4", "5",
                    "6", "7", "8", "9", "10", 
                    "11", "12", "13", "14", "15",
                    "16", "17", "18", "19", "20",
                    "21", "22", "23", "24", "25",
                    "26", "27", "28", "29", "30", 
                    "31"},
            position = {"Full-time", "Part-time", "Seasonal"};       
//end of component variables
    //constructor
    public JMHRPanel()
    {
        //set layout
        setLayout (new GridLayout(5,1) );
        
        //labels
        lblFirstName = new JLabel ("First Name");
        lblLastName = new JLabel ("Last Name");
        lblAge = new JLabel ("Age");
        lblPosition = new JLabel ("Position");
        lblHireYear = new JLabel ("Hire Year");
        lblHireMonth = new JLabel ("Hire Month");
        DateOfHireJLabel = new JLabel ("Date Of Hire");
        
        //text fields
        txtFirstName = new JTextField (10);
        txtLastName = new JTextField (10);
        txtAge = new JTextField (2);
        
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
        
    }//end of JMHRPanel constructor
}//end of class