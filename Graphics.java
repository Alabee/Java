package learn_java;
import javax.swing.*;
import java.awt.Color;
public class Graphics extends JPanel
{
    public void paintComponent(Graphics grx)
    {
        super.paintComponent(grx);
        
        grx.setColor(Color.RED);
        
    }
    public static void main(String[] args)
    {
        Graphics shape = new Graphics();
        JFrame jf = new JFrame();
        
        jf.setTitle("Screen_saver");
        jf.setSize(500, 400);
        jf.setVisible(true);
        jf.setLocation(300,200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(shape);
        
    }
}
