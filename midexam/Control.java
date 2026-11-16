package midexam;

public class Control {

    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 5) 
                continue;
              //  break;
            sum += array[i];
        }

        System.out.println(sum);
    }
}
