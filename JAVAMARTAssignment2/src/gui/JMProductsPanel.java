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
                            lblProductCost, lblProductPrice, lblProductManu; 
    //text fields
    private final JTextField    txtProductName, txtProductCategory,
                                txtProductDescription, txtProductPartNum,
                                txtProductCost ,txtProductPrice, txtProductManu;
    
    //constructor
    public JMProductsPanel()
    {
        //set the layout
        setLayout (new GridLayout(8,2));
        
        //create the labels with matching text fields with strings for names in parenthesis
        lblProductName = new JLabel("ProductName");
        txtProductName = new JTextField (5);
        
        lblProductCategory = new JLabel("ProductCategory");
        txtProductCategory = new JTextField (5);
        
        lblProductDescription = new JLabel("ProductDescription");
        txtProductDescription = new JTextField (5);
        
        lblProductPartNum = new JLabel("ProductPartNum");
        txtProductPartNum = new JTextField (5);
        
        lblProductCost = new JLabel("ProductCost"); 
        txtProductCost = new JTextField (5);
        
        lblProductPrice = new JLabel("ProductPrice");
        txtProductPrice = new JTextField (5);
        
        lblProductManu = new JLabel("Manufacturer");
        txtProductManu = new JTextField (5);

        //set the border and add the labels with matching textfields
        setBorder(BorderFactory.createTitledBorder("Product Information"));
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
        //add product manufacturer
        add(lblProductManu);
        add(txtProductManu);      
       
    }
}
