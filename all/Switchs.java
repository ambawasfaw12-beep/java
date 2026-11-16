import java.util.Scanner;

public class Switchs {
  public  static void main(String[] args){
 
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number to now the day");
    int day = input.nextInt();
    

    switch (day) {
        case 1:
            System.out.println("Sunday");   
            break;
        case 2:
            System.out.println("Monday");
            break;
        case 3:
            System.out.println("Tuesday");
            break;
        case 4:
            System.out.println("Wednsday");
            break;
        case 5:
            System.out.println("Thursday");
            break;
        case 6:
            System.out.println("Fierday");
            break;
        case 7:
            System.out.println("Saturdat");
            break;
        default:
            System.out.println("Day in the week");
            break;
    }
    input.close();
  }  
}
