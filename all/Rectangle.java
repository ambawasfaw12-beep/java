
public class Rectangle {

    double width;
    double height;

    Rectangle() {
    }

    Rectangle(double width, double height) {

        this.width = width;
        this.height = height;
    }

    void getArea() {
        double area;
        area = width * height;

        System.out.println(area);
    }

    void getParameter() {
        double parameter;
        parameter = 2 * (width + height);
        System.out.println(parameter);
    }

    void getdimentions() {
        System.out.println("Width:" + width + "Height:" + height);

    }

    void setdimetions(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();

        System.out.println(rectangle1.width);
        System.out.println(rectangle1.height);
        System.out.print("area form the default for reactangle1");
        rectangle1.getArea();
        rectangle1.getParameter();
        rectangle1.getdimentions();
        rectangle1.setdimetions(10, 5);
        rectangle1.getdimentions();
        System.out.print("area form new dimenthion");
        rectangle1.getArea();

        Rectangle rectangle2 = new Rectangle(6, 5);
        System.out.println(rectangle2.width);
        System.out.println(rectangle2.height);
        System.out.print("area form the default for reactangle2");
        rectangle2.getArea();
        rectangle2.getParameter();
        rectangle2.getdimentions();
        rectangle1.setdimetions(25, 4);
        rectangle1.getdimentions();
        System.out.print("area form new dimenthion");
        rectangle2.getArea();

    }

}