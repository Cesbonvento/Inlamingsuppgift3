/*

 */
package inlamningsuppgift3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Bazgir
 */
public class Inlamningsuppgift3 extends JFrame implements ActionListener{

    JFrame jrf = new JFrame("This is a 15-puzzle game");   
    Bricks puzzle = new Bricks();
    JButton newGame = new JButton("Nytt spel"); 
    JPanel panel1 = new JPanel(); 
    JPanel panel2 = new JPanel();
    Inlamningsuppgift3()
    { 
        jrf.add(panel1, BorderLayout.CENTER);
        jrf.add(panel2, BorderLayout.SOUTH);
        jrf.setLayout(new FlowLayout()); 
        
        panel1.add(puzzle); 
        panel2.add(newGame);
        
        jrf.setLocation(100, 100); 
        jrf.setSize(500, 500); 
        jrf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jrf.setVisible(true); 
        
    } 
    
    
    public static void main(String[] args) {
        //Feature branch 
        Inlamningsuppgift3 uppgift3 = new Inlamningsuppgift3(); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
