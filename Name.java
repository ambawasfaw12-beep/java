import java.util.Scanner;

public class Name {
   public static void  main(String[] args){
   Scanner input = new Scanner(System.in);

   System.out.print("Enter you'r Number?");
   double num = input.nextInt();

 double sqrNum = Math.sqrt(num);


   System.out.println("the squ" + sqrNum);
   input.close();
}
}
