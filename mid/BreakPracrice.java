package mid;
public class BreakPracrice {
    public static void main(String[] args) {
        int x = 2;
        for (int y = 10; y < 30; y++) {
            if (y % x == 0)
                continue;
            else if (y == 20)
                break;
            else
                System.out.print(y + " ");

        }
    }
}
