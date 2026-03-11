/**
 * Question 10: Integer Frequency
 *
 * Problem: You’re given an array of integers, print the number of times each integer 
 * has occurred in the array.
 * Input: 10
 *        1 2 3 3 4 1 4 5 1 2
 * Output:
 * 1 occurs 3 times
 * 2 occurs 2 times
 * 3 occurs 2 times
 * 4 occurs 2 times
 * 5 occurs 1 times
 *
 * Beginner Friendly Solution Approach:
 * 1. Keep track of counted elements using a boolean array so we don't recount the same elements.
 * 2. Pick an element from the start and set up an inner loop to scan the entire array.
 * 3. Every time we encounter the same element, increment a count.
 * 4. Print the result and mark the positions as visited.
 */
import java.util.Scanner;

public class Qs10_IntegerFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Wait for Input:");
        if (!scanner.hasNextInt()) return;
        
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        boolean[] visited = new boolean[n];
        
        // Loop through each element
        for (int i = 0; i < n; i++) {
            // If already visited, skip
            if (visited[i]) {
                continue;
            }
            
            // Count frequencies
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " occurs " + count + " times");
        }
        
        scanner.close();
    }
}

/* 
 * ==========================================
 * OPTIMIZED APPROACH AND CODE
 * ==========================================
 * Optimized Approach:
 * The beginner nested loop format has an O(N^2) Time Complexity, which can cause 
 * TLE natively. The optimized way is using a HashMap to store the frequencies in a single 
 * sweep taking O(N) Time and O(N) Space. If order of output must be consistent with 
 * first occurrences, a LinkedHashMap is used. 
 * Alternatively, sorting first allows O(N log N) counting with O(1) space.
 * 
 * Optimized Code (Using HashMap for O(N) time):
 * 
 * import java.util.LinkedHashMap;
 * import java.util.Map;
 * 
 * public static void countFrequenciesOptimized(int[] arr) {
 *     Map<Integer, Integer> freqMap = new LinkedHashMap<>();
 *     for (int num : arr) {
 *         freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
 *     }
 *     
 *     for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
 *         System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
 *     }
 * }
 */
