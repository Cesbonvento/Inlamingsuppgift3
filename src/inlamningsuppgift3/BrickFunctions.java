/*
    Master branch
 */
package inlamningsuppgift3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.List;
import javax.swing.JButton;

/**
 *
 * @author Bazgir
 */
public class BrickFunctions extends Bricks implements ActionListener{
    
    public void newGame(){ 
        Bricks br = new Bricks(); 
        Collections.shuffle((List<?>) br); 
        bricks.forEach((brick) -> {
            add(brick);
        }); 
        
    }
    @Override
    public void actionPerformed(ActionEvent e){ 
        brick = (JButton) e.getSource(); 
        
    }
}
