package midexam;

import javax.swing.JOptionPane;

//import  java.util.StringTokenizer;
public class RandomShuffling {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("enter you'r age");
        int age = Integer.parseInt(input);
        int number = age + 5;
        JOptionPane.showMessageDialog(null, number);

        // char[] charArray = { 'G', 'o', 'o', 'd' };

        // String message = new String("this is the best, day of my life");
        // System.out.println(message);
        // int[] array = { 1, 2, 3, 4, 5 };

        // StringTokenizer st = new StringTokenizer(message, ",");

        // while (st.hasMoreTokens()) {
        // System.out.println(st.nextToken());
        // }

        // StringBuffer sb = new StringBuffer(message);

        // sb.append(" ever");
        // System.out.println(sb);

        // StringBuilder sb1 = new StringBuilder(message);
        // sb1.append(" nothing gonna stop me") ;
        // System.out.println(sb1);
        // for(int i = array.length -1; i >= 0; i--){
        // int j = (int) (Math.random() * array.length);
        // int temp = array[i];
        // array[i] = array[j];
        // array[j] = temp;
        // System.out.println(array[i]);
        // }
        // System.out.println();
        // for (int i : array) {
        // System.out.println(i);
        // }
    }
}
