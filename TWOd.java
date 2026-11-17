public class TWOd {

    public static void main(String[] args) {
        int[][] twoDArray = { { 1, 4, 5 }, { 5, 7, 8 }, { 9, 12, 6 } };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }
        System.err.println("******* row sum *******");

        for (int[] is : twoDArray) {
            int rawSum = 0;
            for (int is2 : is) {
                rawSum += is2;
            }
            System.err.println(rawSum);
        }

        // System.err.println("******* column sum *******");

        // for (int j = 0; j < 3; j++) {
        // int colSum = 0;
        // for (int i = 0; i < 3; i++) {
        // colSum += twoDArray[i][j];
        // }
        // System.out.println(colSum);
        // }

        // TWOd myTo;
        // myTo = new TWOd();
        // System.out.println(myTo);
    }
}