import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            String frequency = Helper(str);
            //System.out.println(frequency);
            if(map.containsKey(frequency)){
                map.get(frequency).add(str);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(frequency , list);
            }
        }
        System.out.println(map);
    
     return new ArrayList<>(map.values());
    }
    public static String Helper(String str){
        int[] freq = new int[26];
        for(char ch : str.toCharArray()){
            freq[ch-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        char ch = 'a';
        for(int i : freq){
            sb.append(ch++);
            sb.append(i);
        }
        return sb.toString();
    } 
    public static void main(String[] args) {
        String[] arr = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(arr));
    }
}
