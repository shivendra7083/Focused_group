/**
 * Question 14: Matrix Identity Check
 *
 * Problem: Write a program to check if two given matrices are identical.
 * Input:
 * Matrix A: [[1,1,1,1], [2,2,2,2], [3,3,3,3], [4,4,4,4]]
 * Matrix B: [[1,1,1,1], [2,2,2,2], [3,3,3,3], [4,4,4,4]]
 * Output: Matrices are identical
 *
 * Beginner Friendly Solution Approach:
 * 1. Two matrices can only be identical if they have the same number of rows and columns.
 * 2. If their dimensions match, start looping over both matrices element by element.
 * 3. If any element `A[i][j]` is not equal to `B[i][j]`, print that they are not identical 
 *    and immediately stop checking.
 * 4. If the loops finish entirely without finding mismatches, the matrices are identical.
 */
public class Qs14_MatrixIdentityCheck {
    public static void main(String[] args) {
        // Pre-defined Sample Inputs
        int[][] matrixA = {
            {1, 1, 1, 1},
            {2, 2, 2, 2},
            {3, 3, 3, 3},
            {4, 4, 4, 4}
        };
        int[][] matrixB = {
            {1, 1, 1, 1},
            {2, 2, 2, 2},
            {3, 3, 3, 3},
            {4, 4, 4, 4}
        };

        boolean areIdentical = true;
        
        // 1. Check dimensional boundaries first
        if (matrixA.length != matrixB.length) {
            areIdentical = false;
        } else {
            // 2. Loop row by row, column by column
            for (int i = 0; i < matrixA.length; i++) {
                // Important: Also check if column length are identically structured
                if (matrixA[i].length != matrixB[i].length) {
                    areIdentical = false;
                    break;
                }
                
                for (int j = 0; j < matrixA[i].length; j++) {
                    // Check logic
                    if (matrixA[i][j] != matrixB[i][j]) {
                        areIdentical = false;
                        break; // Stop immediately upon finding mismatch
                    }
                }
                // Break the outer loop early if a mismatch is already confirmed
                if (!areIdentical) break;
            }
        }
        
        // Output result
        if (areIdentical) {
            System.out.println("Output: Matrices are identical");
        } else {
            System.out.println("Output: Matrices are not identical");
        }
    }
}

/* 
 * ==========================================
 * OPTIMIZED APPROACH AND CODE
 * ==========================================
 * Optimized Approach:
 * Since comparing entire data grids demands iterating across every item at least once 
 * if they happen to be identical, Time Complexity mathematically binds at O(N x M). 
 * Space Complexity binds essentially at O(1) optimally. The main block logic acts as the 
 * standard efficient process structure. Syntactically, we can break it down into a 
 * separate clean function returning a boolean. Let's do that for the "optimized syntax" version.
 * 
 * Optimized Code:
 * 
 * public static boolean checkIdentical(int[][] matA, int[][] matB) {
 *     if (matA.length != matB.length) return false;
 *     
 *     for (int i = 0; i < matA.length; i++) {
 *         if (matA[i].length != matB[i].length) return false;
 *         for (int j = 0; j < matA[i].length; j++) {
 *             if (matA[i][j] != matB[i][j]) {
 *                 return false;
 *             }
 *         }
 *     }
 *     return true;
 * }
 */
