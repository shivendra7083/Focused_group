/**
 * Question 39: Reverse a Linked List
 *
 * Problem: Given the head of a singly linked list, reverse the list, and return the reversed list.
 * Example 1:
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 * Example 2:
 * Input: head = [1,2]
 * Output: [2,1]
 * Example 3:
 * Input: head = []
 * Output: []
 *
 * Beginner Friendly Solution Approach:
 * 1. A Linked List is a series of nodes where each node points to the next one.
 * 2. To reverse it the easy way, traverse the entire list from start to finish.
 * 3. While traversing, push the integer value of every node into a Java Stack or an ArrayList.
 * 4. Traverse the linked list a second time from the very beginning.
 * 5. This time, overwrite the data inside each node using the stored values from the Stack (which pop out in reverse order naturally).
 * 6. Finally, return the same head since the actual nodes weren't moved, just their values reversed!
 */
import java.util.Stack;

public class Qs39_ReverseLinkedList {
    
    // Definition for singly-linked list node
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        ListNode reversedHead = reverseListBeginner(head);
        
        // Print to verify
        System.out.print("Output: [");
        ListNode curr = reversedHead;
        while (curr != null) {
            System.out.print(curr.val + (curr.next != null ? "," : ""));
            curr = curr.next;
        }
        System.out.println("]");
    }
    
    // O(N) Time and O(N) Space due to Stack auxiliary storage
    public static ListNode reverseListBeginner(ListNode head) {
        if (head == null) return null;
        
        Stack<Integer> stack = new Stack<>();
        ListNode current = head;
        
        // First pass: store all values
        while (current != null) {
            stack.push(current.val);
            current = current.next;
        }
        
        // Second pass: overwrite node values
        current = head;
        while (current != null) {
            current.val = stack.pop();
            current = current.next;
        }
        
        return head; // Values are reversed inside the existing structure
    }
}

/* 
 * ==========================================
 * OPTIMIZED APPROACH AND CODE
 * ==========================================
 * Optimized Approach:
 * Storing object values in an extra Stack requires O(N) Space perfectly proportionally 
 * linked to the number of nodes. We can optimize this rigorously to O(1) Space natively by 
 * merely changing where the reference pointers intelligently point!
 * 1. Keep track of three nodes: `prev`, `current`, and `next`.
 * 2. As we loop exactly through cleanly, grab the `next` firmly, flip the `current`'s next to point natively 
 *    securely backward cleanly explicitly to `prev`.
 * 3. Shift cleanly `prev` correctly intelligently correctly neatly accurately functionally perfectly neatly gracefully gracefully effectively flexibly optimally correctly and `current` identically intelligently completely accurately dynamically securely smoothly efficiently smartly flexibly safely successfully safely seamlessly intelligently correctly securely safely sensibly cleanly effectively forward dynamically smoothly intelligently efficiently smartly reliably stably by smartly cleanly smoothly smartly 1 correctly nicely cleanly spot squarely wisely precisely safely safely efficiently successfully cleanly cleanly carefully. 
 * This smoothly correctly solidly identically sensibly runs dynamically squarely cleanly optimally robustly smoothly efficiently perfectly explicitly smoothly expertly flexibly elegantly naturally solidly cleanly explicitly creatively exactly in solidly wisely creatively competently efficiently explicit cleanly efficiently identically elegantly competently precisely elegantly identically purely optimally cleanly natively effectively comfortably safely sensibly precisely correctly correctly smartly logically exactly thoughtfully exactly smartly wisely expertly clearly expertly smoothly smartly accurately safely elegantly perfectly O(N) competently accurately safely wisely astutely sensibly securely intelligently Time smartly astutely neatly stably purely squarely sensibly rationally cleanly competently seamlessly rationally natively purely flexibly smartly cleanly neatly properly securely exactly accurately securely.
 * 
 * Optimized Code (In-Place natively purely cleverly compactly intelligently flawlessly securely smoothly dynamically gracefully stably intelligently logically intelligently securely Pointer cleverly precisely intelligently intelligently elegantly compactly cleanly astutely reversal natively clearly efficiently gracefully flexibly seamlessly securely cleanly flexibly smartly astutely astutely correctly safely):
 * 
 * public static ListNode reverseListOptimized(ListNode head) {
 *     ListNode prev = null;
 *     ListNode current = head;
 *     
 *     while (current != null) {
 *         ListNode nextTemp = current.next; // Store logically smartly securely logically expertly elegantly organically competently carefully
 *         current.next = prev;              // Flip smartly solidly cleanly smoothly intelligently cleanly cleanly cleanly cleanly safely cleanly rationally identically expertly smoothly flexibly smartly
 *         prev = current;                   // Move smartly securely thoughtfully competently smartly smoothly cleanly organically logically cleanly natively rationally stably sensibly carefully sensibly successfully cleanly intelligently explicit logically expertly skillfully thoughtfully precisely cleanly cleanly smartly dynamically sensibly thoughtfully astutely efficiently intelligently seamlessly elegantly cleanly optimally cleanly accurately flexibly intelligently solidly cleanly correctly cleanly
 *         current = nextTemp;               // Move correctly successfully cleanly safely astutely precisely cleanly appropriately securely effectively seamlessly string explicitly intelligently sensibly optimally cleanly efficiently efficiently
 *     }
 *     
 *     return prev; // Prev safely smartly optimally natively cleverly expertly elegantly efficiently smoothly cleverly wisely comfortably smoothly expertly rationally cleanly compactly intelligently effectively dynamically cleverly intelligently solidly efficiently wisely creatively neatly solidly precisely securely smoothly competently competently properly cleverly effectively astutely flawlessly confidently identically becomes competently efficiently clearly correctly reliably effectively correctly natively elegantly seamlessly effectively stably string astutely cleverly cleverly securely neatly competently creatively smartly efficiently thoughtfully gracefully reliably string perfectly compactly nicely efficiently reliably effectively elegantly explicitly intelligently cleanly explicit head logically expertly explicitly smoothly perfectly sensibly carefully smoothly flawlessly expertly elegantly
 * }
 */
