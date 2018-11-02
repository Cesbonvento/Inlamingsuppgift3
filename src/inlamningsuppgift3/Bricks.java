/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inlamningsuppgift3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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
           brick.setFont(new Font("",Font.BOLD, 25));
           brick.setForeground(Color.BLACK);                                    //Gör texten svart, "Svartare"
           brick.setBackground(Color.decode("#FF5B42"));
           bricks.add(brick); 
           brick.addActionListener(this);  
           
        }  
        
        JButton blankBrick = new JButton("");
        blankBrick.setFont(new Font("",Font.BOLD, 25));
        blankBrick.setForeground(Color.BLACK);
        blankBrick.setBackground(Color.WHITE);
        blankBrick.addActionListener(this);
        bricks.add(blankBrick);  
        
        newGame();
     
    }  

    public void newGame(){ 
        Collections.shuffle(bricks); 
        bricks.forEach((brick) -> {
            add(brick);
        });
            revalidate();
        }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        brick = (JButton) ae.getSource();
        
        int emptyIndex = 0; 
        int currentIndex = 0; 
        int left = 0; 
        int right = 0; 
        int top = 0; 
        int bottom = 0; 
        
        for(int i = 0; i < bricks.size(); i++)
        {
            if(bricks.get(i).getText().equals(""))
            {
                emptyIndex = i;
            } 
            
            else if(bricks.get(i).getText().equals(brick.getText()))
            { 
                currentIndex = i; 
                left = currentIndex - 1;
                right = currentIndex + 1; 
                top = currentIndex - 4; 
                bottom = currentIndex + 4;
            }
            
            else if (bricks.get(3).getText().equals(brick.getText()) 
                    || bricks.get(7).getText().equals(brick.getText()) 
                    || bricks.get(11).getText().equals(brick.getText())) 
            {
                    right = currentIndex - 1;
            } 
            
            else if (bricks.get(4).getText().equals(brick.getText()) 
                    || bricks.get(8).getText().equals(brick.getText()) 
                    || bricks.get(12).getText().equals(brick.getText())) 
            {
                    left = currentIndex + 1;        
            }
        
        } 
        
        if (emptyIndex == left || emptyIndex == right || emptyIndex == top
                || emptyIndex == bottom) 
        {
            JButton blankBrick = bricks.get(emptyIndex);
            blankBrick.setText(brick.getText());
            brick.setText(""); 
           
        } 
        
        boolean wonNow = false; 
        String allNumbers = " "; 
        allNumbers = bricks.stream().map((b) -> b.getText()).reduce(allNumbers, String::concat);
      
        if (allNumbers.trim().equals("123456789101112131415")) 
        {
            JOptionPane.showMessageDialog(null, "Grattis du vann!!");
            wonNow = true;
        } else {
            wonNow = false;
        }
        
    }
        

    
}
