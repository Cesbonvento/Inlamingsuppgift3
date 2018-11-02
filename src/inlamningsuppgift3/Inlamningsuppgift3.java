/*
    Master branch
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
public class Inlamningsuppgift3 extends JFrame{

    JFrame jrf = new JFrame("This is a 15-puzzle game");   
    Bricks puzzle = new Bricks();
    JButton newGame = new JButton("Nytt spel"); 
    Inlamningsuppgift3()
    { 
        jrf.setLayout(new BorderLayout()); 
        jrf.add(puzzle);
        jrf.add(newGame, BorderLayout.SOUTH); 
        
        jrf.pack();
        jrf.setLocation(100, 100); 
        jrf.setSize(700, 700); 
        jrf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jrf.setVisible(true); 
    
        newGame.addActionListener((ActionEvent ae) -> { 
            puzzle.newGame();
         });
    }  
        
    public static void main(String[] args) {
        //Feature branch 
        Inlamningsuppgift3 uppgift3 = new Inlamningsuppgift3(); 
    }


}
