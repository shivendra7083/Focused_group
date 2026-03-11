/**
 * Question 32: First Unique Character in a String
 *
 * Problem: Given a string s, find the first non-repeating character in it and return its index. 
 * If it does not exist, return -1.
 * Input: s = "leetcode"
 * Output: 0
 * Explanation: The character 'l' at index 0 is the first character that does not occur at any other index.
 *
 * Beginner Friendly Solution Approach:
 * 1. Loop through every character in the string.
 * 2. For each character, run an inner loop through the entire string to check if it appears again.
 * 3. Count how many times it appears.
 * 4. If the count is exactly 1, return its index immediately.
 * 5. If the outer loop finishes without finding any unique character, return -1.
 */
public class Qs32_FirstUniqueCharacter {
    public static void main(String[] args) {
        String s = "leetcode";
        
        int result = firstUniqCharBeginner(s);
        System.out.println("Output: " + result);
    }
    
    // O(N^2) double-loop scanning approach
    public static int firstUniqCharBeginner(String s) {
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int count = 0;
            
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == currentChar) {
                    count++;
                }
            }
            
            // First one found with a count of exactly 1 is our answer
            if (count == 1) {
                return i;
            }
        }
        
        return -1;
    }
}

/* 
 * ==========================================
 * OPTIMIZED APPROACH AND CODE
 * ==========================================
 * Optimized Approach:
 * Using a nested loop gives an O(N^2) time complexity. We can optimize this to O(N) 
 * by doing two linear passes over the string and keeping track of character frequencies 
 * using an integer array of size 26 (for lowercase English letters) or a HashMap.
 * 
 * Optimized Code (O(N) Time and O(1) Space with frequency array):
 * 
 * public static int firstUniqCharOptimized(String s) {
 *     int[] frequency = new int[26];
 *     
 *     // Pass 1: Build frequency map
 *     for (int i = 0; i < s.length(); i++) {
 *         frequency[s.charAt(i) - 'a']++;
 *     }
 *     
 *     // Pass 2: Find the first character with a frequency of 1
 *     for (int i = 0; i < s.length(); i++) {
 *         if (frequency[s.charAt(i) - 'a'] == 1) {
 *             return i;
 *         }
 *     }
 *     
 *     return -1;
 * }
 */
