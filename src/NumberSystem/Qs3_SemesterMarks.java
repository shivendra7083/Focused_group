/**
 * Question 3: Maximum Marks in each Semester
 * 
 * Problem: Raj wants to know the maximum marks scored by him in each semester. 
 * The mark should be between 0 to 100; if it goes beyond the range display "You have entered invalid mark."
 * 
 * Beginner Friendly Solution Approach:
 * 1. Capture the number of semesters.
 * 2. Store the number of subjects for each semester in an array.
 * 3. Create a 2D array to hold all the marks for each semester.
 * 4. Read the marks. Check if each mark is between 0 and 100. If not, print invalid mark and stop.
 * 5. Loop through the 2D array of marks to find out the highest mark for each semester.
 * 6. Print the result.
 */
import java.util.Scanner;

public class Qs3_SemesterMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter no of semester: ");
        int noOfSemesters = scanner.nextInt();
        
        // Array to store the number of subjects in each semester
        int[] subjectsInSemester = new int[noOfSemesters];
        for (int i = 0; i < noOfSemesters; i++) {
            System.out.print("Enter no of subjects in " + (i + 1) + " semester: ");
            subjectsInSemester[i] = scanner.nextInt();
        }
        
        // 2D Array to store all the marks globally (Beginner Friendly)
        int[][] allMarks = new int[noOfSemesters][];
        
        // Read marks for each semester
        for (int i = 0; i < noOfSemesters; i++) {
            System.out.print("Marks obtained in semester " + (i + 1) + ": ");
            allMarks[i] = new int[subjectsInSemester[i]]; // create space for subjects
            
            for (int j = 0; j < subjectsInSemester[i]; j++) {
                int mark = scanner.nextInt();
                
                // Validation for valid mark
                if (mark < 0 || mark > 100) {
                    System.out.println("You have entered invalid mark.");
                    scanner.close();
                    return; // Stop the program 
                }
                
                allMarks[i][j] = mark; // Store in array
            }
        }
        
        // Find and print maximum marks for each semester
        for (int i = 0; i < noOfSemesters; i++) {
            int maxMark = -1;
            // Iterate over stored marks to find the max
            for (int j = 0; j < allMarks[i].length; j++) {
                if (allMarks[i][j] > maxMark) {
                    maxMark = allMarks[i][j];
                }
            }
            System.out.println("Maximum mark in " + (i + 1) + " semester: " + maxMark);
        }
        
        scanner.close();
    }
}

/* 
 * ==========================================
 * OPTIMIZED APPROACH AND CODE
 * ==========================================
 * Optimized Approach:
 * Instead of storing all the marks in a 2D array and taking extra memory (Space Complexity: O(N*M)), 
 * we can calculate the maximum mark on the fly as we read the input. This reduces the space 
 * complexity strictly to O(1) beyond simply storing the number of semesters.
 * 
 * Optimized Code (Space Complexity: O(N) only for subjects array):
 * 
 * public static void optimizedMain(String[] args) {
 *     Scanner sc = new Scanner(System.in);
 *     int sems = sc.nextInt();
 *     int[] subjs = new int[sems];
 *     for(int i=0; i<sems; i++) subjs[i] = sc.nextInt();
 *     
 *     int[] maxMarks = new int[sems];
 *     for(int i=0; i<sems; i++) {
 *         int max = -1;
 *         for(int j=0; j<subjs[i]; j++) {
 *             int mark = sc.nextInt();
 *             if(mark < 0 || mark > 100) {
 *                 System.out.println("You have entered invalid mark.");
 *                 return;
 *             }
 *             if(mark > max) max = mark;
 *         }
 *         maxMarks[i] = max;
 *     }
 *     for(int i=0; i<sems; i++) {
 *         System.out.println("Maximum mark in " + (i+1) + " semester: " + maxMarks[i]);
 *     }
 * }
 */
