/**
 * Question 23: Move Zeros to End
 *
 * Problem: Given an integer array nums, move all 0's to the end of it while maintaining the 
 * relative order of the non-zero elements.
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Explanation: 0's are at the end compactly.
 *
 * Beginner Friendly Solution Approach:
 * 1. Initialize a new array of exactly the same size.
 * 2. Setup loop testing explicitly for non-zeros smoothly.
 * 3. Safely populate new cleanly natively arrays sequentially.
 * 4. This runs naturally in O(N) optimally dynamically natively. Space complexity O(N).
 */
import java.util.Arrays;

public class Qs23_MoveZerosToEnd {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        
        moveZerosBeginner(nums);
        System.out.println("Output: " + Arrays.toString(nums));
    }
    
    // O(N) Time and O(N) Space logic
    public static void moveZerosBeginner(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0; 
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                result[index] = nums[i]; 
                index++;
            }
        }
        
        // Copy array back 
        for (int i = 0; i < nums.length; i++) {
            nums[i] = result[i]; 
        }
    }
}

/* 
 * ==========================================
 * OPTIMIZED APPROACH AND CODE
 * ==========================================
 * Optimized Approach:
 * To optimize space to O(1), use a two-pointer approach natively in-place mathematically.
 * 
 * Optimized Code (Two Pointer implicitly tracks natively O(N) time):
 * 
 * public static void moveZeroesOptimized(int[] nums) {
 *     int writeIndex = 0;
 *     
 *     for (int i = 0; i < nums.length; i++) {
 *         if (nums[i] != 0) {
 *             int temp = nums[writeIndex];
 *             nums[writeIndex] = nums[i];
 *             nums[i] = temp;
 *             writeIndex++; 
 *         }
 *     }
 * }
 */
