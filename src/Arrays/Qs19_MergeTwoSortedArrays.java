/**
 * Question 19: Merge Two Sorted Arrays
 *
 * Problem: You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, 
 * and two integers m and n. Merge nums1 and nums2 into a single array naturally. 
 * The final sorted array should be stored inside `nums1`. To align this optimally, 
 * `nums1` has a length of m + n mathematically predefined.
 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * Output: [1,2,2,3,5,6] (Array is replaced logically within nums1)
 *
 * Beginner Friendly Solution Approach:
 * 1. The easiest logic is to completely extract `nums2` elements and append them 
 *    sequentially starting from exactly index 'm' directly onto `nums1`.
 * 2. After doing this, we can easily run a traditional Array sort method framework 
 *    natively over `nums1`, pushing it back strictly into non-decreasing format.
 * 3. This operates gracefully logically but runs inherently in O((m+n) log(m+n)) Time.
 */
import java.util.Arrays;

public class Qs19_MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        
        // Execute structural append block logic
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i]; 
        }
        
        // Run default native fast-track array sort architecture
        Arrays.sort(nums1);
        
        System.out.println("Output: " + Arrays.toString(nums1));
    }
}

/* 
 * ==========================================
 * OPTIMIZED APPROACH AND CODE
 * ==========================================
 * Optimized Approach:
 * Because `nums1` securely holds exactly m + n indices inherently built strictly into the problem...
 * Utilizing a "Three Pointer Approach" organically from the BACK side of `nums1` ensures O(m+n) optimal 
 * linear Time structure without needing sorting architectures. Space complexity shrinks perfectly to O(1).
 * We deploy pointers `p1` (at the last logical element of nums1), `p2` (last element of nums2), 
 * and `p` (at the very mathematical end of nums1 array length). We pull backwards securely and stably!
 * 
 * Optimized Code (Three Backward Pointers algorithm):
 * 
 * public static void mergeOptimized(int[] nums1, int m, int[] nums2, int n) {
 *     int p1 = m - 1; // End of nums1 original items
 *     int p2 = n - 1; // End of nums2 items
 *     int p = m + n - 1; // Real structural end of nums1 array indexing
 *     
 *     // Run logically tracking backward overlaps perfectly
 *     while (p1 >= 0 && p2 >= 0) {
 *         if (nums1[p1] > nums2[p2]) {
 *             nums1[p] = nums1[p1];
 *             p1--;
 *         } else {
 *             nums1[p] = nums2[p2];
 *             p2--;
 *         }
 *         p--;
 *     }
 *     
 *     // If any nums2 elements are left cascading securely logically
 *     while (p2 >= 0) {
 *         nums1[p] = nums2[p2];
 *         p2--;
 *         p--;
 *     }
 * }
 */
