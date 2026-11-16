public class Classasigne {
    int radious;

    public static void main(String[] args) {
        Classasigne c1 = new Classasigne();
        System.out.println(c1.radious);

        Classasigne c2 = new Classasigne();
        c2 = c1;
        c2.radious = 10;

        System.out.println(c1.radious);
        System.out.println(c2.radious);

    }
}
