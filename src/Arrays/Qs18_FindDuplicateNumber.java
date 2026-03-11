/**
 * Question 18: Find Duplicate Number
 *
 * Problem Statement: Given an array of N + 1 size, where each element is between 1 and N. 
 * Assuming there is only one duplicate number, your task is to find the duplicate number.
 * Input: arr=[1,3,4,2,2]
 * Output: 2
 * Explanation: Since 2 is the duplicate number the answer will be 2.
 *
 * Beginner Friendly Solution Approach:
 * 1. For every element at index 'i', match it strictly against all elements ahead of it 
 *    starting at index 'i + 1'.
 * 2. Nested loop execution makes checking logic comprehensive but structurally runs 
 *    in an O(N^2) time loop pattern.
 * 3. Immediately upon encountering match, return logically.
 */
public class Qs18_FindDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        int duplicate = findDuplicateBeginner(arr);
        System.out.println("Output: " + duplicate);
    }
    
    // O(N^2) double-check scan loop
    public static int findDuplicateBeginner(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i]; // Matching duplicate found
                }
            }
        }
        return -1; // Fail-safe
    }
}

/* 
 * ==========================================
 * OPTIMIZED APPROACH AND CODE
 * ==========================================
 * Optimized Approach:
 * To optimize down to O(N) Time and O(1) space, we cannot use Sorting structure (which modifies array)
 * and we cannot use HashSet (which uses O(N) extra space). A brilliant approach structurally utilizes 
 * "Floyd's Tortoise and Hare" Cycle Detection approach (Slow/Fast Pointers architecture).
 * As each element falls uniquely between 1 and N inclusive, we can treat the array index points mapping 
 * to array values strictly as linked-list node linkages. 
 * The duplicated number logically triggers an infinite cycle. Once the pointers intercept, 
 * we restart the slow pointer to index 0, keeping the fast pointer in frame and walking exactly 
 * one iterative step each securely until they match. The junction of this loop identifies the logic duplicate.
 * 
 * Optimized Code (O(1) Space, O(N) Time):
 * 
 * public static int findDuplicateOptimized(int[] nums) {
 *     int slow = nums[0];
 *     int fast = nums[nums[0]]; // fast runs twice as fast
 *     
 *     // Phase 1: Establish interception / Cycle structurally
 *     while (slow != fast) {
 *         slow = nums[slow];
 *         fast = nums[nums[fast]];
 *     }
 *     
 *     // Phase 2: Identify junction 
 *     fast = 0;
 *     while (slow != fast) {
 *         slow = nums[slow];
 *         fast = nums[fast]; // Both pointers move at strictly one pace step now
 *     }
 *     
 *     return slow; // Points reliably to the structural duplicate instance point
 * }
 */
