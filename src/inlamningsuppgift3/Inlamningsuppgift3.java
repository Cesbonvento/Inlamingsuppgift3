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

    JFrame jrf = new JFrame("This is a 15-puzzle game");  
    JButton[] button = new JButton[16];
    JButton nyttSpel = new JButton("Nytt spel"); 
    JPanel panel1 = new JPanel(); 
    JPanel panel2 = new JPanel();
    Inlamningsuppgift3()
    { 
        jrf.add(panel1, BorderLayout.CENTER);
        jrf.add(panel2, BorderLayout.SOUTH);
        panel1.setLayout(new GridLayout(4,4));  
        panel2.add(nyttSpel);  
        jrf.setLocation(100, 100); 
        jrf.setSize(800, 600); 
        jrf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jrf.setVisible(true); 
        
        for (int i=1; i<16; i++){
            button[i] = new JButton(String.valueOf(i)); 
            panel1.add(button[i]);
        } 
        panel1.add(button[0] = new JButton(" "));
        
        
    }
    
    public static void main(String[] args) {
        //Feature branch 
        Inlamningsuppgift3 uppgift3 = new Inlamningsuppgift3(); 
    }
    
}
