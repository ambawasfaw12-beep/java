public class MatrixTrance {
    public static void main(String[] args) {

        int[][] matrix = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

        /*
         * the normal matrix r*c
         * transpose of a matric is reppresent as c*r
         */

        int[][] transpose = new int[2][3];

        // row
        for (int j = 0; j < 2; j++) {

            // col
            for (int i = 0; i < 3; i++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // row
        for (int i = 0; i < 2; i++) {
            // col
            for (int j = 0; j < 3; j++) {
                System.out.print(transpose[i][j]);
            }
            System.out.println();
        }

    }
}
