import java.util.StringTokenizer;

public class Token {

    public static void main(String[] args) {

        String sentence = "this is the best, but it will be the worse day, of our lfe";

        StringTokenizer st = new StringTokenizer(sentence, ",");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }

    static int done(float age, int heigh) {
        int sum = 0;
        return sum;
    }

    static float done(int age, float heigh) {
        int sum = 0;
        return sum;
    }

}
