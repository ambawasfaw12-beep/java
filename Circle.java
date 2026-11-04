public class Circle {

    int radious;

    public Circle() {

    }

    public Circle(int r) {
        radious = r;
    }

    public double getAreat() {
        double area = Math.PI * radious * radious;
        return area;
    }

    public double getCircumferance() {
        double circumferance = 2 * Math.PI * radious;
        return circumferance;
    }

    public static void main(String[] args) {

        Circle circle1 = new Circle();
        Circle circle2 = new Circle(10);

        System.out.println("the radious of the circle1 " + circle1.radious);
        System.out.println("the radious of the circle2 " + circle2.radious);

        // working with method

        System.out.println("finding area of circle1" + circle1.getAreat());
        System.out.println("finding area of circle2" + circle2.getAreat());

        System.out.println("finding circumferance of circle1" + circle1.getCircumferance());
        System.out.println("finding circumferance of circle1" + circle2.getCircumferance());

    }

}
