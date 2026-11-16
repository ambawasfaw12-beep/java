import java.util.Scanner;

public class Ifelse {

    public static void main(String[] args) {
        int age;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter your age");
            age = input.nextInt();

            if (age < 13) {
                System.out.println("Child");
            } else if (age >= 13 && age < 18) {
                System.out.println("Teenager");
            } else {
                System.out.println("Adult");
            }

        }
        input.close();
    }

}
