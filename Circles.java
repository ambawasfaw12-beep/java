public class Circles {
    int radius;

    Circles() {
        radius = 1;
    }

    Circles(int radius) {
        this.radius = radius;
    }

    public double getArae() {
        double arae;
        return arae = Math.PI * Math.pow(radius, 2);
    }

    public void getRadius(){
       System.out.println(radius);
    }
}
