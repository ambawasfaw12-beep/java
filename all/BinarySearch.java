public class BinarySearch {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int target = 4;
        int index = 0;

        for(int i  = array.length/2; i < array.length; i = index/2){
              index = i;
            if(target == array[i]){
                System.out.println("Item found at index of " + i);
                break;
            }

            // if(target > array[i]){
            //     i++;
            // }

            else if(target < array[i]){
                i--;
            }

            else{
                System.out.println("Target not found");
                break;
            }

        }
    }
}
