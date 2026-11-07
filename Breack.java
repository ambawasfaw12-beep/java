import java.util.Scanner;

public class Breack {

    public static void main(String[] args){
   
        Scanner scanner =  new Scanner(System.in);
          boolean value =   scanner instanceof Scanner;
          System.out.println(value);
        int [] array = new int [5];
        for(int i = 0; i < array.length; i++){
            System.out.print("Enter 5 number for array element");
            array[i] = scanner.nextInt();
        }



        ContinueMethod method = new ContinueMethod();
        method.continuefun(array);

        scanner.close();

    }
}

class ContinueMethod{
     
    public  void continuefun(int [] data){

    }
}