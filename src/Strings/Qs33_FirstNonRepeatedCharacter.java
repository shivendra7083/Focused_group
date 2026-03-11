/**
 * Question 33: Find the First Non-Repeated Character in a String
 *
 * Problem: Given a string, find the first character that does not repeat.
 * Input: String: "swiss"
 * Output: w
 * Explanation: 'w' is the first character that does not repeat in the string.
 *
 * Beginner Friendly Solution Approach:
 * 1. This is identical in structure to Question 32, but we return the character instead of the index.
 * 2. Loop over every character in the string.
 * 3. Check against all other characters in the string.
 * 4. Maintain a boolean variable to log if a duplicate was found.
 * 5. If no duplicate was found during the inner pass, we return that character.
 */
public class Qs33_FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String input = "swiss";
        
        char result = firstNonRepeatedBeginner(input);
        System.out.println("Output: " + result);
    }
    
    // O(N^2) Approach returning character
    public static char firstNonRepeatedBeginner(String s) {
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            boolean isRepeated = false;
            
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(j) == current) {
                    isRepeated = true;
                    break;
                }
            }
            
            if (!isRepeated) {
                return current;
            }
        }
        
        // Return a default character (like space or null character) if none found
        return ' '; 
    }
}

/* 
 * ==========================================
 * OPTIMIZED APPROACH AND CODE
 * ==========================================
 * Optimized Approach:
 * We can utilize a frequency array or HashMap to reduce time complexity to O(N).
 * This requires one pass to collect counts, and a second pass to identify the first character
 * whose registered count is exactly 1.
 * 
 * Optimized Code (O(N) using HashMap for generic character support beyond alphabet):
 * 
 * import java.util.LinkedHashMap;
 * import java.util.Map;
 * 
 * public static char firstNonRepeatedOptimized(String s) {
 *     // LinkedHashMap maintains insertion order naturally
 *     Map<Character, Integer> counts = new LinkedHashMap<>();
 *     
 *     for (char c : s.toCharArray()) {
 *         counts.put(c, counts.getOrDefault(c, 0) + 1);
 *     }
 *     
 *     for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
 *         if (entry.getValue() == 1) {
 *             return entry.getKey();
 *         }
 *     }
 *     
 *     return ' ';
 * }
 */
