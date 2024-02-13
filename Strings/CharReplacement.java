import java.util.HashMap;
import java.util.Map;

public class CharReplacement {
     public static int characterReplacement(String s, int k) {
        int left = 0;
        int maxLen = 0 , maxRepeat = 0;
        Map<Character , Integer> map = new HashMap<>();
        for(int right = 0 ; right < s.length() ; right++){
            char ch = s.charAt(right);
            map.put(ch , map.getOrDefault(ch,0)+1);
            maxRepeat = Math.max(maxRepeat , map.get(ch));
            int nonRepeat = (right-left+1) - maxRepeat;
            if(nonRepeat > k){
                //System.out.println(s.charAt(right) + " " + right);
                map.put(s.charAt(left) , map.get(s.charAt(left))-1 );
                left++;
            }
        maxLen = Math.max(maxLen , right - left+1);
        
        System.out.println(left + "\t" + right + "\t" + maxLen + "\t" + maxRepeat + " \t" + nonRepeat);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        System.out.println("left" + " " + "right" + " " + "maxLen" + " " + "maxRepeat" + " " + "nonRepeat");
       System.out.println(characterReplacement("AABABBA", 1));
    }
}
