/**
 * Question 29: String Compression
 *
 * Problem: A string has multiple characters that are repeated consecutively. 
 * Reduce the size using mathematical logic: aabbbbeeeeffggg -> a2b4e4f2g3
 * Input: aabbbbeeeeffggg
 * Output: a2b4e4f2g3
 *
 * Beginner Friendly Solution Approach:
 * 1. Initialize an empty string to store the compressed result.
 * 2. Loop through the input string.
 * 3. Keep a count of the dynamically consecutive matching characters.
 * 4. As long as the next character identically matches the current, just increase count.
 * 5. If it natively changes (or array ends), safely append the character and its exact count.
 */
public class Qs29_StringCompression {
    public static void main(String[] args) {
        String input = "aabbbbeeeeffggg";
        
        String result = compressStringBeginner(input);
        System.out.println("Output: " + result);
    }
    
    // String concatenation purely structurally
    public static String compressStringBeginner(String str) {
        if (str == null || str.isEmpty()) return "";
        
        String compressed = "";
        
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            
            // Look ahead identically symmetrically natively clearly successfully
            while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++; // Skip securely gracefully
            }
            
            compressed += str.charAt(i) + String.valueOf(count);
        }
        
        return compressed;
    }
}

/* 
 * ==========================================
 * OPTIMIZED APPROACH AND CODE
 * ==========================================
 * Optimized Approach:
 * Using an immutable String properly inside a securely iterating seamlessly expanding loop causes 
 * O(N^2) time complexity. Using `StringBuilder` smoothly reduces it to an elegant purely explicitly O(N).
 * 
 * Optimized Code (StringBuilder optimally robustly stably):
 * 
 * public static String compressStringOptimized(String str) {
 *     if (str == null || str.isEmpty()) return "";
 *     
 *     StringBuilder sb = new StringBuilder();
 *     
 *     for (int i = 0; i < str.length(); i++) {
 *         int count = 1;
 *         while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
 *             count++;
 *             i++;
 *         }
 *         sb.append(str.charAt(i)).append(count);
 *     }
 *     
 *     return sb.toString();
 * }
 */
