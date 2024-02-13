public class Palindrome {
    public static boolean Helper(char ch){
        if(!Character.isLetterOrDigit(ch)) return true;
    return false;
    }
    public static boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;
        int start = 0 , last = s.length()-1;
        while(start <= last){
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);
            if(Helper(currFirst)) start++;
            else if(Helper(currLast)) last--;
            else{
                if(Character.toLowerCase(currFirst)!=Character.toLowerCase(currLast)) return false;
            start++;
            last--;
            }
        }
        return true;  
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
