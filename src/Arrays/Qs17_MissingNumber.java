/**
 * Question 17: Missing Number
 *
 * Problem: Given an array nums containing n distinct numbers in the range [0, n], return 
 * the only number in the range that is missing from the array.
 * Input: nums = [3,0,1]
 * Output: 2
 * Explanation: n=3 since there are 3 numbers, so all ranges are [0,3]. 2 is missing.
 *
 * Beginner Friendly Solution Approach:
 * 1. Loop through the array to check each number sequentially from 0 to N.
 * 2. To check if a number 'x' exists, create an inner loop to check every item over `nums`.
 * 3. If scanning finishes entirely and 'x' was not found during the inner loop pass, 
 *    that number 'x' is precisely the missing number.
 * 4. This executes cleanly mathematically but results in O(N^2) Time Complexity.
 */
public class Qs17_MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        int result = findMissing(nums);
        System.out.println("Output: " + result);
    }
    
    // O(N^2) Approach
    public static int findMissing(int[] nums) {
        int n = nums.length;
        
        for (int x = 0; x <= n; x++) {
            boolean found = false;
            
            // Inner loop directly searches through array elements
            for (int i = 0; i < n; i++) {
                if (nums[i] == x) {
                    found = true;
                    break;
                }
            }
            // If the element doesn't exist mathematically
            if (!found) {
                return x;
            }
        }
        return -1; // Fallback logic
    }
}

/* 
 * ==========================================
 * OPTIMIZED APPROACH AND CODE
 * ==========================================
 * Optimized Approach (Gauss Mathematical Approach):
 * Instead of checking for numbers inside looping structures (O(N^2)), we know that the 
 * mathematical sum equation for the first 'N' exact numbers is: N * (N + 1) / 2.
 * So, if we calculate exactly what the sum of elements "should" be, and we calculate 
 * the actual sum of elements provided... The difference will pinpoint precisely the 
 * missing number! Time Complexity structurally achieves a very sleek O(N). Space Complexity: O(1).
 * 
 * Optimized Code (Mathematical approach):
 * 
 * public static int missingNumberOptimized(int[] nums) {
 *     int n = nums.length;
 *     // What the total should be if no numbers were missing:
 *     int expectedSum = n * (n + 1) / 2;
 *     
 *     // Subtract the actual provided numbers logically:
 *     int actualSum = 0;
 *     for (int num : nums) {
 *         actualSum += num;
 *     }
 *     
 *     return expectedSum - actualSum;
 * }
 * 
 * Note: Another highly optimized structure utilizes logical XOR Bit Manipulation natively 
 * allowing O(N) evaluation which prevents potential Integer Overflow issues completely.
 */
