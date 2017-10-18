package learn_java;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;
public class Graphix extends JPanel
{
    public void paintComponent(Graphics grx)
    {
        super.paintComponent(grx);

        this.setBackground(Color.darkGray);
        
        grx.setColor(Color.BLUE);
        grx.fillRect(20, 20, 40, 30);
        
        grx.setColor(Color.BLUE);
        grx.drawString("Games", 20, 65);
        
        grx.setColor(Color.BLUE);
        grx.fillRect(50, 70, 40, 30);
        
        grx.setColor(Color.BLUE);
        grx.drawString("Gallery", 50, 115);
        
        grx.setColor(Color.BLUE);
        grx.fillRect(80, 120, 40, 30);
        
        grx.setColor(Color.BLUE);
        grx.drawString("Contacts", 80, 165);
        
    }
    public static void main(String[] args)
    {
        Graphix shape = new Graphix();
        JFrame jf = new JFrame();
        
        jf.setTitle("Screen_saver");
        jf.setSize(400, 300);
        jf.setVisible(true);
        jf.setLocation(300,200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(shape);
        
    }
}
