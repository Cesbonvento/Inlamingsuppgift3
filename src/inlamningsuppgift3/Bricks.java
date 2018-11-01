/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inlamningsuppgift3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*; 
import java.util.*;

/**
 *
 * @author Bazgir
 */
public class Bricks extends JPanel implements ActionListener 
{

    List<JButton> bricks;
    JButton brick; 
    public Bricks()
    { 
        setLayout(new GridLayout(4,4)); 
        
        bricks = new ArrayList<>(16);        //Ska endast innehålla setxon knappar etc. 
        for (int i=1; i<16; i++){
           brick = new JButton(String.valueOf(i)); 
           brick.setHorizontalAlignment(JButton.CENTER); 
           brick.setBackground(Color.red);
           bricks.add(brick); 
           brick.addActionListener(this);  
           brick.setOpaque(true);
           
        }  
        
        JButton blankBrick = new JButton("");
        blankBrick.addActionListener(this);
        bricks.add(blankBrick);  
        
        newGame();
     
    }  

    public void newGame(){ 
        Collections.shuffle(bricks); 
        bricks.forEach((brick) -> {
            add(brick);
        });  
        }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        

    
}
