package mid;
public class Nested {

    int age;
    String name;

    class InnerNested {
        boolean isStudent;
        double cgpa;

        public InnerNested(double cgpa) {
            this.cgpa = cgpa;
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        Nested.InnerNested iner = nested.new InnerNested(10);

        System.out.println(iner.cgpa);
    }
}
