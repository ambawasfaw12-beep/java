import  java.util.Random;

public class DefaultReference {
    int age;
    String name;
    boolean isStudent;
    char gender;

    public static void main(String[] args) {

        Random random = new  Random(5);
        System.out.println("From RandomNumber");

        for(int i =0; i < 10; i++){
            System.out.println((int) random.nextInt(1000) + " ");
        }


        // DefaultReference defaultReference = new DefaultReference();

        // System.out.println(defaultReference.age);
        // System.out.println(defaultReference.name);
        // System.out.println(defaultReference.gender);
        // System.out.println(defaultReference.isStudent);

        // int number = (int) (random.nextDouble(1,3));
        // System.out.println(number);

    }
}
