import java.util.Random;
import  java.util.Date;


public class Times {
    public static void main(String[] args) {

        Date date = new Date();

        System.out.println(date.toString());

        Random random1 = new Random(3);
        System.out.println("From random1");

        for (int i = 0; i < 10; i++) {
            System.out.println(random1.nextInt(1000));
        }

        Random random2 = new Random(3);
        System.out.println("From random2");

        for (int i = 0; i < 10; i++) {
            System.out.println(random2.nextInt(1000));
        }

        final double pi = Math.PI;
        System.out.println(pi);

    }
}