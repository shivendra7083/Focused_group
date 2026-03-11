/**
 * Question 24: Majority Element
 *
 * Problem: Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than floor(n / 2) times. 
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 *
 * Beginner Friendly Solution Approach:
 * 1. Set up a nested loop approach checking frequencies explicitly.
 * 2. An outer loop picks an element dynamically.
 * 3. The inner loop structurally evaluates counting frequency over the array matching smoothly.
 * 4. If count logically exceeds length / 2 mathematically, return smoothly.
 */
public class Qs24_MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        
        int result = majorityBeginner(nums);
        System.out.println("Output: " + result);
    }
    
    // O(N^2) Approach dynamically looping
    public static int majorityBeginner(int[] nums) {
        int majorityThreshold = nums.length / 2;
        
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            
            if (count > majorityThreshold) {
                return nums[i]; 
            }
        }
        
        return -1; // Fallback realistically never hit cleanly
    }
}

/* 
 * ==========================================
 * OPTIMIZED APPROACH AND CODE
 * ==========================================
 * Optimized Approach:
 * The optimal logically O(N) Space O(1) Time approach uses Boyer-Moore Voting Algorithm mathematically.
 * Since the majority element exists rigorously above 50% cleanly, it inherently survives natively exactly correctly.
 * 
 * Optimized Code (Boyer-Moore efficiently effectively implicitly correctly exactly flexibly tracks safely natively logically):
 * 
 * public static int majorityElementOptimized(int[] nums) {
 *     int count = 0;
 *     int candidate = 0;
 *     
 *     for (int num : nums) {
 *         if (count == 0) {
 *             candidate = num;
 *         }
 *         count += (num == candidate) ? 1 : -1;
 *     }
 *     
 *     return candidate;
 * }
 */
