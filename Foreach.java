import java.util.Scanner;

public class Foreach {

    public static void main(String[] args) {
        Scanner sacanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // for (int input : numbers) {
        //     System.out.println("Enter the array element");
        //     input = sacanner.nextInt();
            
        // }
        
        System.out.println("The array element you enterd is:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        sacanner.close();
    }

}