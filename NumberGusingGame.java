import java.util.Scanner;
import java.util.Random;

public class NumberGusingGame {
    public static void main(String[] args) {

        System.out.println("Geuss the number btween 1 and 10");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int generatedNumber = (int) (random.nextInt(1, 11));
        String play = null;
        int target = 0;
        int guess = 0;

        System.out.print("Type start to start: ");
        play = scanner.next();

        if (play.equalsIgnoreCase("start")) {
            System.out.println("Started");
            playAgain(target, guess, generatedNumber, scanner);
        } else {
            System.out.println("Exiting game. Goodbye!");
        }
        scanner.close();
    }

    static void playAgain(int target, int guess, int generatedNumber, Scanner scanner) {
        while (target != generatedNumber) {
            if (guess == 0) {
                System.out.print("guess the numbers ");
                target = scanner.nextInt();
                guess++;
            } else {
                System.out.print("Try again you ddin't get in this time ");
                target = scanner.nextInt();
                guess++;
            }
        }

        System.out.println(
                "Right the number was " + '$' + target + " It took you " + '#' + guess + " Geuss to get the number");
    }
}