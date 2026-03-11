/**
 * Question 28: Counting Valleys
 *
 * Problem: Given a sequence of up and down steps during a hike, determine the number 
 * of valleys traversed. A valley is a sequence of consecutive steps below sea level.
 * Input:
 * 8
 * UDDDUDUU
 * Output: 1
 *
 * Beginner Friendly Solution Approach:
 * 1. Maintain a variable for the current altitude (sea level is 0).
 * 2. Maintain a variable to count the number of valleys.
 * 3. Loop through every character in the string.
 * 4. If step is 'U', altitude goes up by 1. If 'D', altitude goes down by 1.
 * 5. A valley is purely completed when we step 'U' and our altitude reaches exactly 0 (sea level).
 */
public class Qs28_CountingValleys {
    public static void main(String[] args) {
        String steps = "UDDDUDUU";
        
        int result = countValleysBeginner(steps);
        System.out.println("Output: " + result);
    }
    
    // O(N) linear scan approach
    public static int countValleysBeginner(String steps) {
        int altitude = 0;
        int valleys = 0;
        
        for (int i = 0; i < steps.length(); i++) {
            char step = steps.charAt(i);
            
            if (step == 'U') {
                altitude++;
                // If we just came up to sea level, we completed a valley!
                if (altitude == 0) {
                    valleys++;
                }
            } else if (step == 'D') {
                altitude--;
            }
        }
        
        return valleys;
    }
}

/* 
 * ==========================================
 * OPTIMIZED APPROACH AND CODE
 * ==========================================
 * Optimized Approach:
 * The beginner approach accurately scales at exactly O(N) Time and O(1) Space, which is already 
 * mathematically optimal, since every character uniquely must be checked. We simply use 
 * string methods like .toCharArray() for a cleaner foreach loop syntax structurally.
 * 
 * Optimized Code (O(N) natively clean):
 * 
 * public static int countValleysOptimized(String steps) {
 *     int alt = 0, valleys = 0;
 *     for (char c : steps.toCharArray()) {
 *         if (c == 'U') {
 *             alt++;
 *             if (alt == 0) valleys++;
 *         } else {
 *             alt--;
 *         }
 *     }
 *     return valleys;
 * }
 */
