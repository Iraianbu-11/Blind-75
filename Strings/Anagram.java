public class Anagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
       int[] arr = new int[26];
       for(int i =0;i<s.length();i++){
           arr[s.charAt(i)-'a']++;
           arr[t.charAt(i)-'a']--;
       }
       for(int i =0; i<arr.length;i++){
           if(arr[i]!=0) return false;
       }
    return true;
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}
