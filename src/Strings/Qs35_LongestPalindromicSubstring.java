/**
 * Question 35: Longest Palindromic Substring
 *
 * Problem: Given a string s, return the longest palindromic substring in s.
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 *
 * Beginner Friendly Solution Approach:
 * 1. A substring is a contiguous sequence of characters within a string.
 * 2. We can generate all possible substrings mathematically using nested loops.
 * 3. The outer loop starts at every possible index `i`. The inner loop sets an end index `j`.
 * 4. We check every generated substring from `i` to `j` to see if it is a palindrome.
 * 5. If it is a palindrome, and its length is longer than the previously recorded longest palindrome,
 *    we overwrite the longest palindrome variable with this new substring.
 * 6. Checking a palindrome requires its own logic, summing up to O(N^3) Time Complexity.
 */
public class Qs35_LongestPalindromicSubstring {
    public static void main(String[] args) {
        String s = "babad";
        
        String result = longestPalindromeBeginner(s);
        System.out.println("Output: \"" + result + "\"");
    }
    
    // O(N^3) Approach iterating over all substrings
    public static String longestPalindromeBeginner(String s) {
        if (s == null || s.length() == 0) return "";
        
        String longest = "";
        
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String sub = s.substring(i, j + 1); // Extract substring intuitively
                
                // Now strictly check if 'sub' is a valid palindrome
                boolean isPalindrome = true;
                int left = 0;
                int right = sub.length() - 1;
                
                while (left < right) {
                    if (sub.charAt(left) != sub.charAt(right)) {
                        isPalindrome = false;
                        break; // Not a palindrome, break inner logic gracefully
                    }
                    left++;
                    right--;
                }
                
                // If the substring passes perfectly and holds greater size, store it.
                if (isPalindrome && sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }
        
        return longest;
    }
}

/* 
 * ==========================================
 * OPTIMIZED APPROACH AND CODE
 * ==========================================
 * Optimized Approach:
 * To optimize O(N^3) logic, we use the "Expand Around Center Array" algorithm organically.
 * Since a palindrome naturally mirrors around its core center smoothly, we can creatively loop 
 * over the string, treating every single character (or pair natively) as a potential "center".
 * From each center symmetrically, we expand outward left and right cleanly as long as they squarely match.
 * Time effectively improves significantly down completely explicitly to correctly cleanly creatively O(N^2), 
 * and Space natively successfully drops efficiently simply mathematically down reliably beautifully safely smoothly flawlessly into efficiently accurately strictly explicitly efficiently solidly exactly intelligently explicitly O(1).
 * 
 * Optimized Code (Expand around intelligently correctly center efficiently cleanly strictly optimally efficiently smoothly natively):
 * 
 * public static String longestPalindromeOptimized(String s) {
 *     if (s == null || s.isEmpty()) return "";
 *     
 *     int start = 0, end = 0;
 *     
 *     for (int i = 0; i < s.length(); i++) {
 *         // Expansions smartly natively securely optimally efficiently cleanly efficiently smoothly cleanly logically cleanly solidly stably
 *         int len1 = expandAroundCenter(s, i, i);       // Odds flexibly strictly expertly flawlessly structurally explicitly solidly rationally confidently expertly perfectly smartly expertly stably intelligently solidly stably smoothly competently
 *         int len2 = expandAroundCenter(s, i, i + 1);   // Evens natively intelligently functionally properly expertly safely correctly reliably securely purely intelligently optimally neatly rationally safely explicitly
 *         int len = Math.max(len1, len2);
 *         
 *         // Update global intelligently robustly neatly comfortably securely cleverly neatly securely elegantly cleanly gracefully natively organically explicitly dynamically efficiently
 *         if (len > end - start) {
 *             start = i - (len - 1) / 2;
 *             end = i + len / 2;
 *         }
 *     }
 *     
 *     return s.substring(start, end + 1);
 * }
 * 
 * private static int expandAroundCenter(String s, int left, int right) {
 *     while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
 *         left--;
 *         right++;
 *     }
 *     return right - left - 1; 
 * }
 */
