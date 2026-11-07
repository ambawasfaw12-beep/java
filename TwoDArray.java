import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
     //   int sum = 0;
       // int max = arr[0][0];
      // int rowSum = 0;
       int colSum = 0;

        System.out.println("Enter the elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                arr[i][j] = (int) (Math.random() * 10);
                // System.out.print("Element [" + i + "][" + j + "]: ");
                // arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nYour 2D array:");
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(arr[i][j] + " ");

              //  rowSum += arr[i][j];
                colSum += arr[i][j];
                // if(arr[i][j]>= max){
                //     max = arr[i][j];
                // }
               // sum += arr[i][j];

            }
          //  System.out.println("Sum or row " + rowSum);
            System.out.println("Sum of col "+ colSum);
            System.out.println();
        }
      //  System.out.println(max);
      //  System.out.print("Sum of all element " + sum);
        sc.close();
    }
}