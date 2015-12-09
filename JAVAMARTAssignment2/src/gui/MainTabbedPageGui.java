package gui;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Marco Duarte
 */
public class MainTabbedPageGui extends JFrame
{
    private JPanel northPanel, southPanel;
    private JButton exitButton;
    
    public MainTabbedPageGui()
    {
        super("JavaMart");
        setLayout( new BorderLayout() );
       
        //add a tabs to the form
        JTabbedPane tabPane = new JTabbedPane();
        
        //Employee tab
        //tab1 label & panel
        JLabel lblPanelOne = 
                    new JLabel("Employees", SwingConstants.CENTER);
        JPanel hrPanel = new JMHRPanel();
        //add the employee tab to the panel
        hrPanel.add(lblPanelOne);
        tabPane.addTab("Employee Tab", null, 
                            hrPanel, "First Panel");
        
        //Products
        //tab2 label & panel
        JLabel lblPanelTwo = 
                    new JLabel("Products", SwingConstants.CENTER);
        JPanel productsPanel = new JMProductsPanel();
        //add the products tab to the panel
        productsPanel.add(lblPanelTwo);
        tabPane.addTab("Products Tab", null, 
                            productsPanel, "Second Panel");
        
        //Employee Search
        //tab3 label & panel
        JLabel lblPanelThree = 
                    new JLabel("Employee Search", SwingConstants.CENTER);
        JPanel empSearchPanel = new JMEmpSearchPanel();
        //add the employess search tab to the panel
        empSearchPanel.add(lblPanelThree);
        tabPane.addTab("Employee Search Tab", null, 
                            empSearchPanel, "Third Panel");

        //build the panels
        northPanel = new JMGreetingPanel();
        buildButtonPanel();
        
        add(northPanel, BorderLayout.NORTH);
        add(tabPane, BorderLayout.CENTER);
        add(southPanel, BorderLayout.SOUTH);
        
    }//end of constructor
    
    private void buildButtonPanel()
    {
        southPanel = new JPanel();
        exitButton = new JButton("Exit");
        exitButton.addActionListener( new  ExitButtonHandler() );
        
        southPanel.add(exitButton);
    }
    
    //exit button handler
    private class ExitButtonHandler implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            System.exit(0);
        }
    }

}//end of class
