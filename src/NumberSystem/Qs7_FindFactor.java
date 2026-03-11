/**
 * Question 7: Find Factors
 * 
 * Problem: Find the factors of a given number.
 * Write a class FindFactor.java and write the main method in it.
 * Note: If input is negative, ignore the sign. If input is zero the output should be "No Factors".
 * 
 * Beginner Friendly Solution Approach:
 * 1. Take the input using Scanner. Check if it's zero; if so, print "No Factors".
 * 2. If it is negative, simply use Math.abs() to deal with the positive value only.
 * 3. Use an easy loop from 1 all the way to N (the number). 
 * 4. At each step, check if N gives remainder 0 when divided by the loop number (i).
 * 5. Handle comma formatting so no trailing comma appears at the end.
 */
import java.util.Scanner;

public class Qs7_FindFactor { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            
            // If the input is zero
            if (number == 0) {
                System.out.println("No Factors");
            } else {
                // Ignore the negative sign
                int n = Math.abs(number);
                boolean isFirstItem = true;
                
                // Beginner straightforward loop from 1 to N
                for (int i = 1; i <= n; i++) {
                    if (n % i == 0) { // If it divides cleanly, it is a factor
                        if (!isFirstItem) {
                            System.out.print(","); // Add comma before the next item
                        }
                        System.out.print(i);
                        isFirstItem = false;
                    }
                }
                System.out.println(); // Wrap up with a newline 
            }
        }
        
        scanner.close();
    }
}

/* 
 * ==========================================
 * OPTIMIZED APPROACH AND CODE
 * ==========================================
 * Optimized Approach:
 * A brute force algorithm takes O(N) time. The optimal way is checking up to the 
 * square root of N. For every divisor 'i' found up to sqrt(N), its counterpart (N/i) 
 * is logically also a divisor. Thus, we find all factors in O(sqrt(N)) time. 
 * Since we have to display them sorted, we add them to a list, sort them, and print.
 * 
 * Optimized Code:
 * 
 * import java.util.ArrayList;
 * import java.util.Collections;
 * 
 * public class Qs7_FindFactorOptimized {
 *     public static void main(String[] args) {
 *         Scanner sc = new Scanner(System.in);
 *         int num = sc.nextInt();
 *         if (num == 0) {
 *             System.out.println("No Factors");
 *             return;
 *         }
 *         
 *         int n = Math.abs(num);
 *         ArrayList<Integer> factors = new ArrayList<>();
 *         
 *         // O(sqrt(N)) loop
 *         for (int i = 1; i * i <= n; i++) {
 *             if (n % i == 0) {
 *                 factors.add(i);
 *                 if (i != n / i) { // Avoid adding the square root twice
 *                     factors.add(n / i);
 *                 }
 *             }
 *         }
 *         
 *         // Sort the factors before printing
 *         Collections.sort(factors);
 *         
 *         for (int i = 0; i < factors.size(); i++) {
 *             System.out.print(factors.get(i) + (i == factors.size() - 1 ? "" : ","));
 *         }
 *         System.out.println();
 *     }
 * }
 */
