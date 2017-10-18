/*
 * ESTHER WAMBUI MAINA
 * CT202/0004/16
 */
package learn_java;

import javax.swing.*;

public class esthercalc {
   /**
     *
     * @param args
     */
    public static void main(String[] args){
        double loanamount, period, rate;
        double annualinterest,monthlyinterest, monthlyrate, months;
    //Obtaining user input
    loanamount = new Double(JOptionPane.showInputDialog("Enter the loanamount"));
    period = new Double(JOptionPane.showInputDialog("Enter the period in years"));
    rate = new Double(JOptionPane.showInputDialog("Enter the annual interesst rate"));
    
    //calculations
    rate = rate/100;
    months = period/12;
    monthlyrate = rate/12;

    annualinterest = loanamount*rate*period;
    monthlyinterest = annualinterest/12;
    
    //Output
    JOptionPane.showMessageDialog(null, "The annual interest rate is:" + annualinterest);
    JOptionPane.showMessageDialog(null,"The monthly interest rate is:" + monthlyinterest);
    }
}
