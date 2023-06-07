//package final_project;

import javax.swing.JFrame;
import java.awt.Color;

public class Final_Project {

    public static void main(String[] args) 
    {        
        Registration_form d = new Registration_form();
        
        d.setVisible(true);
        d.setLocation(300,150);
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        d.setTitle("Registration Form");
        d.getContentPane().setBackground(Color.yellow);
        d.setLocationRelativeTo(null);
        
    }
    
}
