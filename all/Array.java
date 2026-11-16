import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number" + (i + 1) + ':');
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == 17) {
                    System.out.println("one" + numbers[i] + "other" + numbers[j]);
                }
            }
        }
        input.close();
    }
}