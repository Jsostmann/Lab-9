/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg9;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

/**
 *
 * @author jamesostmann
 */
public class Menu extends HBox {
    
    private Button save;
    private Button exit;
    
    public Menu () {
      
       
        save = new Button("Save");
        exit = new Button("Exit");
        
        this.setPadding(new Insets(10,0,10,0));
        this.setAlignment(Pos.CENTER);
        this.setSpacing(5);
        this.getChildren().add(save);
        this.getChildren().add(exit);
        this.requestFocus();
        
    
    }
    
    public Button getSaveButton(){
    
        return this.save;
    }
    
    public Button getExitButton() {
    
        return this.exit;
    
    }
    
}
