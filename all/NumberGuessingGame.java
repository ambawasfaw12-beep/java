import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        System.out.println("Guess the number between 1 and 10");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int generatedNumber = random.nextInt(1, 11); // Generates 1 to 10

        System.out.print("Type 'start' to begin: ");
        String play = scanner.next();

        if (play.equalsIgnoreCase("start")) {
            System.out.println("Game Started!");
            playGame(generatedNumber, scanner);
        } else {
            System.out.println("Exiting game. Goodbye!");
        }
        
        scanner.close();
    }

    static void playGame(int generatedNumber, Scanner scanner) {
        int userGuess = 0;
        int guessCount = 0;

        while (userGuess != generatedNumber) {
            if (guessCount == 0) {
                System.out.print("Enter your guess: ");
            } else {
                System.out.print("Try again! You didn't get it that time: ");
            }
            
            userGuess = scanner.nextInt();
            guessCount++;
        }

        System.out.println("Correct! The number was " + generatedNumber + 
                           ". It took you " + guessCount + " guess(es) to get the number.");
    }
}