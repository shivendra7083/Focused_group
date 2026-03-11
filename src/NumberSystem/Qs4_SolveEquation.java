/**
 * Question 4: Equation Result
 * 
 * Problem: Write a function to solve the following equation: a³ + a²b + 2a²b + 2ab² + ab² + b³.
 * Write a program to accept three values in order of a, b and c and get the result of the above equation.
 * 
 * Beginner Friendly Solution Approach:
 * 1. Read the integers a, b, and c using a Scanner.
 * 2. Create the exact formula stated: a*a*a + a*a*b + 2*a*a*b + 2*a*b*b + a*b*b + b*b*b.
 * 3. Store result components in variables or calculate directly. Using 'long' ensures that 
 *    large numbers don't exceed the integer limit.
 * 4. Add all components and print the result.
 */
import java.util.Scanner;

public class Qs4_SolveEquation {
    
    // Function that replicates the exact equation step by step
    public static long evaluateEquation(int a, int b) {
        long term1 = (long)a * a * a;     // a³
        long term2 = (long)a * a * b;     // a²b
        long term3 = 2 * (long)a * a * b; // 2a²b
        long term4 = 2 * (long)a * b * b; // 2ab²
        long term5 = (long)a * b * b;     // ab²
        long term6 = (long)b * b * b;     // b³
        
        return term1 + term2 + term3 + term4 + term5 + term6;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read simple inputs
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt(); // Note: 'c' is accepted but not used in the equation
            
            long result = evaluateEquation(a, b);
            
            System.out.println(result);
        }
        
        scanner.close();
    }
}

/* 
 * ==========================================
 * OPTIMIZED APPROACH AND CODE
 * ==========================================
 * Optimized Approach:
 * The algebraic equation is: a³ + a²b + 2a²b + 2ab² + ab² + b³.
 * If we simplify it, adding like-terms, it becomes: a³ + 3a²b + 3ab² + b³.
 * This is exactly the mathematical formula for (a + b)³.
 * Therefore, instead of making multiple multiplications, we can just calculate (a + b) cubed.
 * 
 * Optimized Code:
 * 
 * public static long evaluateEquationOptimized(int a, int b) {
 *     long sum = (long)a + b;
 *     // Multiply sum by itself 3 times to get (a + b)³
 *     return sum * sum * sum;
 * }
 */
