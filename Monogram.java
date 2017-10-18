import javax.swing.*;
public class Monogram {
    public static void main(String []args){
        //Ask for users input
        String name, space, first, middle, last, monogram;
        name = JOptionPane.showInputDialog(null, "Enter your three names: ");
        space = " ";
        
        first = name.substring(0, name.indexOf(space));
        name = name.substring(name.indexOf(space) + 1, name.length());
        middle = name.substring(0, name.indexOf(space));
        last = name.substring(name.indexOf(space) + 1, name.length());
        System.out.println(first);
        System.out.println(middle);
        System.out.println(last);
        
        monogram = first.substring(0, 1) + middle.substring(0, 1) + last.substring(0, 1);
        System.out.println(monogram);
        
        JOptionPane.showMessageDialog(null, monogram);
    }
}
