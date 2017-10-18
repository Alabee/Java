/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn_java;

import javax.swing.*;
import java.util.*;
import java.awt.*;
/**
 *
 * @author Esther
 */
public class GeometricShapes extends JPanel{
    public static void main(String[]args){
        JFrame window;

        window = new JFrame();
        window.setSize(500,500);
        window.setLocation(0,0);
        window.setVisible(true);
        
         Container pane;
         //pane = new Container();
         pane = window.getContentPane();
                  pane = window.getContentPane();

         
         Graphics g;
         g = pane.getGraphics();
         g.setColor(Color.RED);
         g.drawRect(0, 0, 50, 50);
        
         
        
    }
    
}
