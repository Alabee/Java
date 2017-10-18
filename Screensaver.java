package learn_java;
import javax.swing.*;
import java.awt.*;
class Screensaver {
    public void paintComponent(Graphics grx){
        //super.paintComponent(grx);
        
        grx.setColor(Color.RED);
        grx.drawRect(0, 0, 50, 50);
    }
    public static void main(String[] args){
        JFrame window;
       // Container contentPane;
        Screensaver grx;
        
        window = new JFrame("Screen_saver");
        window.setSize(400, 500);
        window.setLocation(300, 200);
        window.setVisible(true);
        
        /*
        contentPane = window.getContentPane();
        grx = contentPane.getGraphics();
        grx.drawRect(50, 50, 100, 40);
        grx.drawOval(10, 10, 50, 50);
        */
        
        window.add(grx);
        
    }
    
}
