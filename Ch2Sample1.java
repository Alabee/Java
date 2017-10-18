import javax.swing.*;
public class Ch2Sample1 {
    public static void main(String []args){
        JFrame output;
        output = new JFrame();
        
        output.setSize(300, 200);
        output.setTitle("First java program");
        output.setVisible(true);
        JOptionPane.showMessageDialog(output, "Dialog box working");
        
        
    }
}
