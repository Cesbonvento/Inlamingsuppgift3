/*

 */
package inlamningsuppgift3;

import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Bazgir
 */
public class Inlamningsuppgift3 {

    int[] brickor = new int[16];
    JButton nyttSpel = new JButton("Nytt spel"); 
    JLabel spel = new JLabel("Välkommen till 15-spel!");
    Inlamningsuppgift3()
    {
        JFrame jrf = new JFrame("This is a 15-puzzle game"); 
        jrf.setLayout(new FlowLayout());
        jrf.add(spel);
        jrf.add(nyttSpel); 
        jrf.setLocation(100, 100); 
        jrf.setSize(800, 600); 
        jrf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jrf.setVisible(true);
        
        
    }
    
    public static void main(String[] args) {
        //Feature branch 
        Inlamningsuppgift3 uppgift3 = new Inlamningsuppgift3(); 
    }
    
}
