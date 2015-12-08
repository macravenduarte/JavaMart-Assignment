package gui;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Marco Duarte
 */
public class JMProductsPanel extends JPanel
{
//components
    //labels
    private final JLabel    lblProductName, lblProductCategory,
                            lblProductDescription, lblProductPartNum,
                            lblProductCost, lblProductPrice; 
    //text fields
    private final JTextField    txtProductName, txtProductCategory,
                                txtProductDescription, txtProductPartNum,
                                txtProductCost ,txtProductPrice;
    
    
    //constructor
    public JMProductsPanel()
    {
        //set the layout
        setLayout (new GridLayout(5,2));
        
        //create the labels with strings for names in parenthesis
        lblProductName = new JLabel("ProductName");
        lblProductCategory = new JLabel("ProductCategory");
        lblProductDescription = new JLabel("ProductDescription"); 
        lblProductPartNum = new JLabel("ProductPartNum");
        lblProductCost = new JLabel("ProductCost"); 
        lblProductPrice = new JLabel("ProductPrice");
        
        //create the text fields with integers for their size in placeholders
        txtProductName = new JTextField (15);
        txtProductCategory = new JTextField (15);
        txtProductDescription = new JTextField (15);
        txtProductPartNum = new JTextField (15);
        txtProductCost = new JTextField (15);
        txtProductPrice = new JTextField (15);
        
        //set the border and add the labels with matching textfields
        //add product name
        add(lblProductName);
        add(txtProductName);
        //add product category
        add(lblProductCategory);
        add(txtProductCategory);
        //add product description
        add(lblProductDescription);
        add(txtProductDescription);
        //add product partnumber
        add(lblProductPartNum);
        add(txtProductPartNum);
        //add product cost
        add(lblProductCost);
        add(txtProductCost);
        //add product price
        add(lblProductPrice);
        add(txtProductPrice);
        
    }
}
