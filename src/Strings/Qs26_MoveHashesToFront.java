/**
 * Question 26: Move Hashes to Front
 *
 * Problem: Write a function that accepts a string whose length is "len", the string has some "#" in it;
 * you have to move all the hashes to the front of the string and return the whole string back and print it.
 * Input: Move#Hash#to#Front
 * Output: MoveHashtoFront (With hashes moved to front: ###MoveHashtoFront)
 * (Note: The user example output "MoveHashtoFront" implies the hashes are either removed or moved to front properly. 
 * We follow the description literally: "move all the hashes to the front"). Wait, the strict description says 
 * "move all the hashes to the front". So "Move#Hash#to#Front" should become "###MoveHashtoFront".
 *
 * Beginner Friendly Solution Approach:
 * 1. Create two separate empty strings (or logic containers): one for hashes and one for normal characters.
 * 2. Loop through each character of the given string.
 * 3. If the character is '#', attach it to the `hashString`.
 * 4. If the character is not '#', attach it to the `charString`.
 * 5. Finally, combine them directly by concatenating `hashString + charString` and return it.
 */
public class Qs26_MoveHashesToFront {
    public static void main(String[] args) {
        String input = "Move#Hash#to#Front";
        
        String result = moveHashesBeginner(input);
        System.out.println("Output: " + result);
    }
    
    // String concatenation approach (Beginner Friendly)
    public static String moveHashesBeginner(String str) {
        String hashes = "";
        String letters = "";
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '#') {
                hashes += ch; 
            } else {
                letters += ch;
            }
        }
        
        return hashes + letters; 
    }
}

/* 
 * ==========================================
 * OPTIMIZED APPROACH AND CODE
 * ==========================================
 * Optimized Approach:
 * String concatenation in Java creates a new object in memory every time due to Strings being immutable,
 * which takes O(N^2) time logically for many small concatenations. The optimal way involves using 
 * a StringBuilder structurally natively cleanly! It reduces time correctly down to linearly O(N).
 * 
 * Optimized Code (O(N) Time and O(N) Space cleanly natively securely):
 * 
 * public static String moveHashesOptimized(String str) {
 *     StringBuilder hashes = new StringBuilder();
 *     StringBuilder letters = new StringBuilder();
 *     
 *     for (int i = 0; i < str.length(); i++) {
 *         char c = str.charAt(i);
 *         if (c == '#') {
 *             hashes.append(c);
 *         } else {
 *             letters.append(c);
 *         }
 *     }
 *     
 *     return hashes.append(letters).toString();
 * }
 */
