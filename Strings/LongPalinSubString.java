public class LongPalinSubString { 
    public static String longestPalindrome(String s) {
    if(s.length() <=1) return s;

    String LPS = "";

    for(int i=1;i<s.length();i++){
        int low = i , high =i;
        while(s.charAt(low) == s.charAt(high)){
            low--;
            high++;
            if(low == -1 || high == s.length()) break;
        }

     String  res = s.substring(low+1,high);
        if(LPS.length() < res.length()){
            LPS = res;
        }

         low = i-1 ;
          high =i;
        while(s.charAt(low) == s.charAt(high)){
            low--;
            high++;
            if(low == -1 || high == s.length()) break;
        }

        res = s.substring(low+1,high);
        if(LPS.length() < res.length()){
            LPS = res;
        }
    }
return LPS;
}

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
}
