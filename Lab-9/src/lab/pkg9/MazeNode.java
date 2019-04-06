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
public class MazeNode extends Button /*implements EventHandler<ActionEvent> */{
    

    private char nodeValue;
    private String color;
    
    public MazeNode(int height, int width) {
       // setOnAction(this);
        nodeValue = '0';
        color = "orange";
        this.setPrefSize(height,width);
        setColor(color);
    
    }
    
    public MazeNode() {
        this(0,0);
    }
    
    public void setNodeValue(char value){
    
        this.nodeValue = value;
    
    }
   
    public char getNodeValue() {
        return this.nodeValue;
    }
    
    public void setColor(String color) {
       
       setStyle("-fx-background-color: " + color);
       this.color = color;
       
    }
    
    public String getColor() {
    
        return this.color;
    
    }
    
    @Override
    public String toString(){
    
        return this.nodeValue + " ";
    
    }
/*
    @Override
    public void handle(ActionEvent event) {
        
        MazeNode n = (MazeNode) event.getSource();
        
           if(n.nodeValue == '0') {
              
            setColor("grey");
            this.nodeValue = '1';
            
            
        } else {
        
            setColor("orange");
            this.nodeValue = '0';
        
        }
        
        
    }
    */
    
}
