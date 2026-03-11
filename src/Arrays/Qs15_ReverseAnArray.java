/**
 * Question 15: Reverse an Array
 *
 * Problem: You are given an array. The task is to reverse the array and print it.
 * Input: N = 5, arr[] = {5,4,3,2,1}
 * Output: {1,2,3,4,5}
 * Explanation: Since the order of elements gets reversed the first element will occupy the fifth position...
 *
 * Beginner Friendly Solution Approach:
 * 1. Create a brand new array matching the size of the original.
 * 2. Loop through the original array backwards (starting from N-1 down to 0).
 * 3. Store these elements into the new array sequentially, acting as a reversed copy.
 * 4. Print the newly assembled array.
 */
import java.util.Arrays;

public class Qs15_ReverseAnArray {
    public static void main(String[] args) {
        int[] arr1 = {5, 4, 3, 2, 1};
        int[] reversedArray = new int[arr1.length];
        
        int n = arr1.length;
        
        // Loop backwards and deposit elements into the new array
        int j = 0;
        for (int i = n - 1; i >= 0; i--) {
            reversedArray[j] = arr1[i];
            j++;
        }
        
        System.out.println("Output: " + Arrays.toString(reversedArray).replace("[", "{").replace("]", "}"));
    }
}

/* 
 * ==========================================
 * OPTIMIZED APPROACH AND CODE
 * ==========================================
 * Optimized Approach:
 * Instead of allocating a new array, taking O(N) Space Complexity, we can use a "Two Pointers" 
 * approach to reverse the matrix in-place natively. 
 * Place a 'left' pointer at the start and a 'right' pointer at the end. Step inward and 
 * swap elements simultaneously until the pointers cross. This retains O(N) Time Complexity 
 * while squeezing down towards O(1) Space Complexity.
 * 
 * Optimized Code (Two Pointer In-Place Reversal):
 * 
 * public static void reverseArrayOptimized(int[] arr) {
 *     int left = 0;
 *     int right = arr.length - 1;
 *     
 *     while (left < right) {
 *         // Swap the variables directly
 *         int temp = arr[left];
 *         arr[left] = arr[right];
 *         arr[right] = temp;
 *         
 *         // Move both iterators inwards
 *         left++;
 *         right--;
 *     }
 *     
 *     System.out.println("{");
 *     for (int i=0; i < arr.length; i++) {
 *         System.out.print(arr[i] + (i != arr.length-1 ? "," : ""));
 *     }
 *     System.out.println("}");
 * }
 */
