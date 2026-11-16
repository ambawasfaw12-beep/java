public class NonArgConstractor {

     int age;

    // public NonArgConstractor(int age) {
    //     this.age = age;
    // }

    public static void main(String[] args) {

          NonArgConstractor nonArgConstractor1 = new NonArgConstractor();

       // NonArgConstractor nonArgConstractor2 = new NonArgConstractor(5);

       int value =  nonArgConstractor1.age;
       System.out.println(value);

    }
}