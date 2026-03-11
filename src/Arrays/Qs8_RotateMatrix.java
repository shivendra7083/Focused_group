/**
 * Question 8: Array-Based (Rotate Matrix 90 degrees clockwise)
 *
 * Problem: Rotate a given N x N matrix 90 degrees clockwise.
 * Output: Matrix: [[7, 4, 1], [8, 5, 2], [9, 6, 3]]
 * Explanation: The matrix is rotated 90 degrees clockwise.
 *
 * Beginner Friendly Solution Approach:
 * 1. Create a new 2D array of the same dimensions.
 * 2. Loop through the original matrix row by row.
 * 3. Place elements in the new matrix such that the first row of the original matrix
 *    becomes the last column of the new matrix, the second row becomes the second
 *    last column, and so on.
 * 4. Print the new matrix.
 */
import java.util.Arrays;

public class Qs8_RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int n = matrix.length;
        int[][] newMatrix = new int[n][n];

        // Beginner friendly: copy elements to mathematically translated positions
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                newMatrix[j][n - 1 - i] = matrix[i][j];
            }
        }
        
        System.out.println("Output:Matrix:" + Arrays.deepToString(newMatrix));
    }
}

/* 
 * ==========================================
 * OPTIMIZED APPROACH AND CODE
 * ==========================================
 * Optimized Approach:
 * Instead of allocating a new matrix resulting in O(N^2) extra space, we can 
 * rotate the matrix in-place. We do this in two steps:
 * 1. Transpose the matrix (swap matrix[i][j] with matrix[j][i]).
 * 2. Reverse each row of the transposed matrix.
 * Time Complexity is O(N^2) but Space Complexity is strictly O(1).
 * 
 * Optimized Code:
 * 
 * public static void rotateMatrixOptimized(int[][] matrix) {
 *     int n = matrix.length;
 *     // Swap symmetry over the diagonal (Transpose)
 *     for (int i = 0; i < n; i++) {
 *         for (int j = i; j < n; j++) {
 *             int temp = matrix[i][j];
 *             matrix[i][j] = matrix[j][i];
 *             matrix[j][i] = temp;
 *         }
 *     }
 *     // Reverse each row
 *     for (int i = 0; i < n; i++) {
 *         for (int j = 0; j < n / 2; j++) {
 *             int temp = matrix[i][j];
 *             matrix[i][j] = matrix[i][n - 1 - j];
 *             matrix[i][n - 1 - j] = temp;
 *         }
 *     }
 * }
 */
