import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double average;

        int[] arrays = new int[3];

        for (int i = 0; i < arrays.length; i++) {
            System.out.print("Enter numbers");
            arrays[i] = input.nextInt();
        }

        System.out.println("average of number you intered");
        for (int array : arrays) {
            average = (array + array + array) / 3;
        }

       // System.out.println(average);
    }
}