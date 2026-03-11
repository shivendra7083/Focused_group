/**
 * Question 6: Minimum Discount Offer
 * 
 * Problem: Mayuri buys "N" no of products from a shop. She wants to know the item 
 * that has the minimum discount offer so she can avoid buying it.
 * 
 * Beginner Friendly Solution Approach:
 * 1. Read N indicating the number of items.
 * 2. Use arrays to store all item names, prices, and discount percentages.
 * 3. Loop over the items, split the string by comma to get its parts.
 * 4. Calculate the literal discount amount for each: (price * discountPercentage) / 100.
 * 5. Loop through the calculated discounts to find the minimal value.
 * 6. Print the corresponding item(s) name(s).
 */
import java.util.Scanner;

public class Qs6_MinimumDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read number of items
        int n = Integer.parseInt(scanner.nextLine().trim());
        
        // Arrays to hold item data
        String[] itemNames = new String[n];
        int[] discountAmounts = new int[n];
        
        // Step 1: Read inputs and calculate discounts
        for (int i = 0; i < n; i++) {
            String inputLine = scanner.nextLine();
            
            // Split the input line by comma
            String[] parts = inputLine.split(",");
            if (parts.length == 3) {
                itemNames[i] = parts[0].trim();
                int price = Integer.parseInt(parts[1].trim());
                int discountPercentage = Integer.parseInt(parts[2].trim());
                
                // Calculate absolute discount amount
                discountAmounts[i] = (price * discountPercentage) / 100;
            }
        }
        
        // Step 2: Find the minimum discount value
        int minDiscount = discountAmounts[0];
        for (int i = 1; i < n; i++) {
            if (discountAmounts[i] < minDiscount) {
                minDiscount = discountAmounts[i];
            }
        }
        
        // Step 3: Find all items matching the minimum discount
        String result = "";
        for (int i = 0; i < n; i++) {
            if (discountAmounts[i] == minDiscount) {
                if (result.equals("")) {
                    result = itemNames[i];
                } else {
                    result += ", " + itemNames[i];
                }
            }
        }
        
        // Output result
        System.out.println(result);
        
        scanner.close();
    }
}

/* 
 * ==========================================
 * OPTIMIZED APPROACH AND CODE
 * ==========================================
 * Optimized Approach:
 * Instead of taking O(N) extra space for arrays and iterating over the data three times, 
 * we can calculate the minimum on the fly while taking input. Time Complexity strictly 
 * becomes O(N) single-pass with O(1) space complexity or slightly more for the result string.
 * 
 * Optimized Code (Space Complexity: O(1) mostly):
 * 
 * public static void mainOptimized(String[] args) {
 *     Scanner sc = new Scanner(System.in);
 *     int n = Integer.parseInt(sc.nextLine().trim());
 *     int minDis = Integer.MAX_VALUE;
 *     StringBuilder res = new StringBuilder();
 *     
 *     for (int i = 0; i < n; i++) {
 *         String[] parts = sc.nextLine().split(",");
 *         String name = parts[0].trim();
 *         int price = Integer.parseInt(parts[1].trim());
 *         int pct = Integer.parseInt(parts[2].trim());
 *         
 *         int currentDis = (price * pct) / 100;
 *         
 *         if (currentDis < minDis) {
 *             minDis = currentDis;
 *             res = new StringBuilder(name); // Found a new minimum, clear preceding string
 *         } else if (currentDis == minDis) {
 *             res.append(", ").append(name); // Same minimum, append name
 *         }
 *     }
 *     System.out.println(res.toString());
 * }
 */
