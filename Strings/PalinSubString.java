public class PalinSubString {
   static int count = 1;
    public static int countSubstrings(String s) {
        if(s == null || s.length() == 0) return 0;
        for(int i=1;i<s.length();i++){
            Helper(s,i,i);
            Helper(s,i-1,i);
        }
    return count;
    }

    public static void Helper(String s , int low , int high){
        while(low >=0 && high < s.length() && s.charAt(low) == s.charAt(high) ){
            low--;
            high++;
            count++;
        }
    }
    public static void main(String[] args) {
        System.out.println(countSubstrings("abc"));
    }
}
