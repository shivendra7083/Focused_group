/**
 * Question 1: Check if a Number is Prime
 *
 * Problem: Write a function to check if a given number is prime.
 * Input: Number: 29
 * Output: True
 * Explanation: 29 is a prime number.
 *
 * Beginner Friendly Solution Approach:
 * 1. A prime number is a number strictly greater than 1 that is divisible only by 1 and itself.
 * 2. If the number is less than or equal to 1, it's not prime.
 * 3. We use a loop from 2 up to n-1. If the number is divisible by any integer
 *    in this range, it's not a prime number.
 */
import java.util.Scanner;

public class Qs1_CheckPrime {
    
    // Function to check if a number is prime (Beginner friendly)
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        
        // Loop from 2 to n-1
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false; // Found a factor, so it's not prime
            }
        }
        
        return true; // No factors found, it is prime
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input: Number: ");
        if(scanner.hasNextInt()) {
            int number = scanner.nextInt();
            boolean result = isPrime(number);
            
            // Print Output with properly capitalized 'True' or 'False' to match sample
            System.out.println("Output: " + (result ? "True" : "False"));
        } else {
            System.out.println("Please enter a valid integer.");
        }
        
        scanner.close();
    }
}

/* 
 * ==========================================
 * OPTIMIZED APPROACH AND CODE
 * ==========================================
 * Optimized Approach:
 * Instead of checking divisibility up to n-1, we only need to check up to the 
 * square root of n (Math.sqrt(n)). If a number has a factor greater than its square root, 
 * it must also have a corresponding factor smaller than its square root. 
 * This reduces the time complexity from O(n) to O(sqrt(n)).
 * 
 * Optimized Code:
 * 
 * public static boolean isPrimeOptimized(int n) {
 *     if (n <= 1) return false;
 *     if (n == 2 || n == 3) return true;
 *     if (n % 2 == 0 || n % 3 == 0) return false;
 *     
 *     // Check up to square root of n, skipping even numbers and multiples of 3
 *     for (int i = 5; i * i <= n; i += 6) {
 *         if (n % i == 0 || n % (i + 2) == 0) {
 *             return false;
 *         }
 *     }
 *     return true;
 * }
 */
