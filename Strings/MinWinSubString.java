class MinWinSubString{
    public static String minWindow(String s, String t) {
        String res = "";
        if(s.length() < t.length()) return res;
        int freq[] = new int[128];
        for(char ch : t.toCharArray()){
           freq[ch]++;
        }
        int left = 0 , right = 0;
        int toFound = t.length() , isFound = 0; 
        int maxWindow = Integer.MAX_VALUE;
        char[] arr = s.toCharArray();
        while(right < arr.length){
            char ch = arr[right];
            freq[ch]--;
            if(freq[ch] >=0) {
                isFound++;
            }
            while(isFound == toFound){
               if(maxWindow > (right-left+1)){
                  maxWindow = right-left+1;
                  res =  s.substring(left,right+1);
               }
               freq[arr[left]]++;
               if(freq[arr[left]] > 0){
                   isFound--;
               }
               left++; 
            }
        right++;
        }
    return res;
    }
    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
    }
}