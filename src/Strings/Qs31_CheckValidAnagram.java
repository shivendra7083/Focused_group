/**
 * Question 31: Check Valid Anagram
 *
 * Problem: Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 *
 * Beginner Friendly Solution Approach:
 * 1. An anagram means both strings have the exact same characters with the exact same frequencies.
 * 2. If their lengths are different, they cannot be anagrams.
 * 3. A simple way to check is to convert both strings to character arrays.
 * 4. Sort both arrays.
 * 5. If the sorted arrays are exactly identical, then the strings are valid anagrams.
 */
import java.util.Arrays;

public class Qs31_CheckValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        
        boolean result = isAnagramBeginner(s, t);
        System.out.println("Output: " + result);
    }
    
    // O(N log N) Approach using sorting
    public static boolean isAnagramBeginner(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        
        return Arrays.equals(sArray, tArray);
    }
}

/* 
 * ==========================================
 * OPTIMIZED APPROACH AND CODE
 * ==========================================
 * Optimized Approach:
 * Sorting takes O(N log N) time. We can optimize this to O(N) linear time and O(1) space 
 * by using a frequency array of size 26 (assuming only lowercase English letters).
 * We increment the count for characters in 's' and decrement for characters in 't'.
 * If all counts return to zero at the end, they are perfect anagrams.
 * 
 * Optimized Code (O(N) Frequency Array):
 * 
 * public static boolean isAnagramOptimized(String s, String t) {
 *     if (s.length() != t.length()) return false;
 *     
 *     int[] charCounts = new int[26];
 *     
 *     for (int i = 0; i < s.length(); i++) {
 *         charCounts[s.charAt(i) - 'a']++;
 *         charCounts[t.charAt(i) - 'a']--;
 *     }
 *     
 *     for (int count : charCounts) {
 *         if (count != 0) return false;
 *     }
 *     
 *     return true;
 * }
 */
