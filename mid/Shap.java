package mid;
public class Shap {

    public static void main(String[] args) {

        // int rows = 5;

        // for (int i = rows; i >= 0; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        char letter = 'A';

        for (int i = 0; i <= 6; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(letter + " ");
                letter++;
            }

            System.out.println();
        }

    }
}