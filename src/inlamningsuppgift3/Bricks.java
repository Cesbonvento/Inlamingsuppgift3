/*
    Master branch
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
        
        bricks = new ArrayList<>(16);                                           //Ska endast innehålla setxon knappar etc. 
        for (int i=1; i<16; i++){
           brick = new JButton(String.valueOf(i)); 
           brick.setFont(new Font("",Font.BOLD, 25));
           brick.setForeground(Color.BLACK);                                    //Gör texten svart, "Svartare"
           brick.setBackground(Color.decode("#FF5B42"));
           bricks.add(brick); 
           brick.addActionListener(this);  
           
        }  
        
        JButton blankBrick = new JButton(" ");
        blankBrick.setFont(new Font("",Font.BOLD, 25));
        blankBrick.setForeground(Color.BLACK);
        blankBrick.setBackground(Color.BLACK); 
        blankBrick.addActionListener(this);
        bricks.add(blankBrick);  
        
        newGame();
     
    }  

    public void newGame(){ 
        Collections.shuffle(bricks); 
        bricks.forEach((brick) -> {
            add(brick);
        });
            revalidate();                                                        //Med revalidate så kan man uppdatera bräddan med nya slumpade brickor
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
        
        /**
         * Checks the position if you have won
         */
        for(int i = 0; i < bricks.size(); i++)
        {
            if(bricks.get(i).getText().equals(" "))
            {
                emptyIndex = i;
            } 
            
            else if(bricks.get(i).getText().equals(brick.getText()))
            { 
                currentIndex = i; 
                left = currentIndex - 1;
                right = currentIndex + 1; 
                top = currentIndex - 4;                                         //Eftersom det är en skillnad på 4 index mellan top och ens nuvarande position
                bottom = currentIndex + 4;
            }
            
            /**
             * De två satserna nedan förhindrar att spelaren ska kunna förflytta
             * sig vänster eller höger om den tomma brickan befinner sig på 
             * antingen första berickan på ny rad eller sista. Utan man ska endast 
             * kunna förflytta sig upp eller ner.
             *  
             */
            
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
            blankBrick.setBackground(Color.decode("#FF5B42"));
            blankBrick.setText(brick.getText());
            brick.setText(" "); 
            brick.setBackground(Color.BLACK);
           
        } 
        
        /**
         * Checks if you have won
         */
        boolean won = false; 
        String allBrickNumbers = " "; 
        allBrickNumbers = bricks.stream().map((b) -> b.getText()).reduce(allBrickNumbers, String::concat);
      
        if (allBrickNumbers.equals("123456789101112131415 ")) 
        {
            JOptionPane.showMessageDialog(null, "Grattis du vann!!");
            won = true;
        } else {
            won = false;
        }
        
    }
        

    
}
