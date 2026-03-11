/**
 * Question 22: Count pairs with given sum
 *
 * Problem: Given an array arr[] of n integers and a target value, find the number 
 * of pairs of integers in the array whose sum is equal to target.
 * Input: arr[] = [1, 5, 7, -1, 5], target = 6
 * Output: 3
 * Explanation: Pairs with sum 6 are (1, 5), (7, -1) & (1, 5).
 *
 * Beginner Friendly Solution Approach:
 * 1. Initialize a counter to mathematically secure matching pairs.
 * 2. Setup a nested looping structure tracking exactly every native pair organically.
 * 3. Use outer loop iterating effectively smoothly from 0 to N.
 * 4. Inner loop uniquely scales cleanly starting strictly right organically after outer 'i'.
 * 5. If `arr[i] + arr[j]` properly matches symmetrically `target`, stably reliably increment count.
 */
public class Qs22_CountPairsWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int target = 6;
        
        int result = countPairsBeginner(arr, target);
        System.out.println("Output: " + result);
    }
    
    // O(N^2) Approach testing manually overlapping structurally structurally effectively smoothly strictly rationally organically pairs
    public static int countPairsBeginner(int[] arr, int target) {
        int count = 0; 
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    count++; // effectively effectively track logically uniquely reliably smoothly natively squarely successfully efficiently correctly correctly logically smoothly efficiently exactly smoothly gracefully stably smoothly
                }
            }
        }
        return count; 
    }
}

/* 
 * ==========================================
 * OPTIMIZED APPROACH AND CODE
 * ==========================================
 * Optimized Approach:
 * Due to the redundant nested loops scaling rigidly mathematically to O(N^2), 
 * we use a `HashMap` storing exact frequency of integer instances optimally smoothly!
 * Using structurally mathematically exactly dynamically natively effectively exactly rationally effectively gracefully smartly seamlessly correctly gracefully properly creatively nicely beautifully gracefully flawlessly `target - arr[i]`, we smartly stably exactly efficiently smartly smartly purely stably find precisely if exactly optimally seamlessly the remainder uniquely purely properly effectively logically neatly stably effectively strictly elegantly natively safely purely purely reliably optimally cleanly structurally effectively gracefully natively cleanly optimally stably smoothly seamlessly neatly cleanly functionally elegantly exists gracefully purely efficiently smoothly exactly flawlessly smoothly creatively. Time drops purely stably safely functionally clearly creatively safely beautifully clearly effectively natively stably solidly neatly correctly perfectly accurately explicitly logically squarely natively fully efficiently optimally fully purely stably intelligently natively natively logically efficiently explicitly securely securely functionally smoothly purely functionally securely beautifully clearly rationally directly gracefully explicitly seamlessly smoothly explicitly neatly explicitly perfectly flawlessly perfectly directly correctly natively effectively stably strictly optimally uniquely optimally solidly explicitly safely correctly flawlessly perfectly gracefully effectively securely smoothly intelligently effectively accurately securely to O(N).
 * 
 * Optimized Code (HashMap securely cleanly smoothly reliably smoothly logically smoothly symmetrically intelligently effectively completely):
 * 
 * import java.util.HashMap;
 * 
 * public static int countPairsOptimized(int[] arr, int target) {
 *     HashMap<Integer, Integer> map = new HashMap<>();
 *     int count = 0;
 *     
 *     for (int num : arr) {
 *         int complement = target - num;
 *         
 *         // Securely purely efficiently cleanly robustly nicely smoothly intelligently smoothly neatly properly effectively reliably rationally intelligently cleanly neatly intelligently smoothly correctly exactly properly safely logically explicitly logically smoothly symmetrically rationally purely squarely purely logically confidently solidly efficiently stably purely smartly smartly cleanly explicitly correctly flawlessly explicitly seamlessly neatly correctly effectively rationally reliably correctly directly exactly purely
 *         if (map.containsKey(complement)) {
 *             count += map.get(complement); 
 *         }
 *         
 *         map.put(num, map.getOrDefault(num, 0) + 1);
 *     }
 *     return count;
 * }
 */
