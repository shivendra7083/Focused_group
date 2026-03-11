/**
 * Question 13: Merge Intervals
 *
 * Problem: Given a collection of intervals, merge all overlapping intervals.
 * Input: Intervals: [[1,3],[2,6],[8,10],[15,18]]
 * Output: [[1,6],[8,10],[15,18]]
 * Explanation: Intervals [1,3] and [2,6] overlap, so they are merged into [1,6].
 *
 * Beginner Friendly Solution Approach:
 * 1. An interval overlaps with another if the starting point of the second interval 
 *    is less than or equal to the ending point of the first interval.
 * 2. In order for this to work elegantly, we must sort the intervals by starting time first.
 * 3. Then we start with a "current interval". We check the next interval. 
 *    If it overlaps, we merge them by extending the "current interval's" end point. 
 *    If it doesn't overlap, we log the "current interval" and move on to the next.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Qs13_MergeIntervals {
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        
        // We use Arrays.sort to sort based on starting values
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        List<int[]> merged = new ArrayList<>();
        
        int[] currentInterval = intervals[0];
        merged.add(currentInterval); // push earliest into list to manipulate by reference
        
        for (int[] interval : intervals) {
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];
            
            if (currentEnd >= nextStart) { 
                // Overlapping! Merge them by taking maximum of both ends.
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                // Non-overlapping! Simply add the new interval and shift focus to it
                currentInterval = interval;
                merged.add(currentInterval);
            }
        }
        
        System.out.print("Output: [");
        for (int i = 0; i < merged.size(); i++) {
            System.out.print(Arrays.toString(merged.get(i)));
            if (i < merged.size() - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}

/* 
 * ==========================================
 * OPTIMIZED APPROACH AND CODE
 * ==========================================
 * Optimized Approach:
 * Given that sorting the intervals requires O(N log N) time mathematically, the 
 * time complexity cannot fall below O(N log N). Space complexity stands at O(N) since 
 * we must store merged items. The beginner code is already technically highly optimal 
 * in its design framework.
 * 
 * Optimized Code (Method Extraction for Direct Returns):
 * 
 * public static int[][] mergeOptimized(int[][] intervals) {
 *     if(intervals.length <= 1) return intervals;
 *     Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
 *     
 *     List<int[]> result = new ArrayList<>();
 *     int[] newInterval = intervals[0];
 *     result.add(newInterval);
 *     
 *     for (int[] interval : intervals) {
 *         // if intervals overlap, update end point if needed
 *         if (interval[0] <= newInterval[1]) 
 *             newInterval[1] = Math.max(newInterval[1], interval[1]);
 *         else {
 *             newInterval = interval;
 *             result.add(newInterval);
 *         }
 *     }
 *     return result.toArray(new int[result.size()][]);
 * }
 */
