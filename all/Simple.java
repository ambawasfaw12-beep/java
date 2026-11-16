public class Simple {
    public static void main(String[] args) {
        Circles circles = new Circles();
        Circles circles2 = new Circles(5);

       double arae = circles.getArae();
       System.out.println(arae);
       circles.getRadius();
       double arae2 = circles2.getArae();
       System.out.println(arae2);
       circles2.getRadius();

    }
}
