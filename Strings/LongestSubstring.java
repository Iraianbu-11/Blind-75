public class LongestSubstring {
   
        public static int lengthOfLongestSubstring(String s) {
            int[] pos = new int[128];
            int start = 0, end = 0 , maxLen = 0;
            
            for (char ch : s.toCharArray())
            {
                start  = Math.max(start, pos[ch]);
                maxLen = Math.max(maxLen, end-start+1);
                pos[ch] = end + 1;
                end++;

            }
        return maxLen;
        }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
