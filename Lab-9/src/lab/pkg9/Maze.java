/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;

/**
 *
 * @author jamesostmann
 */
public class Maze extends GridPane implements EventHandler<ActionEvent> {

    private MazeNode[][] mazeNodes;
    private int height;
    private int width;

    public Maze(int height, int width) {
        
        mazeNodes = new MazeNode[height][width];
        this.setHgap(5.0);
        this.setVgap(5.0);
        this.setPadding(new Insets(20, 20, 20, 20));
        this.height = height;
        this.width = width;
        setStyle("-fx-background-color: white");

        this.addMazeNodes();

    }

    private void addMazeNodes() {

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {

                if (onEdge(y, x)) {

                    createEdgeNode(y, x);

                } else {

                    createRegularNode(y, x);

                }

            }
        }

    }

    private void createEdgeNode(int y, int x) {
        MazeNode temp = new EdgeNode(Window.HEIGHT / height, Window.WIDTH / width);
        temp.setOnAction(this);
        mazeNodes[y][x] = temp;
        this.add(temp, x, y);
    }

    private void createRegularNode(int y, int x) {
        MazeNode temp = new MazeNode(Window.HEIGHT / height, Window.WIDTH / width);
        temp.setOnAction(this);
        mazeNodes[y][x] = temp;
        this.add(temp, x, y);
        
    }

    private boolean onEdge(int y, int x) {

        return y == 0 || y == height - 1 || x == 0 || x == width - 1;

    }

    @Override
    public String toString() {

        String result = "";

        for (MazeNode nodeArray[] : mazeNodes) {

            for (MazeNode node : nodeArray) {

                result += node.toString();

            }

            result += System.lineSeparator();

        }
        return result;
    }
    
    public void saveData(String s) {
    
       try {
           PrintWriter out = new PrintWriter(new File(s));
           out.println(this);
           out.close();
       
       } catch(FileNotFoundException e) {
       
           System.err.println("file not found");
           System.exit(0);
       }
    
    }

    // ArrayList<Maze> mazes
    // ArrayList<>
    
    @Override
    public void handle(ActionEvent event) {

        MazeNode n = (MazeNode)event.getSource();

        if (n instanceof EdgeNode) {

            n = (EdgeNode)n;
            
            switch (n.getNodeValue()) {
                
                case '0':
                    n.setColor("Red");
                    n.setNodeValue('E');
                    break;
                    
                case 'E':
                    n.setColor("Green");
                    n.setNodeValue('S');
                    break;
                    
                case 'S':
                    n.setColor("orange");
                    n.setNodeValue('0');
                    break;
            }

        } else {

            switch(n.getNodeValue()) {
                
                case '0':
                    n.setColor("grey");
                    n.setNodeValue('1');
                    break;
                    
                case '1':
                    n.setColor("orange");
                    n.setNodeValue('0');
                    break;
            
            }
            
            
            
           
            
        }
        
        System.out.println(this);
    }
}
