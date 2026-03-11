/**
 * Question 11: Spiral Matrix Traversal
 *
 * Problem: Write the code to traverse a matrix in a spiral format.
 * Sample Input: 5 4
 * 1 2 3 4
 * 5 6 7 8
 * 9 10 11 12
 * 13 14 15 16
 * 17 18 19 20
 *
 * Output: 1 2 3 4 8 12 16 20 19 18 17 13 9 5 6 7 11 15 14 10 (Slight correction in spiral reading)
 *
 * Beginner Friendly Solution Approach:
 * 1. Conceptually set up 4 boundaries: top Row, bottom Row, left Column, right Column.
 * 2. Keep repeating these 4 steps while there are remaining layers in the bounds:
 *    a) Traverse Left to Right across the top row. Then move the Top boundary down.
 *    b) Traverse Top to Bottom along the right column. Then move the Right boundary left.
 *    c) Traverse Right to Left across the bottom row. Then move the Bottom boundary up.
 *    d) Traverse Bottom to Top along the left column. Then move the Left boundary right.
 * 3. Make sure to check boundaries in all conditions so you don't over-cross them.
 */
import java.util.Scanner;

public class Qs11_SpiralMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Wait for Input (rows cols):");
        if (!scanner.hasNextInt()) return;
        
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        // Define boundaries
        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;
        
        System.out.println("Output:");
        
        while (top <= bottom && left <= right) {
            
            // 1. Traverse Top Row (Left to Right)
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++; // Shrink top boundary
            
            // 2. Traverse Right Column (Top to Bottom)
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--; // Shrink right boundary
            
            // Re-check boundaries for reverse loops (useful for non-square matrices)
            if (top <= bottom) {
                // 3. Traverse Bottom Row (Right to Left)
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--; // Shrink bottom boundary
            }
            
            if (left <= right) {
                // 4. Traverse Left Column (Bottom to Top)
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++; // Shrink left boundary
            }
        }
        System.out.println();
        scanner.close();
    }
}

/* 
 * ==========================================
 * OPTIMIZED APPROACH AND CODE
 * ==========================================
 * Optimized Approach:
 * The optimal Time Complexity for traversing an NxM matrix is strictly O(NxM) since 
 * we must visit every element exactly once. Space complexity is O(1) beyond structural loops. 
 * The boundary condition 4-step logic provided in the beginner approach is actually 
 * the most optimal standard implementation. It can only be optimized syntactically 
 * to store output inside a List instead of directly printing to help adapt for Leetcode-style problems.
 * 
 * Optimized Code (Returning as List):
 * 
 * public static java.util.List<Integer> spiralOrder(int[][] matrix) {
 *     java.util.List<Integer> result = new java.util.ArrayList<>();
 *     if (matrix == null || matrix.length == 0) return result;
 *     
 *     int top = 0, bottom = matrix.length - 1;
 *     int left = 0, right = matrix[0].length - 1;
 *     
 *     while (top <= bottom && left <= right) {
 *         for (int i = left; i <= right; i++) result.add(matrix[top][i]);
 *         top++;
 *         for (int i = top; i <= bottom; i++) result.add(matrix[i][right]);
 *         right--;
 *         if (top <= bottom) {
 *             for (int i = right; i >= left; i--) result.add(matrix[bottom][i]);
 *             bottom--;
 *         }
 *         if (left <= right) {
 *             for (int i = bottom; i >= top; i--) result.add(matrix[i][left]);
 *             left++;
 *         }
 *     }
 *     return result;
 * }
 */
