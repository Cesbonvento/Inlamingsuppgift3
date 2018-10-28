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

    JButton[] button = new JButton[16];
    JButton nyttSpel = new JButton("Nytt spel"); 
    JLabel spel = new JLabel("Välkommen till 15-spel!");
    Inlamningsuppgift3()
    {
        JFrame jrf = new JFrame("This is a 15-puzzle game"); 
        jrf.setLayout(new GridLayout(4,4));
        //jrf.add(spel);
        
        for (int i=1; i<16; i++){
            button[i] = new JButton(String.valueOf(i)); 
            jrf.add(button[i]);
        }
        jrf.add(button[0] = new JButton(" ")); 
        
       
        
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
