import java.util.Scanner;

public class Quiz {

    String question;
    String answerA;
    String answerB;
    String answerC;
    String answerD;
    String correctAnswer;

    Quiz(String question, String answerA, String answerB, String answerC, String answerD, String correctAnswer) {
        this.question = question;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
        this.correctAnswer = correctAnswer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        Quiz quiz1 = new Quiz("What is the SI unit of force?", "force", "distance", "newton", "gravity", "c");
        Quiz quiz2 = new Quiz("What file extension does a compiled Java bytecode file have?", ".java", ".cpp", ".txt", ".class", "d");

        Quiz[] exam = {quiz1, quiz2}; // Clean array initializer syntax from your slides!

        for (Quiz quiz : exam) {
            System.out.println("\n" + quiz.question);
            System.out.println("A. " + quiz.answerA);
            System.out.println("B. " + quiz.answerB);
            System.out.println("C. " + quiz.answerC);
            System.out.println("D. " + quiz.answerD); 
            
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();

            if (answer.equalsIgnoreCase(quiz.correctAnswer)) {
                System.out.println("Correct! You got the answer.");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer was option " + quiz.correctAnswer.toUpperCase() + ".");
            }
        }

        System.out.println("\n--- Quiz Finished ---");
        System.out.println("Your final score: " + score + " out of " + exam.length);

        scanner.close();
    }
}