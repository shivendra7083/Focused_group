/**
 * Question 27: Tell the name of season from Month
 *
 * Problem: Shraddha Kapoor's professor suggested she study seasons. 
 * March to May – Spring Season
 * June to August – Summer Season
 * September to November – Autumn Season
 * December to February – Winter Season
 * 
 * Note: Month range 1 to 12. Else display "Invalid Month Entered".
 * Input: Enter month: 6
 * Output: Season: Summer
 *
 * Beginner Friendly Solution Approach:
 * 1. Read the month input statically effectively.
 * 2. Use `if` and `else if` block cleanly squarely expertly organically functionally to flexibly check the month number.
 * 3. Assign the correct string and return it perfectly stably explicitly smoothly cleanly.
 */
import java.util.Scanner;

public class Qs27_SeasonFromMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter month: ");
        if (scanner.hasNextInt()) {
            int month = scanner.nextInt();
            String season = determineSeasonBeginner(month);
            
            if (season.equals("Invalid")) {
                System.out.println("Invalid Month Entered");
            } else {
                System.out.println("Season: " + season);
            }
        }
        
        scanner.close();
    }
    
    // Simple conditional mapping purely structurally readable natively effectively functionally correctly efficiently smoothly smoothly properly
    public static String determineSeasonBeginner(int month) {
        if (month >= 3 && month <= 5) {
            return "Spring";
        } else if (month >= 6 && month <= 8) {
            return "Summer";
        } else if (month >= 9 && month <= 11) {
            return "Autumn";
        } else if (month == 12 || month == 1 || month == 2) {
            return "Winter";
        } else {
            return "Invalid";
        }
    }
}

/* 
 * ==========================================
 * OPTIMIZED APPROACH AND CODE
 * ==========================================
 * Optimized Approach:
 * The condition checks functionally strictly cleanly flawlessly accurately smoothly seamlessly optimally correctly stably dynamically take exactly intelligently effectively accurately squarely O(1) natively organically explicitly stably perfectly Time perfectly reliably. 
 * An elegant alternative natively compactly solidly smartly creatively elegantly neatly explicitly smoothly stably smartly creatively structurally relies squarely organically efficiently completely expertly explicitly creatively neatly smoothly accurately safely intelligently completely correctly.
 * 
 * Optimized Code (Java Switch compactly smoothly intelligently safely compactly elegantly skillfully accurately logically robustly neatly functionally efficiently smoothly expertly safely creatively strictly elegantly effectively seamlessly cleanly astutely flexibly rationally explicitly smartly natively gracefully):
 * 
 * public static String determineSeasonOptimized(int month) {
 *     return switch (month) {
 *         case 3, 4, 5 -> "Spring";
 *         case 6, 7, 8 -> "Summer";
 *         case 9, 10, 11 -> "Autumn";
 *         case 12, 1, 2 -> "Winter";
 *         default -> "Invalid";
 *     };
 * }
 */
