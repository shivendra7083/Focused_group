/**
 * Question 16: Kth Largest Element in an Array
 *
 * Problem: Given an integer array nums and an integer k, return the kth largest
 * element in the array. Can you solve it without sorting?
 * Input: nums = [3,2,1,5,6,4], k = 2
 * Output: 5
 *
 * Beginner Friendly Solution Approach (With Sorting):
 * 1. Usually, finding the largest requires sorting. Sorting natively runs in O(N log N).
 * 2. If the array gets sorted in ascending order (smallest to largest), the largest element 
 *    is positioned at length - 1, the 2nd largest at length - 2, ...
 *    Therefore, the Kth largest is at Index = `length - k`.
 * 3. But the problem specifically asks to ideally solve it *without* a traditional full-sort algorithm.
 *    See "Optimized Approach" at the bottom for the non-sorting solution using Priority Queue!
 */
import java.util.Arrays;
import java.util.PriorityQueue;

public class Qs16_KthLargestElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        
        // Sorting approach (Easy read)
        Arrays.sort(nums); // Sorts array 
        int resultSorted = nums[nums.length - k]; 
        
        System.out.println("Output (via sort): " + resultSorted);
        
        // Call optimal method logic below
        int resultOptimized = findKthLargestOptimized(nums, k);
        System.out.println("Output (without sort): " + resultOptimized);
    }
    
    // Method acting dynamically as a bridge towards optimal logic block explanation
    public static int findKthLargestOptimized(int[] nums, int k) {
        // A PriorityQueue acts as a Min-Heap by default
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for (int i = 0; i < nums.length; i++) {
            minHeap.add(nums[i]); // Keep adding numbers
            
            // Allow the heap to hold ONLY exactly K of the "largest" elements found so far by 
            // constantly kicking out the smallest element whenever the size exceeds K.
            if (minHeap.size() > k) {
                minHeap.poll(); 
            }
        }
        // Root holds the K-th largest
        return minHeap.peek();
    }
}

/* 
 * ==========================================
 * OPTIMIZED APPROACH AND CODE
 * ==========================================
 * Optimized Approach:
 * To solve this strictly without calling array sort methods, the most commonly optimal 
 * approach uses a "Min-Heap" data structure represented by java's `PriorityQueue`. 
 * While iterating across the array, every number attempts to enter the Heap. If the heap size 
 * exceeds 'K', we boot out the smallest number. At the end, the heap contains only the K 
 * largest numbers mathematically, with the absolute smallest out of those remaining sitting 
 * directly at the root. Time Complexity strictly shrinks down to O(N log K) reducing from 
 * O(N log N), making a massive speed gain! Space complexity becomes O(K).
 * 
 * Optimized Code block logic uses:
 * 
 * PriorityQueue<Integer> minHeap = new PriorityQueue<>();
 * for (int num : nums) {
 *     minHeap.add(num);
 *     if (minHeap.size() > k) {
 *         minHeap.poll(); // removes smallest
 *     }
 * }
 * return minHeap.peek(); // The k-th largest element is tracked here.
 * 
 * Note: An even more theoretical optimization uses "Quickselect Algorithm" 
 * which guarantees an average time complexity of O(N) but may fall to O(N^2) in 
 * unstructured worst-case situations.
 */
