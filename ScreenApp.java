/*LEONARD MWANGI MUIGO
/*CT202/0041/16
*/
package learn_java;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.Scanner;
import javax.swing.*;

public class ScreenApp extends JFrame implements Runnable
{
     int i = 0;
     Image offscreenImage;
     Graphics offscr;
     Thread t;
     Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
     String motion, shape, sColor;

   public ScreenApp(String motion, String shape, String color)
   {        
       super(" SCREEN SAVER");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setSize(screenSize.width,screenSize.height-30);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.sColor = color;
       this.motion =  motion;
       this.shape = shape;
       t = new Thread(this);
       t.start();
   }

   public void run()
   {
     while(true)
     {
        i = i+10;
        try
        {
          t.sleep(250);     
        }
        catch(InterruptedException ie)
        {}
        repaint();
    }
   }
   
   public void paint(Graphics g)
   {
       offscreenImage = this.createImage(screenSize.width, screenSize.height);
       offscr = offscreenImage.getGraphics();
       if(sColor.equals("1")){
            offscr.setColor(Color.black); 
       }
       else if(sColor.equals("2")){
            offscr.setColor(Color.red);
        }
       
       else{
            offscr.setColor(Color.gray);
        }
       switch(motion){
           case "1":
               if(shape.equals("1")){
                   offscr.fillRect(100, (screenSize.height/2), 100, 150);
                   
               }else if(shape.equals("2")){
                   offscr.fillOval(100, (screenSize.height/2), 100, 150);
               }
               break;
           case "2":
               if(shape.equals("1")){
                   offscr.fillRect(2+i, (screenSize.height/2), 100, 150);
               }else if(shape.equals("2")){
                   offscr.fillOval(2+i, (screenSize.height/2), 100, 150);
               }
               break;
           case "3":
               Random gen = new Random();
               if(shape.equals("1")){
                   offscr.fillRect(gen.nextInt(screenSize.width-20), gen.nextInt(screenSize.height-20), 100, 150);
               }else if(shape.equals("2")){
                   offscr.fillOval(gen.nextInt(screenSize.width-20), gen.nextInt(screenSize.height-20), 100, 150);
               }
               break;
       }
g.drawImage(offscreenImage, 0, 0, this);
       offscr.dispose();
       if(i > this.size().width)
           i=0;
   }

   public void update(Graphics g)
   {
         paint(g);
   }
   
   public static void main(String args[])
   {
       String shape = JOptionPane.showInputDialog("Choose Shape: \n1. Rectangle \n2. Ellipse\n",null);
       String color = JOptionPane.showInputDialog("Choose color: \n1. Black \n2. Red \n3. GRAY \n",null);
       String motion = JOptionPane.showInputDialog("Choose motion: "
               + "\n1. Stationery \n2. Smooth \n3. Random\n",null);
       ScreenSaverApp app = new ScreenSaverApp(motion,shape,color);
       app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
   }
}
