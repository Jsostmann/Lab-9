/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg9;


import java.io.File;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author jamesostmann
 */
public class Window extends Application implements EventHandler <ActionEvent> {

    public static final int HEIGHT = 750;
    public static final int WIDTH = 750;
    private Maze maze;
    private Menu menu;
 
    @Override
    public void start(Stage stage) throws Exception{
        
        
       maze = new Maze(5,5);
        
       menu = new Menu();
       
       menu.getExitButton().setOnAction(this);
       menu.getSaveButton().setOnAction(this);
        
        
        BorderPane root = new BorderPane();
        root.setCenter(maze);
        root.setBottom(menu);
        
        
        Scene scene = new Scene(root,HEIGHT,WIDTH);
        stage.setScene(scene);
        stage.setTitle("Maze");
        stage.show();
    
    }

    @Override
    public void handle(ActionEvent event) {
        
        Button b = (Button)event.getSource();
        
        if(b == menu.getExitButton()) {
           
            System.exit(0);
            
        } else if(b == menu.getSaveButton()) {
            
              FileChooser fileChooser = new FileChooser();
  
              File file = fileChooser.showSaveDialog(null);
              String fName = file.getName() + ".txt";
              
              
              maze.saveData(fName);
          
         
        }
        
        
    }
}
