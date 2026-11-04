public class Encapsulations {

    // encapsulation this is the way that w secur the system using privet for
    // vaibales
    private int score = 0;

    public int getScore() {
        return score;
    }

    public void setScore(int newScore) {
        if (newScore >= 0) {
            score = newScore;
        }
    }

    public static void main(String[] args) {
        Encapsulations en = new Encapsulations();

        int score1 = en.getScore();
        System.out.println(score1);

        en.setScore(75);

        int score2 = en.getScore();
        System.out.println(score2);

    }
}
