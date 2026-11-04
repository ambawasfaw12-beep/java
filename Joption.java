import javax.swing.JOptionPane;

public class Joption {
//this is a program that use grapical input option JOptionPane
    public static void main(String[] args) {

        String input1 = JOptionPane.showInputDialog("Enter Your name?");
//converthing one from one form to other 
        double age1 = Double.parseDouble(input1);

        String input2 = JOptionPane.showInputDialog("Enter Your name?");

        double age2 = Double.parseDouble(input2);

        double sum = age1 + age2; 

        JOptionPane.showMessageDialog(null, sum);

    }
}