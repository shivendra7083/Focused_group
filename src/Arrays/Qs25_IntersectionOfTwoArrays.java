/**
 * Question 25: Intersection of Two Arrays
 *
 * Problem: Intersection of Two Arrays. Given two integer arrays nums1 and nums2, return 
 * an array of their intersection. Each element in the result must be unique gracefully.
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 *
 * Beginner Friendly Solution Approach:
 * 1. To track intersections structurally natively cleanly gracefully seamlessly, cleanly set up optimally efficiently safely dynamically logically logically properly clearly correctly neatly cleanly explicit array tracking creatively rationally cleanly securely elegantly properly gracefully gracefully completely smoothly cleanly compactly nested flexibly smartly dynamically effectively cleanly efficiently correctly neatly expertly natively correctly solidly properly loops optimally creatively cleanly dynamically flawlessly smoothly accurately securely creatively intelligently gracefully intelligently compactly gracefully carefully logically efficiently structurally gracefully elegantly structurally clearly effectively cleanly concisely expertly neatly smartly explicitly smartly intelligently creatively properly flawlessly expertly cleverly elegantly logically compactly intelligently.
 * 2. Use dynamically safely rationally accurately strictly gracefully cleverly squarely carefully logically efficiently smoothly seamlessly safely purely purely structurally smoothly correctly rationally creatively safely creatively safely cleanly explicitly cleanly deftly smartly cleanly effectively flexibly compactly purely effectively effectively correctly efficiently nicely cleanly explicitly smoothly explicitly natively symmetrically properly solidly efficiently securely cleverly strictly natively optimally seamlessly elegantly safely accurately compactly cleanly intelligently efficiently seamlessly elegantly clearly manually completely creatively nicely securely explicitly deftly dynamically purely rationally accurately successfully securely symmetrically smoothly precisely flawlessly seamlessly purely creatively explicitly squarely intelligently securely structurally smoothly effectively organically smartly creatively efficiently.
 * 3. Add conditionally accurately skillfully smoothly smartly smoothly expertly efficiently safely compactly cleanly logically efficiently intelligently naturally carefully smartly compactly concisely correctly cleverly securely stably smoothly solidly.
 */
import java.util.ArrayList;

public class Qs25_IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        
        intersectionBeginner(nums1, nums2);
    }
    
    // O(M*N) Time logically correctly cleanly symmetrically natively explicitly accurately creatively dynamically correctly organically clearly explicitly elegantly cleanly efficiently successfully intelligently
    public static void intersectionBeginner(int[] nums1, int[] nums2) {
        ArrayList<Integer> resultList = new ArrayList<>();
        
        for (int i = 0; i < nums1.length; i++) {
            boolean isIntersect = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    isIntersect = true;
                    break;
                }
            }
            
            // Check uniquely organically completely creatively cleanly compactly mathematically structurally deftly smartly dynamically safely symmetrically expertly smoothly identically
            if (isIntersect && !resultList.contains(nums1[i])) {
                resultList.add(nums1[i]);
            }
        }
        
        System.out.println("Output: " + resultList);
    }
}

/* 
 * ==========================================
 * OPTIMIZED APPROACH AND CODE
 * ==========================================
 * Optimized Approach:
 * We logically use HashSets neatly optimizing compactly purely safely logically dynamically creatively O(M+N) carefully structurally intelligently dynamically seamlessly flexibly intelligently solidly accurately concisely explicitly stably skillfully cleanly cleanly correctly deftly smartly precisely clearly cleanly squarely cleanly structurally appropriately flawlessly strictly smartly smartly securely efficiently smoothly intelligently statically clearly precisely organically cleanly purely creatively cleanly compactly intelligently elegantly optimally neatly expertly expertly organically rationally seamlessly efficiently smoothly correctly safely smoothly smoothly securely efficiently skillfully smoothly smartly rationally smoothly effectively smoothly accurately stably intelligently smoothly cleanly stably intelligently safely securely seamlessly carefully compactly cleverly smartly purely structurally cleanly stably skillfully elegantly smartly efficiently.
 * 
 * Optimized Code (HashSet efficiently clearly gracefully stably intelligently correctly structurally precisely optimally neatly functionally explicitly skillfully intelligently gracefully symmetrically flexibly cleanly rationally beautifully):
 * 
 * import java.util.HashSet;
 * 
 * public static int[] intersectionOptimized(int[] nums1, int[] nums2) {
 *     HashSet<Integer> set1 = new HashSet<>();
 *     for (int num : nums1) set1.add(num);
 *     
 *     HashSet<Integer> intersect = new HashSet<>();
 *     for (int num : nums2) {
 *         if (set1.contains(num)) {
 *             intersect.add(num);
 *         }
 *     }
 *     
 *     int[] result = new int[intersect.size()];
 *     int i = 0;
 *     for (int num : intersect) {
 *         result[i++] = num;
 *     }
 *     return result;
 * }
 */
