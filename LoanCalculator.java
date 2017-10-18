//Leonard Mwangi Muigo
//CT202/0041/16
//BCT
package learn_java;
import javax.swing.*;
public class LoanCalculator {
    public static void main(String[] args){
        float loan_amt, rate, period, amount, interest, monthly_rate, monthly_payment;
        
        String input_amount = JOptionPane.showInputDialog(null, "Enter the loan amount: ");
        loan_amt = Float.parseFloat(input_amount);
        
        String input_rate = JOptionPane.showInputDialog(null, "Enter the percentage of the rate: ");
        rate = Float.parseFloat(input_rate);
        
        String input_period = JOptionPane.showInputDialog(null, "Enter the period in years: ");
        period = Float.parseFloat(input_period);
        
        interest = loan_amt * rate/100 * period;
        amount = loan_amt + interest;
        monthly_rate = rate/12;
        monthly_payment = amount/12;
        
        JOptionPane.showMessageDialog(null, "The amount to be returned is: " + amount + "\nThe monthly rate is: " + monthly_rate + "\nMonthly payments: " + monthly_payment );
    }
    
}
