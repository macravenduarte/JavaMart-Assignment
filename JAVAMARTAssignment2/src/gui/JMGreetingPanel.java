package gui;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Marco Duarte
 */
public class JMGreetingPanel extends JPanel
{
    private final JLabel greeting;
    
    public JMGreetingPanel ()
    {
        greeting = new JLabel ("Welcome  to  Javamart");
        greeting.setFont ( new Font ("Arial", Font.PLAIN, 30) );
        add(greeting);
        
        //create a raised bevel border
        setBorder ( BorderFactory.createRaisedBevelBorder() );
    }
}
