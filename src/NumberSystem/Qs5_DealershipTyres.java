/**
 * Question 5: Dealership Tyres calculation
 * 
 * Problem: 
 * A function is there which tells how many dealerships there are and the total number 
 * of cars and bikes in each dealership. Your job is to calculate how many tyres would be there 
 * in each dealership.
 * 
 * Beginner Friendly Solution Approach:
 * 1. Read the number of dealerships (N).
 * 2. For each dealership, we need to read the number of cars and bikes.
 * 3. We know that 1 car = 4 tyres, and 1 bike = 2 tyres.
 * 4. We multiply cars by 4 and bikes by 2, and add them together: (cars * 4) + (bikes * 2).
 * 5. Print the calculated wheels for each dealership.
 */
import java.util.Scanner;

public class Qs5_DealershipTyres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt(); // number of dealerships
        
        // Loop through each dealership one by one
        for (int i = 0; i < n; i++) {
            int cars = scanner.nextInt();
            int bikes = scanner.nextInt();
            
            // Calculate total tyres 
            int totalTyres = (cars * 4) + (bikes * 2);
            
            // Output the tyres for current dealership
            System.out.println(totalTyres);
        }
        
        scanner.close();
    }
}

/* 
 * ==========================================
 * OPTIMIZED APPROACH AND CODE
 * ==========================================
 * Optimized Approach:
 * The time complexity here is O(N) and space complexity is O(1), which is already perfectly optimal 
 * since we must evaluate each dealership at least once. 
 * The only "optimization" possible is speeding up Input/Output operations by using 
 * BufferedReader and StringBuilder instead of Scanner and System.out.println, which is highly 
 * recommended in Competitive Programming for massive inputs.
 * 
 * Optimized Code:
 * 
 * import java.io.BufferedReader;
 * import java.io.InputStreamReader;
 * import java.io.IOException;
 * import java.util.StringTokenizer;
 * 
 * public class Qs5_DealershipTyresOptimized {
 *     public static void main(String[] args) throws IOException {
 *         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *         int n = Integer.parseInt(br.readLine().trim());
 *         StringBuilder sb = new StringBuilder();
 *         
 *         for (int i = 0; i < n; i++) {
 *             StringTokenizer st = new StringTokenizer(br.readLine());
 *             int cars = Integer.parseInt(st.nextToken());
 *             int bikes = Integer.parseInt(st.nextToken());
 *             
 *             int total = (cars * 4) + (bikes * 2);
 *             sb.append(total).append("\\n");
 *         }
 *         System.out.print(sb.toString()); // Print all output at once
 *     }
 * }
 */
