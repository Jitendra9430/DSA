 class Solution {
    public void setZeroes(int[][] matrix) {

        int m = matrix.length;       // rows
        int n = matrix[0].length;    // columns

        int col0 = 1;

        // Step 1: Mark rows and columns
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (matrix[i][j] == 0) {

                    // Mark first column
                    matrix[i][0] = 0;

                    // Mark remaining columns
                    if (j != 0) {
                        matrix[0][j] = 0;
                    } else {
                        // First column itself contains zero
                        col0 = 0;
                    }
                }
            }
        }

        // Step 2: Set inner matrix to zero
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {

                if (matrix[i][j] != 0) {

                    if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        // Step 3: Handle first row
        if (matrix[0][0] == 0) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }

        // Step 4: Handle first column
        if (col0 == 0) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}