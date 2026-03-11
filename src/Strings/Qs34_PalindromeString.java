/**
 * Question 34: Palindrome String
 *
 * Problem: Given a string s, the task is to check if it is palindrome or not.
 * Input: s = "abba"
 * Output: true
 * Input: s = "abc"
 * Output: false
 *
 * Beginner Friendly Solution Approach:
 * 1. A string is a palindrome if reading it forwards is identical to reading it backwards.
 * 2. Create a new string that is the reverse version of the original string.
 * 3. Loop from the end of the original string down to the front, appending to the reversed string.
 * 4. Finally, compare if the original string matches the newly created reversed string.
 */
public class Qs34_PalindromeString {
    public static void main(String[] args) {
        String s = "abba";
        
        boolean result = isPalindromeBeginner(s);
        System.out.println("Output: " + result);
    }
    
    // O(N) Space and Time approach using string building
    public static boolean isPalindromeBeginner(String s) {
        String reversed = "";
        
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        
        return s.equals(reversed);
    }
}

/* 
 * ==========================================
 * OPTIMIZED APPROACH AND CODE
 * ==========================================
 * Optimized Approach:
 * Building a reversed string takes extra memory (O(N) Space Complexity) and time due to object creation.
 * We can perfectly verify a palindrome using the "Two Pointers Method" natively in place. 
 * Place a pointer at the beginning and a pointer at the end. Step inward checking characters iteratively.
 * This runs strictly in O(N) Time and O(1) Space.
 * 
 * Optimized Code (Two Pointer In-Place verification):
 * 
 * public static boolean isPalindromeOptimized(String s) {
 *     int left = 0;
 *     int right = s.length() - 1;
 *     
 *     while (left < right) {
 *         if (s.charAt(left) != s.charAt(right)) {
 *             return false; // Mismatch breaks palindrome rule entirely
 *         }
 *         left++;
 *         right--;
 *     }
 *     
 *     return true;
 * }
 */
