/**
 * Question 20: Rotate Array
 *
 * Problem: Given an integer array nums, rotate the array to the right by k steps, 
 * where k is non-negative.
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation: rotate 3 steps to the right incrementally smoothly.
 *
 * Beginner Friendly Solution Approach:
 * 1. The absolute foundational approach replicates "rotating" by popping the last element 
 *    strictly and squeezing it mathematically to the front, pushing all others backwards.
 * 2. This structure is wrapped logically inside a main `for` loop executing strictly 'X' exact times, 
 *    where `X` equates seamlessly to exactly `k` iterations. Wait—what if `k` exceeds `length` natively? 
 *    Just perform `k = k % length` to streamline efficiency logic directly!
 * 3. This approach takes O(N * K) mathematically, causing it to fail optimally logically on large datasets.
 */
import java.util.Arrays;

public class Qs20_RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        
        k = k % nums.length; // Simplify effectively
        
        // Loop architecture moving elements inherently strictly by one step
        for (int i = 0; i < k; i++) {
            // Track the foundational extreme tail element inherently 
            int lastElement = nums[nums.length - 1];
            
            // Shift array tracking bounds seamlessly down identically to the right strictly
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1]; // Pull preceding element cleanly forward
            }
            
            // Reapply tracked architectural tail element neatly up smoothly into 0-Index dynamically
            nums[0] = lastElement;
        }
        
        System.out.println("Output: " + Arrays.toString(nums));
    }
}

/* 
 * ==========================================
 * OPTIMIZED APPROACH AND CODE
 * ==========================================
 * Optimized Approach:
 * The optimal Time Complexity for scaling an array rotation inherently demands strictly O(N),
 * and Space perfectly runs gracefully on O(1). We use the "Array Reversal Method" directly!
 * Conceptually:
 * 1. Reverse the entire native original array structure smoothly completely.
 * 2. Reverse only the first 'K' logical bounds.
 * 3. Reverse the rest sequentially remaining native boundary array structures exactly!
 * 
 * Optimized Code (Three Reverse architecture block structure):
 * 
 * public static void rotateOptimized(int[] nums, int k) {
 *     k = k % nums.length; // Prevent over-tracking
 *     
 *     reverse(nums, 0, nums.length - 1); // 1. Full Reverse entirely cleanly organically
 *     reverse(nums, 0, k - 1);           // 2. Reverse left logical side properly 
 *     reverse(nums, k, nums.length - 1); // 3. Reverse right logical side properly entirely
 * }
 * 
 * private static void reverse(int[] nums, int start, int end) {
 *     while (start < end) {
 *         int temp = nums[start];
 *         nums[start] = nums[end];
 *         nums[end] = temp;
 *         start++;
 *         end--;
 *     }
 * }
 */
