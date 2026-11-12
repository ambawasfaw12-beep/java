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

        Quiz quiz1 = new Quiz("what is the siuni of force?", "force", "distance", "newton", "gravity", "c");
        Quiz quiz2 = new Quiz("what is the siuni of force?", "force", "distance", "newton", "gravity", "d");

        Quiz[] exam = new Quiz[2];
        exam[0] = quiz1;
        exam[1] = quiz2;

        for (Quiz quiz : exam) {
            String answer = null;
            System.out.println(quiz.question);
            System.out.println("A " + quiz.answerA);
            System.out.println("B " + quiz.answerB);
            System.out.println("C " + quiz.answerC);
            System.out.println("D " + quiz.answerD); 
            answer = scanner.nextLine();

            if (answer.equals(quiz.correctAnswer)) {
                System.out.println("Correct you got the answer");
            } else {
                System.out.println("try again");
            }

        }

        scanner.close();
    }
}
