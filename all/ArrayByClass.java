import java.util.Scanner;

public class ArrayByClass {
    int age;
    String name;

    ArrayByClass(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Create user defined array:");
        
        ArrayByClass[] person = new ArrayByClass[2];
        
        for (int i = 0; i < person.length; i++) {
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            
            person[i] = new ArrayByClass(age, name);
        }

        for (ArrayByClass arrayByClass : person) {
            System.out.println("person");
            System.out.println(arrayByClass.age);
            System.out.println(arrayByClass.name);
        }
        
        scanner.close();

    }
}



// import java.util.Scanner;

// public class ArrayByClass {

//     int age;
//     String name;

//     ArrayByClass(int age, String name) {
//         this.age = age;
//         this.name = name;
//     }

//     public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in);
//         System.out.println("crete user define array");
//         ArrayByClass[] person = new ArrayByClass[5];

//         for (int i = 0; i < person.length; i++) {
//             int age = scanner.nextInt();
//             scanner.nextLine();
//             String name = scanner.nextLine();
//             ArrayByClass arrayByClass = new ArrayByClass(age, name);
//             person[i] = scanner.nextArrayByClass();

//         }

//         scanner.close();
//     }
// }