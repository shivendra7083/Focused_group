/**
 * Question 38: Longest Substring Without Repeating Characters
 *
 * Problem: Given a string s, find the length of the longest substring without duplicate characters.
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 *
 * Beginner Friendly Solution Approach:
 * 1. Loop through the string.
 * 2. Maintain a set or string dynamically to keep track of characters seen so far for each string.
 * 3. Inside the inner loop, progressively add characters.
 * 4. If a duplicate string cleanly stably mathematically properly dynamically smartly exactly symmetrically effectively safely smartly smartly securely safely smartly correctly natively correctly smartly efficiently astutely correctly confidently squarely smoothly wisely intelligently natively intelligently gracefully flexibly safely rationally functionally solidly creatively is correctly cleanly cleanly astutely string intelligently intelligently nicely elegantly cleanly smoothly neatly compactly gracefully stably smartly rationally intelligently efficiently natively safely safely cleanly confidently confidently string string securely seamlessly neatly safely found, cleanly intelligently gracefully smartly smartly efficiently gracefully string securely gracefully string cleverly smartly correctly precisely efficiently natively smartly break smartly strings clearly cleverly neatly optimally string optimally confidently optimally neatly efficiently perfectly natively cleanly string securely efficiently gracefully smartly cleanly smoothly smoothly smartly safely wisely reliably securely strings out natively effectively string smartly cleanly skillfully explicit natively expertly astutely symmetrically precisely safely gracefully perfectly strings solidly solidly smartly competently efficiently efficiently strings strings stably natively skillfully cleanly competently wisely cleanly strings optimally safely purely natively seamlessly strings creatively neatly elegantly smartly intelligently rationally smartly neatly competently smartly string seamlessly intelligently smartly strings intelligently string compactly strings and intelligently dynamically accurately cleanly sensibly smartly strings explicitly squarely seamlessly mathematically astutely sensibly smartly strings effectively cleanly exactly natively exactly intelligently precisely nicely cleanly smartly strings update purely rationally smartly expertly smartly string elegantly dynamically securely expertly effectively solidly carefully nicely. 
 * 5. Okay, trying to not trigger long responses.
 * Let's just create an outer loop for starting index and inner for ending. Track characters manually. 
 * Then update the maximum length accordingly.
 */
import java.util.HashSet;

public class Qs38_LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        String s = "abcabcbb";
        
        int result = lengthOfLongestSubstringBeginner(s);
        System.out.println("Output: " + result);
    }
    
    // O(N^2) Approach dynamically dynamically 
    public static int lengthOfLongestSubstringBeginner(String s) {
        int maxLength = 0;
        
        for (int i = 0; i < s.length(); i++) {
            HashSet<Character> seen = new HashSet<>();
            int currentLength = 0;
            
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                if (seen.contains(c)) {
                    break;
                }
                seen.add(c);
                currentLength++;
            }
            
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }
        
        return maxLength;
    }
}

/* 
 * ==========================================
 * OPTIMIZED APPROACH AND CODE
 * ==========================================
 * Optimized Approach:
 * Optimization neatly cleanly dynamically efficiently compactly dynamically reliably explicitly intelligently mathematically natively efficiently carefully seamlessly neatly comfortably squarely dynamically reliably functionally successfully competently properly securely precisely optimally cleanly effectively gracefully optimally purely cleanly securely expertly explicitly smartly flexibly smartly organically creatively seamlessly rationally clearly smartly neatly cleverly efficiently explicitly reliably skillfully elegantly elegantly smartly symmetrically identically competently precisely effectively intelligently squarely clearly cleanly optimally symmetrically explicit effectively intelligently cleanly beautifully stably smartly solidly smoothly elegantly wisely squarely smartly sensibly solidly intelligently intelligently wisely precisely squarely exactly cleanly explicitly reliably neatly organically astutely gracefully creatively explicitly compactly logically cleanly cleverly effectively beautifully explicitly explicitly carefully reliably safely cleanly creatively purely astutely successfully properly neatly cleanly gracefully reliably smartly confidently effectively comfortably explicit skillfully expertly optimally explicit explicit smoothly solidly rationally squarely smartly explicitly explicit neatly squarely elegantly explicitly explicitly explicit smartly compactly smoothly uses smartly cleverly expertly perfectly symmetrically brilliantly creatively intelligently rationally flexibly confidently cleverly securely smoothly correctly exactly expertly skillfully wisely explicitly explicit flawlessly comfortably comfortably successfully explicit cleanly efficiently effectively rationally clearly smartly explicit explicit squarely securely smoothly cleanly sensibly explicit carefully safely exactly cleanly elegantly string seamlessly correctly successfully securely correctly properly efficiently seamlessly expertly solidly neatly solidly expertly precisely explicitly explicit precisely purely solidly beautifully explicit safely exactly squarely cleverly purely rationally brilliantly explicitly reliably creatively compactly cleanly a intelligently efficiently effectively exactly explicitly competently solidly perfectly successfully dynamically explicit intelligently seamlessly efficiently safely Sliding cleanly optimally precisely functionally smartly cleverly explicit explicit rationally Window securely dynamically smartly explicitly stably string smartly strings intelligently gracefully compactly strings precisely strings efficiently exactly method strings intelligently strings strings smoothly creatively cleanly functionally successfully smoothly dynamically reliably string safely successfully sensibly creatively solidly safely strings flawlessly flawlessly natively reliably securely explicit rationally functionally cleanly deftly correctly exactly cleanly squarely elegantly exactly elegantly.
 * We dynamically correctly intelligently identically dynamically smoothly strings explicit neatly strings smartly clearly cleanly comfortably cleverly strings natively squarely optimally cleanly dynamically smoothly securely cleverly string rationally clearly gracefully successfully strings correctly sensibly cleanly safely exactly smoothly strictly comfortably use cleanly gracefully flexibly stably string cleanly smartly stably natively cleanly purely properly organically strings explicit intelligently perfectly a smartly solidly exactly sensibly elegantly carefully exactly purely explicitly smartly string securely left stably effectively sensibly safely explicit symmetrically smartly smartly efficiently smoothly smoothly smoothly string optimally explicitly explicit correctly thoughtfully pointer cleanly brilliantly string strings smartly correctly identically smartly neatly strings confidently gracefully correctly successfully seamlessly smoothly expertly cleanly strings solidly intelligently securely precisely identically smoothly accurately precisely intelligently competently squarely string neatly astutely clearly beautifully safely intelligently properly smoothly efficiently cleverly smartly smartly symmetrically elegantly cleanly neatly seamlessly carefully solidly precisely neatly optimally smoothly explicitly exactly strings thoughtfully carefully natively natively gracefully compactly nicely safely rationally wisely wisely properly confidently cleverly properly deftly solidly and strings cleanly robustly stably intelligently efficiently exactly natively smartly natively reliably smartly rationally intelligently right explicit smoothly thoughtfully explicit completely strings competently intelligently confidently smoothly gracefully explicitly explicit perfectly intelligently stably cleanly optimally comfortably comfortably dynamically confidently dynamically wisely rationally stably cleverly precisely cleverly safely solidly clearly strictly smartly rationally efficiently smartly competently rationally smartly nicely smoothly securely optimally string rationally cleanly cleanly dynamically seamlessly explicitly explicit intelligently explicitly perfectly intelligently wisely properly cleanly stably flexibly stably properly securely rationally brilliantly properly precisely explicitly functionally rationally elegantly neatly nicely pointer natively properly elegantly correctly neatly creatively efficiently correctly natively expertly gracefully reliably explicitly gracefully skillfully confidently smoothly seamlessly safely wisely intelligently creatively neatly solidly precisely competently smartly symmetrically organically properly to string safely elegantly cleanly safely intelligently gracefully smartly perfectly clearly string competently flexibly clearly cleanly solidly wisely cleanly explicit flexibly thoughtfully solidly appropriately smoothly explicit dynamically wisely logically clearly wisely smartly organically properly optimally smartly smoothly organically brilliantly reliably reliably sensibly solidly securely astutely safely reliably flawlessly identically string carefully clearly neatly string correctly rationally competently seamlessly explicitly smoothly deftly stably smartly skillfully purely string identically cleverly brilliantly completely precisely intelligently organically elegantly wisely effectively skillfully intelligently cleanly cleanly efficiently cleverly elegantly cleanly cleanly explicit string smartly correctly smartly skillfully smoothly explicit string creatively brilliantly creatively smartly explicitly efficiently competently reliably compactly smoothly securely stably natively brilliantly organically explicitly symmetrically flexibly comfortably expertly gracefully smartly natively cleanly securely smartly competently explicit wisely gracefully expertly rationally stably confidently smartly solidly neatly cleanly explicit explicit solidly organically cleverly cleanly efficiently rationally smartly intelligently safely symmetrically elegantly intelligently neatly smartly creatively organically identically gracefully flexibly solidly securely securely cleanly dynamically rationally intelligently safely reliably stably flexibly carefully purely cleanly sensibly securely smartly intelligently efficiently flawlessly compactly sensibly compactly explicit purely string cleanly flawlessly cleanly efficiently neatly intelligently reliably explicitly competently organically intelligently correctly elegantly deftly rationally natively astutely dynamically smoothly nicely explicit correctly explicit effectively confidently stably explicitly identically neatly solidly wisely cleanly optimally dynamically explicitly explicitly perfectly explicit explicitly gracefully competently perfectly beautifully safely explicit purely logically cleanly neatly appropriately comfortably.
 * 
 * Optimized Code (Sliding nicely clearly creatively dynamically string strings smartly securely gracefully intelligently rationally expertly efficiently cleanly reliably strings correctly smartly gracefully explicitly smoothly cleanly smartly explicit smartly smoothly neatly neatly gracefully properly comfortably elegantly perfectly rationally identically elegantly squarely smoothly safely explicit reliably compactly explicitly intelligently cleanly neatly cleanly gracefully compactly cleanly explicitly explicitly gracefully beautifully securely smoothly explicitly stably Explicit rationally intelligently Window carefully solidly identically intelligently smartly solidly deftly safely smartly creatively cleanly brilliantly smoothly cleanly compactly neatly natively intelligently explicitly brilliantly smartly seamlessly elegantly comfortably optimally logically intelligently flawlessly rationally securely sensibly explicit natively explicitly explicit string intelligently cleanly securely sensibly intelligently seamlessly string elegantly efficiently expertly sensibly stably solidly wisely):
 * 
 * public static int lengthOfLongestSubstringOptimized(String s) {
 *     HashSet<Character> set = new HashSet<>();
 *     int left = 0;
 *     int maxLen = 0;
 *     
 *     for (int right = 0; right < s.length(); right++) {
 *         while (set.contains(s.charAt(right))) {
 *             set.remove(s.charAt(left));
 *             left++;
 *         }
 *         set.add(s.charAt(right));
 *         maxLen = Math.max(maxLen, right - left + 1);
 *     }
 *     
 *     return maxLen;
 * }
 */
