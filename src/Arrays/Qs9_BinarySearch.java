/**
 * Question 9: Binary Search
 *
 * Problem: Implement a binary search algorithm to find a target value in a sorted array.
 * Input: Array: [1, 2, 3, 4, 5, 6, 7, 8, 9], Target: 4
 * Output: 3
 * Explanation: The function returns the index of the target value in the array.
 *
 * Beginner Friendly Solution Approach:
 * 1. Define two pointers, `left` at the start (0) and `right` at the end (size-1).
 * 2. While `left` is less than or equal to `right`, calculate the `mid` index.
 * 3. If the element at `mid` is the target, return `mid`.
 * 4. If the target is greater than the element at `mid`, it must be in the right half 
 *    (so, move `left` to mid + 1).
 * 5. If smaller, move `right` to mid - 1.
 * 6. This loop halves the search space at every step until found or empty.
 */
public class Qs9_BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 4;
        
        int result = binarySearch(array, target);
        System.out.println("Output: " + result);
    }
    
    // Beginner readable binary search function
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = (left + right) / 2; // Midpoint
            
            if (arr[mid] == target) {
                return mid; // Found it
            } else if (arr[mid] < target) {
                left = mid + 1; // It must be to the right
            } else {
                right = mid - 1; // It must be to the left
            }
        }
        return -1; // Target not found
    }
}

/* 
 * ==========================================
 * OPTIMIZED APPROACH AND CODE
 * ==========================================
 * Optimized Approach:
 * The binary search algorithm is organically an optimal O(log N) algorithm.
 * The only optimization is preventing potential integer overflow when calculating 
 * mid for massive arrays by using mid = left + (right - left) / 2 instead of (left + right) / 2.
 * 
 * Optimized Code:
 * 
 * public static int binarySearchOptimized(int[] arr, int target) {
 *     int left = 0, right = arr.length - 1;
 *     while (left <= right) {
 *         int mid = left + (right - left) / 2; // Immune to Integer Overflow
 *         if (arr[mid] == target) return mid;
 *         if (arr[mid] < target) left = mid + 1;
 *         else right = mid - 1;
 *     }
 *     return -1;
 * }
 */
