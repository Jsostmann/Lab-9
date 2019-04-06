/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg9;

import javafx.event.ActionEvent;

/**
 *
 * @author jamesostmann
 */
public class EdgeNode extends MazeNode {
    
    
    public EdgeNode() {
        
      this(0,0);
    
    }
    
    public EdgeNode(int width, int height) {
    
        super(width,height);
        this.setNodeValue('0');
        //this.setOnAction(this);
        this.setColor("orange");
    }
    
    
   /* 
    @Override
    public void handle(ActionEvent event) {
        
        EdgeNode n = (EdgeNode) event.getSource();
        
           if(n.getNodeValue() == '0') {
              
            setColor("Red");
            this.setNodeValue('E');
            
            
        } else if(n.getNodeValue() == 'E') {
        
            setColor("Green");
            this.setNodeValue('S');
        
        } else {
        
           setColor("orange");
           this.setNodeValue('0');
        
        }
        
        
    }

*/
}
