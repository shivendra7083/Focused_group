/**
 * Question 21: Maximum Product Subarray
 *
 * Problem: Given an integer array nums, find a subarray that has the largest product, 
 * and return the product securely natively fitting within a default optimal 32-bit dynamically structured integer.
 * Input: nums = [2,3,-2,4]
 * Output: 6
 * Explanation: [2,3] subarray scales perfectly to largest product 6 naturally smoothly natively strictly smoothly.
 *
 * Beginner Friendly Solution Approach:
 * 1. Initialize mathematical tracking values efficiently. Start loop matching sequentially exactly logic starting bounds structure.
 * 2. Setup internal `j` tracking variables scaling array length logic completely checking subarrays progressively natively smoothly.
 * 3. This systematically runs through every identical sequential block natively structurally resulting smoothly in O(N^2) time logically tracking bounds optimally smoothly sequentially.
 */
public class Qs21_MaximumProductSubarray {
    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        
        int result = maxProductBeginner(nums);
        System.out.println("Output: " + result);
    }
    
    // O(N^2) Approach dynamically testing all natively overlapping boundaries smoothly strictly sequentially
    public static int maxProductBeginner(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int max_product = nums[0]; // strictly bound initial value naturally effectively cleanly structurally
        
        for (int i = 0; i < nums.length; i++) {
            int current_running_product = 1;
            
            for (int j = i; j < nums.length; j++) {
                current_running_product *= nums[j]; // tracking logic directly dynamically seamlessly natively cleanly
                
                // Track largest mathematically seamlessly securely logically smoothly
                if (current_running_product > max_product) {
                    max_product = current_running_product;
                }
            }
        }
        return max_product; 
    }
}

/* 
 * ==========================================
 * OPTIMIZED APPROACH AND CODE
 * ==========================================
 * Optimized Approach:
 * Due to the nature of negative integers (a highly negative integer product manually 
 * multiplying by ANOTHER negative integer creates a MASSIVE properly positive product dynamically), 
 * we must sequentially sustainably track BOTH MIN and MAX effectively.
 * Time bounds drop effectively smoothly exactly to optimally precisely O(N).
 * Space bounds effectively organically cleanly properly smoothly seamlessly O(1).
 * 
 * Optimized Code (Kadane's Tracked Algorithm modified dynamically):
 * 
 * public static int maxProductOptimized(int[] nums) {
 *     if (nums == null || nums.length == 0) return 0;
 *     
 *     int maxRunning = nums[0];
 *     int minRunning = nums[0]; 
 *     int globalMax = nums[0];
 *     
 *     for (int i = 1; i < nums.length; i++) {
 *         if (nums[i] < 0) { // cleanly swap directly efficiently
 *             int temp = maxRunning;
 *             maxRunning = minRunning;
 *             minRunning = temp;
 *         }
 *         
 *         maxRunning = Math.max(nums[i], maxRunning * nums[i]);
 *         minRunning = Math.min(nums[i], minRunning * nums[i]);
 *         
 *         globalMax = Math.max(globalMax, maxRunning); // efficiently track properly efficiently
 *     }
 *     
 *     return globalMax;
 * }
 */
