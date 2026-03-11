/**
 * Question 12: Largest and Smallest in Array
 *
 * Problem: Given an array, find the second smallest and second largest element in the array. 
 * Print '-1' in the event that either of them doesn’t exist.
 * Input: [1,2,4,7,7,5]
 * Output: Second Smallest : 2, Second Largest : 5
 *
 * Beginner Friendly Solution Approach:
 * 1. Find the largest and the smallest by looping through all the elements.
 * 2. Create a second loop. This time tracking the second largest (the max value 
 *    that isn't equal to the largest) and the second smallest (the min value that 
 *    isn't equal to the smallest).
 * 3. Handle cases where the array is too short (Length < 2) by defaulting to -1.
 */
public class Qs12_LargestAndSmallestInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 7, 5};
        
        if (arr.length < 2) {
            System.out.println("Second Smallest : -1");
            System.out.println("Second Largest : -1");
            return;
        }

        // Pass 1: Find largest and smallest
        int smallest = arr[0], largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) smallest = arr[i];
            if (arr[i] > largest) largest = arr[i];
        }

        // Pass 2: Find second smallest and second largest
        int secondSmallest = Integer.MAX_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            // Must be strictly greater than smallest 
            if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
            // Must be strictly smaller than largest
            if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        
        // Final condition check on if they existed all along
        if (secondSmallest == Integer.MAX_VALUE) secondSmallest = -1;
        if (secondLargest == Integer.MIN_VALUE) secondLargest = -1;

        System.out.println("Second Smallest : " + secondSmallest);
        System.out.println("Second Largest : " + secondLargest);
    }
}

/* 
 * ==========================================
 * OPTIMIZED APPROACH AND CODE
 * ==========================================
 * Optimized Approach:
 * Instead of performing two separate passes over the array, we can find the largest, 
 * second largest, smallest, and second smallest in a single sweep (O(N) Time Complexity).
 * This optimization avoids traversing massive arrays twice. Space Complexity is O(1).
 * 
 * Optimized Code (Single Pass O(N)):
 * 
 * public static void findSecondLargestAndSmallest(int[] arr) {
 *     if (arr.length < 2) {
 *         System.out.println("Second Smallest : -1\\nSecond Largest : -1");
 *         return;
 *     }
 *     int small = Integer.MAX_VALUE, secondSmall = Integer.MAX_VALUE;
 *     int large = Integer.MIN_VALUE, secondLarge = Integer.MIN_VALUE;
 *     
 *     for (int num : arr) {
 *         if (num < small) {
 *             secondSmall = small;
 *             small = num;
 *         } else if (num < secondSmall && num != small) {
 *             secondSmall = num;
 *         }
 *         
 *         if (num > large) {
 *             secondLarge = large;
 *             large = num;
 *         } else if (num > secondLarge && num != large) {
 *             secondLarge = num;
 *         }
 *     }
 *     
 *     if (secondSmall == Integer.MAX_VALUE) secondSmall = -1;
 *     if (secondLarge == Integer.MIN_VALUE) secondLarge = -1;
 *     
 *     System.out.println("Second Smallest : " + secondSmall);
 *     System.out.println("Second Largest : " + secondLarge);
 * }
 */
