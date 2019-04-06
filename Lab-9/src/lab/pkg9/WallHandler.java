/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg9;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

/**
 *
 * @author jamesostmann
 */
public class WallHandler implements EventHandler<ActionEvent>{

    private Button one = new Button();
    private Button two = new Button();
    
    public WallHandler (MazeNode one, MazeNode two) {
        this.one = one;
        this.two = two;
                
        
    
    }
    
    @Override
    public void handle(ActionEvent event) {
        
        Button wall = (Button)event.getSource();
        
        if(wall == one) {
        
        } else if(wall == two) {
        
            System.out.println("hi");
        
        }
        
        
    }

   
    
}
