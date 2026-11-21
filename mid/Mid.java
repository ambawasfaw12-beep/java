package mid;
public class Mid {
    private static int n = 4;

    Mid() {
        this("this is: med");
        System.out.println("date:today");
    }

    Mid(String msg) {
        System.out.println(msg);
        System.out.println("dep: swe");
    }

    public static void main(String[] argos) {
        int n = 10;
        System.out.println(Mid.n);
        System.out.println(n);

        Mid x = new Mid();
        Mid sd[] = new Mid[1];
        sd[0] = new Mid();
    }
}